public class Client {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) throws IOException {
    Socket socket = null;
    String host = "127.0.0.1";

    socket = new Socket(host, 4444);

    File file = new File("M:\\test.xml");
    // Get the size of the file
    long length = file.length();
    if (length > Integer.MAX_VALUE) {
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
