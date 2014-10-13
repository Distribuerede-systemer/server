package model;

import java.util.Calendar;

public class QOTD {
	


	

		public static void main(String[] args) {

			String quotes[] = new String[366];
			
			for(int i  = 0; i < quotes.length; i++){
				quotes[i] = "Quote of the day" + (i+1);
				
			}
			
			Calendar c = Calendar.getInstance();
			
			int quote_index = c.get(Calendar.DAY_OF_YEAR);
			
			String todaysQuote = quotes[quote_index];
			
			System.out.println(todaysQuote);
			
		}

	}

