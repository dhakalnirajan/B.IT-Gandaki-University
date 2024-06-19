from socket import *

# Server information
server_ip = "127.0.0.1"  # Replace with the server IP address
server_port = 12000  # Replace with the server port

# Create a TCP socket
client_socket = socket(AF_INET, SOCK_STREAM)

# Connect to the server
client_socket.connect((server_ip, server_port))

# Send data to the server
message = "Hello, server!"
client_socket.send(message.encode())

# Receive data from the server
response = client_socket.recv(1024)
print("Server response:", response.decode())

# Close the connection
client_socket.close()
