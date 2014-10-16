package model.Forecast;

import java.util.ArrayList;

public class ForecastTest {

	// Main metode til at koere en test af vejrudsigt funktionen
    public static void main(String[] args) {

        ForecastModel fm = new ForecastModel();
        ArrayList<Forecast> al = new ArrayList<Forecast>();
       
        for (Forecast f : fm.getForecast()){
        	System.out.println(f.getCelsius());
        	System.out.println(f.getDate());
        	System.out.println(f.getForecast());
        	System.out.println(f.getDesc());
        }
        	
        

    }

}
