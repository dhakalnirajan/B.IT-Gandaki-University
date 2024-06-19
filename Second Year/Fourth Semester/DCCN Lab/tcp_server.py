import socket

# Define the server's IP address and port
SERVER_IP = "127.0.0.1"
SERVER_PORT = 12000

# Create a TCP socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Bind the socket to the IP address and port
server_socket.bind((SERVER_IP, SERVER_PORT))

# Listen for incoming connections
server_socket.listen()

print(f"Server listening on {SERVER_IP}:{SERVER_PORT}")

while True:
    # Accept a client connection
    client_socket, client_address = server_socket.accept()
    print(f"Accepted connection from {client_address[0]} : {client_address[1]}")

    # Receive data from the client
    data = client_socket.recv(1024).decode()
    print(f"Received data: {data}")

    # Send a response back to the client
    response = "Hello from the server!"
    client_socket.send(response.encode())

    # Close the client socket
    client_socket.close()
