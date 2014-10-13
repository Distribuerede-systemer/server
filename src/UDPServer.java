import java.io.*;
import java.net.*;

class UDPServer
{
   public static void main(String args[]) throws Exception
      {
         @SuppressWarnings("resource")
		DatagramSocket serverSocket = new DatagramSocket(11123);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
           
            while(true)
               {
            	 byte key = 7;
            	
                  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
              
                  serverSocket.receive(receivePacket);
                  
              	 

                  receiveData = receivePacket.getData();
                  
                  System.out.println("RECEIVED: " + receiveData);   
              
                  for(int i=0; i<receiveData.length; i++) receiveData[i]=(byte)(receiveData[i]^key);
                  
                  String decrypt = new String (receiveData);
                  
                  System.out.println("Decrypted: " + decrypt);   
                  
                  InetAddress IPAddress = receivePacket.getAddress();
                  int port = receivePacket.getPort();
                  String capitalizedSentence = decrypt.toUpperCase();
                  sendData = capitalizedSentence.getBytes();
                  DatagramPacket sendPacket =
                  new DatagramPacket(sendData, sendData.length, IPAddress, port);
                  serverSocket.send(sendPacket);
                  
     
               }
    
      }
}