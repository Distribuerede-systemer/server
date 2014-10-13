import java.io.*;
import java.net.*;

class UDPClient
{
   public static void main(String args[]) throws Exception
   {
	   byte key = 7;
	      
      BufferedReader inFromUser =
         new BufferedReader(new InputStreamReader(System.in));
      DatagramSocket clientSocket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName("");
      byte[] sendData = new byte[1024];
      byte[] receiveData = new byte[1024]; 
      
      String sentence = inFromUser.readLine();
      sendData = sentence.getBytes();
      // System.out.println(sendData[0]);
      System.out.println(sendData[0]^key);
      
      for(int i=0; i<sendData.length; i++) sendData[i]=(byte)(sendData[i]^key);
      
      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 11123);
      clientSocket.send(sendPacket);
      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      clientSocket.receive(receivePacket);
      String modifiedSentence = new String(receivePacket.getData());
      System.out.println("FROM SERVER:" + modifiedSentence);
      clientSocket.close();
   }
}
