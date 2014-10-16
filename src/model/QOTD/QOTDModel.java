package model.QOTD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;




import model.QueryBuild.QueryBuilder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class QOTDModel {

	private ArrayList<QOTD> qotdlist = new ArrayList<>();
	
	QOTD qotdlist2 = new QOTD(null, null, null);
    QueryBuilder qb = new QueryBuilder();
    
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
    
     	public void getQuote() {

            /**
             * getting text from website and putiing into string
             * Making a new object of JSON, and prints out quote
             */
            String json;
			try {
				json = readUrl("http://dist-sso.it-kartellet.dk/quote/");
			
            
    			JSONParser jsonParser = new JSONParser();
    			JSONObject jsonObject = (JSONObject) jsonParser.parse(json);
    			
    			String quote = (String) jsonObject.get("quote");
    			String author = (String) jsonObject.get("author");
    			String topic = (String) jsonObject.get("topic");
    			qotdlist2 = new QOTD(quote, author, topic);
    	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    			
    }
    //Gemme i database
     	public void saveQuote() {
			getQuote();
			
			String[] keys = {"date","apparentTemperature","summary","windspeed","qotd"};
			String[] keys2 = {"'2014-01-01 23:22:01'", "21", "'hej'", "12", "'hej'"};

			qb.insertInto("dailyupdates",keys).values(keys2);
     	}
}
