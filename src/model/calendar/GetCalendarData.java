package model.calendar;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by jesperbruun on 13/10/14.
 */
public class GetCalendarData {


    //Read URL
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


    public void getDataFromCalendar() throws Exception {

        /**
         * Get URL From calendar.cbs.dk -> Subscribe -> change URL to end with .json
         * Encrypt hash from
         */
    	
        String json = readUrl("http://calendar.cbs.dk/events.php/jeha13ad/02a24d4e002e6e3571227c39e2f63784.json");

        Gson gson = new Gson();
        Events events = gson.fromJson(json, Events.class);

        for (int i = 0; i < events.getEvents().size(); i++){
            System.out.println(events.getEvents().get(i).getActivityid());
        }


    }

}
