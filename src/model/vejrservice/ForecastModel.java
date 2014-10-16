package model.vejrservice;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;

public class ForecastModel {

    // Json parser to retrieve and map data from openweathermap.org
    public String[] stringArray = new String[3];

    public String[] requestForecast(int num_of_days_from_yesterday) {
        URL url;
        HttpURLConnection conn;
        BufferedReader rd;
        String line;
        String weatherDescription;
        String result = "";

        try {
            url = new URL("http://api.openweathermap.org/data/2.5/forecast/daily?lat=55.681589&lon=12.529092&cnt=" + num_of_days_from_yesterday + "&mode=json&units=metric");
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

            // take each value from the json array separately
            while (i.hasNext()) {

                JSONObject innerObj = (JSONObject) i.next();

                Date date = new Date((Long) innerObj.get("dt") * 1000L);
                String string_date = date.toString();

                stringArray[0] = string_date;

                JSONObject temp = (JSONObject) innerObj.get("temp");
                double celsius = (Double) temp.get("day");

                String temperatur = String.valueOf(celsius);

                stringArray[1] = temperatur;

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
        return stringArray;
    }
}