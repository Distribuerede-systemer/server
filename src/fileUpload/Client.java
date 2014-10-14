package fileUpload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) throws IOException {
    Socket socket = null;
    String localhost = "127.0.0.1";

    socket = new Socket(localhost, 4444);

    

    
    //typisk lav et interface med WB hvort du har et input felt af typen file
    // vi skal bruge jfilechoose
    File file = new File("C:\\Users\\Mrbauer\\Desktop\\tester2.txt");
    
    
    // Get the size of the file
    long length = file.length();
    
    //1024= 1 kilo byte. vi skal have 20 mb. altsaa --> 1024*1000*20 = 20480000 = 20 mb.  
    //ligger i hukkomelsen via sockets i et byte array. fortaeller java vi vil have et byte array der er ligesaa stort som det du sender
    if (length > 20480000) {
        System.out.println("File is too large.");
    }
    byte[] bytes = new byte[(int) length];
    FileInputStream fis = new FileInputStream(file);
    BufferedInputStream bis = new BufferedInputStream(fis);
    BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());

    int count;

    while ((count = bis.read(bytes)) > 0) {
        out.write(bytes, 0, count);
    }

    out.flush();
    out.close();
    fis.close();
    bis.close();
    socket.close();

}
}