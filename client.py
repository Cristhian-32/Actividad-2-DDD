from email import message
import socket

port = 4000

print("Conectado al servidor en puerto: ", port)

while True:
    clientesocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    clientesocket.connect(('localhost', port))
    message = input("cliente: ")
    clientesocket.send(message.encode())