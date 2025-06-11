from queue import PriorityQueue, Queue

# Graph representation
graph = {
    'S': [('A', 1), ('B', 4)],
    'A': [('C', 2), ('D', 5)],
    'B': [('D', 1)],
    'C': [('G', 3)],
    'D': [('G', 2)],
    'G': []
}

# Heuristic values for Greedy and A* search
heuristic = {
    'S': 7,
    'A': 6,
    'B': 5,
    'C': 3,
    'D': 2,
    'G': 0
}

# Breadth-First Search (BFS)
def bfs(start, goal):
    queue = Queue()
    queue.put((start, [start]))
    visited = set()
    print("\nBFS Path:")
    
    while not queue.empty():
        node, path = queue.get()
        if node == goal:
            print(" → ".join(path))
            return
        if node not in visited:
            visited.add(node)
            for neighbor, _ in graph[node]:
                queue.put((neighbor, path + [neighbor]))

# Depth-First Search (DFS)
def dfs(start, goal):
    stack = [(start, [start])]
    visited = set()
    print("\nDFS Path:")
    
    while stack:
        node, path = stack.pop()
        if node == goal:
            print(" → ".join(path))
            return
        if node not in visited:
            visited.add(node)
            for neighbor, _ in reversed(graph[node]):
                stack.append((neighbor, path + [neighbor]))

# Greedy Best-First Search
def greedy(start, goal):
    pq = PriorityQueue()
    pq.put((heuristic[start], start, [start]))
    visited = set()
    print("\nGreedy Best-First Search Path:")
    
    while not pq.empty():
        _, node, path = pq.get()
        if node == goal:
            print(" → ".join(path))
            return
        if node not in visited:
            visited.add(node)
            for neighbor, _ in graph[node]:
                pq.put((heuristic[neighbor], neighbor, path + [neighbor]))

# A* Search
def a_star(start, goal):
    pq = PriorityQueue()
    pq.put((heuristic[start], 0, start, [start]))  # (f = g + h, g, node, path)
    visited = set()
    print("\nA* Search Path:")
    
    while not pq.empty():
        f, g, node, path = pq.get()
        if node == goal:
            print(" → ".join(path))
            return
        if node not in visited:
            visited.add(node)
            for neighbor, cost in graph[node]:
                new_g = g + cost
                new_f = new_g + heuristic[neighbor]
                pq.put((new_f, new_g, neighbor, path + [neighbor]))

# Run all search algorithms
bfs('S', 'G')
dfs('S', 'G')
greedy('S', 'G')
a_star('S', 'G')
