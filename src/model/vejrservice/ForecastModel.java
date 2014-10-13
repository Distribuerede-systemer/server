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

public class ForecastModel {
	// Json parser to retrieve and map data from openweathermap.org
    private String[] stringArray;

    public void requestForecast() {
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
                String string_date = date.toString();
                stringArray[0] = string_date;

				JSONObject temp = (JSONObject) innerObj.get("temp");
				
				double kelvin = 300;
				double celsius_double = (kelvin - 273.15);
                String celsius = String.valueOf(celsius_double);
                stringArray[1] = celsius;
								
				JSONArray subList = (JSONArray) innerObj.get("weather");
				
				Iterator y = subList.iterator();
				
				while (y.hasNext()) {
					JSONObject childObj = (JSONObject) y.next();
					
					weatherDescription = (String) childObj.get("description");
                    stringArray[2] = weatherDescription;
					

				}


				
			}
		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

	}
}