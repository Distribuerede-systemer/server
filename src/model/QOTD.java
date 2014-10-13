package model;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class QOTD {

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
            
            //send anmodelse
            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            aSocket.send(request);
            
            //modtager informationer
            byte[] buffer = new byte[1024];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            aSocket.receive(reply);
            
            //udskriv quote. Opdatere hver 24/h
            System.out.println(new String(reply.getData()));
          
        } catch (SocketException e){System.out.println("Socket: " + e.getMessage()); } catch (IOException e){System.out.println("IO: " + e.getMessage());
        } finally { if(aSocket != null) aSocket.close();}
    }
    //Gemme i database
}
