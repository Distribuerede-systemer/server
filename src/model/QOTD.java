package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class QOTD {

    //Connect to server
    private String server_ip = "104.139.50.121";
    private int server_port = 17;
    //Read content

    public QOTD() {

    }

    public static void main(String args[]){
    // args give message contents and server hostname
        DatagramSocket aSocket = null;
        try {
            aSocket = new DatagramSocket();
            byte [] m = new byte[1024];
            InetAddress aHost = InetAddress.getByName("qotd.nngn.net");
            int serverPort = 17;
            System.out.println("Testing 1");

            //send anmodelse
            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            aSocket.send(request);
            System.out.println("Testing 2");

            //modtager informationer
            byte[] buffer = new byte[1024];
            
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            aSocket.receive(reply);
            System.out.println("Testing 2.5");

            byte[] res = reply.getData();
            System.out.println(reply);
            System.out.println("Reply: " + new String(reply.getData()));
            System.out.println(res);
          
            aSocket.receive(reply);
            System.out.println("Testing 3");
            System.out.println("Reply: " + new String(reply.getData()));
        } catch (SocketException e){System.out.println("Socket: " + e.getMessage()); } catch (IOException e){System.out.println("IO: " + e.getMessage());
        } finally { if(aSocket != null) aSocket.close();}
    }
    //Gemme i database
}
