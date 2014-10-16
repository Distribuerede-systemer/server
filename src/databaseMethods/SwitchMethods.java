package databaseMethods;
import java.sql.SQLException;

import DatabaseLogic.*;

public class SwitchMethods
{
	public String createNewCalender (String userName, String calenderName, int privatePublic) throws SQLException
	{
		DatabaseConnection  DC = new DatabaseConnection();
		String stringToBeReturned ="";
		DC.TestConnection();
		if(DC.authenticateNewCalender(calenderName) == false)
		{
			DC.createNewCalender(calenderName, userName, privatePublic);
			stringToBeReturned = "The new calender has been created!";
		}
		else
		{
			stringToBeReturned = "The new calender has not been created!";
		}
		
		
		return stringToBeReturned;
		
	}
}
