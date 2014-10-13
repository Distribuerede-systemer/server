package model.vejrservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.fabric.xmlrpc.base.Array;

public class ACMGetWeatherData {
	// Json parser to retrieve and map data from openweathermap.org
	
	public Array requestForecast() {
      URL url;
      HttpURLConnection conn;
      BufferedReader rd;
      String line;
      String result = "";
      try {
         url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?lat=55.6667&lon=12.5333&cnt=14&mode=json");
         conn = (HttpURLConnection) url.openConnection();
         conn.setRequestMethod("GET");
         rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         while ((line = rd.readLine()) != null) {
            result += line;
         }
         rd.close();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      }
		      		

		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(result);
	
			// get an array from the JSON object
			JSONArray list = (JSONArray) jsonObject.get("list");
						
			Iterator i = list.iterator();
			
			String weatherDescription;
				
			// take each value from the json array separately
			while (i.hasNext()) {
				JSONObject innerObj = (JSONObject) i.next();
				
				Date date = new Date((Long) innerObj.get("dt") * 1000L);
				
				System.out.println(date.toGMTString());
				
				JSONObject temp = (JSONObject) innerObj.get("temp");
				
				double kelvin = (Double) temp.get("day");
				
				double celsius = (kelvin - 273.15);
				
				System.out.println(celsius);
								
				JSONArray subList = (JSONArray) innerObj.get("weather");
				
				Iterator y = subList.iterator();
				
				while (y.hasNext()) {
					JSONObject childObj = (JSONObject) y.next();
					
					weatherDescription = (String) childObj.get("description");
					System.out.println("Vejrbeskrivelse: " + weatherDescription);
					
					
				}
				
			}
		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		return null; // should return an array
	}
}