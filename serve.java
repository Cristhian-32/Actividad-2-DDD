import java.io.*;
import java.net.*;

public class serve{
   public static void main(String args[]) throws IOException{
    int port = 6666;
    ServerSocket serverSocket = new ServerSocket(port);
    while(true){
        System.out.print("Esperando conexion"+port+"\n");
        Socket clientSocket = serverSocket.accept();
        InputStream request = clientSocket.getInputStream();
        DataInputStream in = new DataInputStream(request);
        String message = new String(in.readAllBytes());
        System.out.println("Mensaje recibido: "+message);
        }

   } 
}
