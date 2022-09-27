from email import message
import socket

port = 3942
while True:
    clientesocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    clientesocket.connect(('localhost', port))
    message = input("cliente: \n")
    clientesocket.send(message.encode())