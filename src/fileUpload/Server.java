package fileUpload;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = null;

    try {
        serverSocket = new ServerSocket(4444);
    } catch (IOException ex) {
        System.out.println("Can't setup server on this port number. ");
    }

    Socket socket = null;
    InputStream is = null;
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    int bufferSize = 0;

    try {
        socket = serverSocket.accept();
    } catch (IOException ex) {
        System.out.println("Can't accept client connection. ");
    }

    try {
        is = socket.getInputStream();

        bufferSize = socket.getReceiveBufferSize();
        System.out.println("Buffer size: " + bufferSize);
    } catch (IOException ex) {
        System.out.println("Can't get socket input stream. ");
    }

    try {
    	
    	//config fil hvor alt saadan noget staar
        fos = new FileOutputStream("tester.txt");
        
        //den gemmer i hukommelsen. Den gemmer loebende biderne i filen i hukommelsen. bum
        bos = new BufferedOutputStream(fos);

    } catch (FileNotFoundException ex) {
    	
    	//hvis den ikke kan arbejde med filen
        System.out.println("File not found. ");
    }

    
    //vi allokerer et bytearray, som har den stoerrelse vi har faaet at vide at filen er.
    byte[] bytes = new byte[bufferSize];

    
    int count;

    //saa laenge input stream modtager data, saa skal vi laese bytes...
    while ((count = is.read(bytes)) >= 0) {
    
    	//...og gemme dem i vores buffered output stream! 
    	bos.write(bytes, 0, count);
    	//start ved sted 0 og skriv i det naeste sted der er plads i output streamen
    }

    //vi lukker // skylder ud igen og goer rent. garbage collection. saa vi frigiver hukommelse
    bos.flush();
    
    //lukker forbindelsen
    bos.close();
    
    //input stream lukker. den som skriver filen
    is.close();
    
    //luk socket
    socket.close();
    
    //luk serversocket
    serverSocket.close();
}
}
