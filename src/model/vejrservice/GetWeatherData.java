package model.vejrservice;

import dme.forecastiolib.ForecastIO;
import dme.forecastiolib.FIOCurrently;

/**
 * Created by jesperbruun on 13/10/14.
 */
public class GetWeatherData {

    // Provide API key from forecast.io - for now this is mine, we have 1000 calls pr. day
    private static final String apiKey = "26202624efd23bdaf480223ac3b97615";

    public void showData() {

        //Get UNIX timestamp for time now.
        long timeNow = System.currentTimeMillis() / 1000L;


        ForecastIO forecast = new ForecastIO(apiKey);
        forecast.setUnits(ForecastIO.UNITS_SI);
        forecast.setTime(String.valueOf(timeNow));
        forecast.getForecast("55.682582", "12.530786"); //Longitude and lattitude for Solbjerg Plads

        //Print out data, for quick console overview of dataformat.
        FIOCurrently currently = new FIOCurrently(forecast);
        System.out.println("\nCurrently\n");
        String [] f  = currently.get().getFieldsArray();
        for(int i = 0; i<f.length;i++)
            System.out.println(f[i]+": "+currently.get().getByKey(f[i]));
        System.out.println("\n");


    }

}
