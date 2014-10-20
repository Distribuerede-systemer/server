package fileUpload;

import java.io.*;
import java.net.*;

 
class Server
{
    public void serverUpload () throws IOException
    {
    	//til at flytte filen fra project folder
    	InputStream inStream = null;
    	OutputStream outStream = null;
    
        // Listen on port 5555 
		ServerSocket server = new ServerSocket(5555);
		
		//accepter socket
        Socket sk = server.accept();
       
        InputStream input = sk.getInputStream();
        BufferedReader inReader = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        BufferedWriter outReader = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
 
        //læser filnavnet som vi vil upload
        String filename = inReader.readLine();
 
        if ( !filename.equals(""))
        {
            outReader.write("READY\n");
            outReader.flush();
        }
 
        //String af directory
        String current = System.getProperty("user.dir");
        
        //ny fil
	 	File xy = new File(current + "/" + filename);
	 	
	 	//til at undgaa for store filer
	    long size = xy.length(); 
	    if (size > 20480000) {
	        System.out.println("File is too large. 20mb is max. styr dig selv");
	    }
	    
	    //streamer til project folder
		FileOutputStream wr = new FileOutputStream(xy);
        byte[] buffer = new byte[sk.getReceiveBufferSize()];
        int bytesReceived = 0;
 
        //laeser bytes
        while((bytesReceived = input.read(buffer))>0)
        {
        
        //Skriver filen
        wr.write(buffer,0,bytesReceived);
          
        }
       
       //nu er filen skrevet til project folder. Vi skal nu flytte/kopiere den til upload folder i res\\Uploads\\ 
        try{
        	    
    	    File File1 =new File(current + "/" + filename);
    	    File File2 =new File("res\\Uploads\\"+filename);
  	       
    	    //original filen
    	    inStream = new FileInputStream(File1);
    	    //ny 
    	    outStream = new FileOutputStream(File2);
    	    
    	    byte[] buff = new byte[1024];
 
    	    int length;
    	  
    	    while ((length = inStream.read(buff)) > 0){
    	    	outStream.write(buffer, 0, length);
    	    }
    	    //Vi lukker hele biksen, foer vi kan slette den gamle fil
    	    inStream.close();
    	    outStream.close();
    	    wr.flush();  	    
    	    //lukker forbindelsen
    	    wr.close();    	    
    	    //input stream lukker. den som skriver filen
    	    input.close();    	    
    	    //luk socket
    	    sk.close();   	    
    	    //luk serversocket
    	    server.close();
    	    //sletter originalen så vi ikke har 2
    	    File1.delete();
    	    
    	}catch(IOException e){
    	    e.printStackTrace();
    	}
    }
  }
