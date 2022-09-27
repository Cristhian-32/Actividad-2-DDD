import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class serve{
   public static void main(String args[]) throws IOException{
    int port = 3942;
    ServerSocket serverSocket = new ServerSocket(port);
    while(true){
        System.out.print("Conexion establecida en puerto: "+port+"\n");
        Socket clientSocket = serverSocket.accept();
        InputStream request = clientSocket.getInputStream();
        DataInputStream in = new DataInputStream(request);
        String message = new String(in.readAllBytes());
        System.out.println("Nuevo Mensaje: "+message);
        }
   } 
}
