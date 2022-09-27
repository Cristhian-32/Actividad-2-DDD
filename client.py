from email import message
import socket

port = 6666
while True:
    clientesocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    clientesocket.connect(('localhost', port))
    message = input("cliente 1: \n")
    clientesocket.send(message.encode())