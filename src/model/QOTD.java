package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class QOTD {

    //Connect to server
    private String server_url = "djxmmx.net";
    private int server_port = 17;
    //Read content
    
    public static void main (String[] args) throws Exception
	{
    
    BufferedReader inFromUser = 
			new BufferedReader ( new InputStreamReader(System.in));
	DatagramSocket clientSocket = new DatagramSocket();
	InetAddress IPAddress = InetAddress.getByName("localhost");
	byte [] sendData = new byte [1024];
	byte[] receiveData = new byte [1024];
	String sentence = inFromUser.readLine();
	sendData = sentence.getBytes();
	
	DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 7000);
	clientSocket.send(sendPacket);
	DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	clientSocket.receive(receivePacket);
	String modifiedSentence = new String (receivePacket.getData());
	System.out.println("FROM SERVER:"+ modifiedSentence);
	clientSocket.close();
    //Gemme i database

}
}
