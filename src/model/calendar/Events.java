package model.calendar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

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
			ResultSet resultSet = qb.selectFrom("events").all().ExecuteQuery();
			while (resultSet.next())
			{
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