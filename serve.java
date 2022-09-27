import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class serve{
   public static void main(String args[]) throws IOException{
      
    int port = 4000;
    
    ServerSocket serverSocket = new ServerSocket(port);
    System.out.print("Conexion establecida en puerto: "+port+"\n");
    while(true){ 
        Socket clientSocket = serverSocket.accept();
        InputStream request = clientSocket.getInputStream();
        DataInputStream in = new DataInputStream(request);
        String message = new String(in.readAllBytes());
        System.out.println("Nuevo Mensaje desde el cliente: "+message);
        }
   } 
}

