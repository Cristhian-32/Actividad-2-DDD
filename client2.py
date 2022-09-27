from email import message
import socket

port = 6666
while True:
    clientesocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    clientesocket.connect(('localhost', port))
    message = input("Cliente 2: \n")
    clientesocket.send(message.encode())