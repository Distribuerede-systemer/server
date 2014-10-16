package ubrugte;
import CalendarInfo;

import java.io.*;
import java.net.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TCPClienten {
	public static void main(String[] args) throws Exception {
		
		String modifiedSentence;

		Gson gson = new GsonBuilder().create();
		CalendarInfo CI = new CalendarInfo();
		
		
		CI.setDescription("Programmering");
		CI.setEventID("12hej");
		CI.setLocation("SP");
		System.out.println(CI.getEventID());
		String gsonString = gson.toJson(CI);
		System.out.println(CI);
		System.out.println(gsonString);

		
		Socket clientSocket = new Socket("localhost", 8888);

		DataOutputStream outToServer = new DataOutputStream(
				clientSocket.getOutputStream());
		
		byte[] input = gsonString.getBytes();
		
		byte key = (byte) 3.1470;

		byte[] encrypted = input;

		for (int i=0; i<encrypted.length; i++) encrypted[i] = (byte) (encrypted[i] ^ key);

		
		outToServer.write(encrypted);
		outToServer.flush();
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
		modifiedSentence = inFromServer.readLine();
		System.out.println(modifiedSentence);
		System.out.println("FROM SERVER: " + CI.getDescription());
		
		clientSocket.close();
	}

}
