package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;


public class QOTDModel {

	private ArrayList<QOTD> QOTDlist = new ArrayList<>();
    
    /**
     *
     */ 
    
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
 
    }
    
     	public static void main(String args[]) throws Exception {

            /**
             * getting text from website and putiing into string
             * Making a new object of JSON, and prints out quote
             */
            String json = readUrl("http://dist-sso.it-kartellet.dk/quote/");
            
    			JSONParser jsonParser = new JSONParser();
    			JSONObject jsonObject = (JSONObject) jsonParser.parse(json);
    			
    			System.out.println(jsonObject.get("quote"));
    			String quote = (String) jsonObject.get("quote");
    			System.out.println(jsonObject.get("author"));
    			System.out.println(jsonObject.get("topic"));
    	
    			
    }
    //Gemme i database
     	public void saveQuote() {
     		
     	}
}
