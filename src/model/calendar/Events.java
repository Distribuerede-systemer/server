package model.calendar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import model.QueryBuild.QueryBuilder;

/**
 * Created by jesperbruun on 10/10/14.
 * Den laver selve arrayet af alle generede Event
 */
public class Events {
    ArrayList<Event> events = new ArrayList<Event>();

    public ArrayList<Event> getEvents() {
    	QueryBuilder qb = new QueryBuilder();
    	try {
			ResultSet rs = qb.selectFrom("events").all().ExecuteQuery();
			while (rs.next())
			{
				//String values from SQL database (must be created)
				int eventID = rs.getInt("eventid");
				int type = rs.getInt("type");
				int location = rs.getInt("location");
				int createdby = rs.getInt("createdby");
				
				
				Date startDate = rs.getDate("start");
				Time startTime = rs.getTime("start");
				
				Date endDate = rs.getDate("end");
				Time endTime = rs.getTime("end");
				
				String nameEvent = rs.getString("name");
				String text = rs.getString("text");
				
				String stringEventID = String.valueOf(eventID);
				String stringType = String.valueOf(type);
				String stringLocation = String.valueOf(location);
				String stringCreatedby = String.valueOf(createdby);
				String stringStartDate = String.valueOf(startDate);
				String stringStartTime = String.valueOf(startTime);				
				String stringEndDate = String.valueOf(endDate);
				String stringEndTime = String.valueOf(endTime);
				
				ArrayList<String> alStart = new ArrayList<String>();
				alStart.add(stringStartDate + "" + stringStartTime);
				
				ArrayList<String> alEnd = new ArrayList<String>();
				alEnd.add(stringEndDate + "" + stringEndTime);
				
				
				System.out.println(String.valueOf(startDate.getTime()));
				
				events.add(new Event(stringEventID, stringEventID, stringType, stringType, stringLocation, stringLocation,stringCreatedby, alStart, alEnd));				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return events;
    }

    public void setEvents(ArrayList<Event> event) {
        this.events = event;
    }
    
    // Konverterer array events til en tekst streng
    @Override
    public String toString() {
        return Arrays.toString(events.toArray());
    }
    
    public static void main(String []args){
    	Events Hej = new Events();
    	
    	Hej.getEvents();
    	System.out.println(Hej.toString());
    }
}