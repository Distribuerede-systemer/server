
import model.Forecast.ForecastModel;
import model.QOTD.QOTDModel;
import model.calendar.Event;
import model.calendar.Events;
import model.note.Note;

import com.google.gson.*;

public class GiantSwitch {
	public String GiantSwitchMethod(String jsonString) {
		//klasser der kaldes
		Event eventKlasse = new Event();
		Events eventsKlasse = new Events();
		Note noteKlasse = new Note();
		ForecastModel forecastKlasse = new ForecastModel();
		QOTDModel QOTDKlasse = new QOTDModel();
		CalendarInfo CI1 = new CalendarInfo();
		
		Gson gson = new GsonBuilder().create();
		String Svar = "";			
		//Creates a switch which determines which method should be used. Methods will be applied later on
		switch (Determine(jsonString)) {
		//If the Json String contains one of the keywords below, run the relevant method.
		
		
		
		/************
		 ** COURSES **
		 ************/
		
		
		
		case "createCourse":
			CI1 = (CalendarInfo)gson.fromJson(jsonString, CalendarInfo.class);
			System.out.println(CI1.getDescription());
			System.out.println(CI1.getEnd());
			System.out.println(CI1.getEventID());
			System.out.println(CI1.getLocation());
			System.out.println(CI1.getStart());
			System.out.println(CI1.getTitle());
			System.out.println(CI1.getType());
			Svar = "Switchen virkede med calendar";
			
			break;

		case "importCourse":
			System.out.println("Recieved importCourse");
			break;

		case "exportCourse":
			System.out.println("Recieved exportCourse");
			break;

		/**********
		 ** LOGIN **
		 **********/
		case "logIn":
			System.out.println("Recieved logIn");
			break;

		case "logOut":
			System.out.println("Recieved logOut");
			break;

		/*************
		 ** CALENDAR **
		 *************/
		case "createCalender":
			System.out.println("Recieved createCalender");
			break;
			
		case "getCalender":
			System.out.println("Recieved getCalender");
			break;

		case "getEvents":
			
			System.out.println("Recieved getEvents");
			break;

		case "saveEvent":
			System.out.println("Recieved saveEvent");
			break;

		case "getEventInfo":
			System.out.println("Recieved getEventInfo");
			break;

		case "saveNote":
			System.out.println("Recieved saveNote");
			break;

		case "getNote":
			System.out.println("Recieved getNote");
			break;
			
		case "deleteNote":
			System.out.println("Recieved deleteNote");
			break;
			
		case "editNote":
			System.out.println("Recieved editNote");
			break;

		/**********
		 ** QUOTE **
		 **********/
		case "getQuote":
			System.out.println("Recieved getQuote");
			break;

		/************
		 ** WEATHER **
		 ************/

		case "requestForecast":
			System.out.println("Recieved requestForecast");
			break;

		case "getForecast":
			System.out.println("Recieved getForecast");
			break;

		case "saveForecast":
			System.out.println("Recieved saveForecast");
			break;

		case "getClientForecast":
			System.out.println("Recieved getClientForecast");
			break;
		
		default:
			System.out.println("Error");
			break;
		}
		return Svar;
	}

	//Creates a loooon else if statement, which checks the JSon string which keyword it contains, and returns the following 
	//keyword if
	public String Determine(String ID) {

		if (ID.contains("getEvents")) {
			return "getEvents";
		} else if (ID.contains("getEventInfo")) {
			return "getEventInfo";
		} else if (ID.contains("saveNote")) {
			return "saveNote";
		} else if (ID.contains("getNote")) {
			return "getNote";
		} else if (ID.contains("deleteNote")){
			return "deleteNote";
		} else if (ID.contains("editNote")){
			return "editNote";
		} else if (ID.contains("requestForecast")) {
			return "requestForecast";
		} else if (ID.contains("getForecast")) {
			return "getForecast";
		} else if (ID.contains("saveForecast")) {
			return "saveForecast";
		} else if (ID.contains("getClientForecast")) {
			return "getClientForecast";
		} else if (ID.contains("createCourse")) {
			return "createCourse";
		} else if (ID.contains("importCourse")) {
			return "importCourse";
		} else if (ID.contains("exportCourse")) {
			return "exportCourse";
		} else if (ID.contains("getQuote")) {
			return "getQuote";
		} else if (ID.contains("requestQuote")) {
			return "requestQuote";
		} else if (ID.contains("saveQuote")) {
			return "saveQuote";
		} else if (ID.contains("logIn")) {
			return "logIn";
		} else if (ID.contains("logOut")) {
			return "logOut";
		} else if (ID.contains("getCalender")) {
			return "getCalender";
		} else if (ID.contains("saveEvent")) {
			return "saveEvent";
		} else if (ID.contains("createCalender")) {
			return "createCalender";
		}

		else
			return "error";
	}

}
