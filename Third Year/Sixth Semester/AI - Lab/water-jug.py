# Lab 1: Water Jug Problem Using Production Rules (Simple BFS)
# Capacities of Jug A and Jug B
A_capacity = 4
B_capacity = 3
goal = 2
# Initial state
a, b = 0, 0
visited = set()
steps = []
# Function to apply production rules
def get_successors(state):
	a, b = state
	successors = []
	# Rule 1: Fill Jug A
	successors.append((A_capacity, b))
	# Rule 2: Fill Jug B
	successors.append((a, B_capacity))
	# Rule 3: Empty Jug A
	successors.append((0, b))
	# Rule 4: Empty Jug B
	successors.append((a, 0))
	# Rule 5: Pour B into A
	pour = min(b, A_capacity - a)
	successors.append((a + pour, b - pour))
	# Rule 6: Pour A into B
	pour = min(a, B_capacity - b)
	successors.append((a - pour, b + pour))
	return successors
# Simple BFS-like loop
queue = [((0, 0), [])] # (state, path)
while queue:
	(a, b), path = queue.pop(0)
	if a == goal:
		steps = path + [(a, b)]
		break
	if (a, b) in visited:
		continue
	visited.add((a, b))
	for new_state in get_successors((a, b)):
		if new_state not in visited:
			queue.append((new_state, path + [(a, b)]))
# Print solution
if steps:
	print("Solution to get 2L in Jug A:")
	for i, (a, b) in enumerate(steps):
		print(f"Step {i}: Jug A = {a}L, Jug B = {b}L")
else:
	print("No solution found.")