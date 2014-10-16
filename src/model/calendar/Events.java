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
				varchar(0) nameEvent = rs.getVarchar("name");
				"	name varchar(0) NOT NULL,\n" + 
				"	text text NOT NULL,\n" + 
				"	PRIMARY KEY (eventid)\n" + 
				
				events.add(new Event());
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
}