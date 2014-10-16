package databaseMethods;
import java.sql.SQLException;

import DatabaseLogic.*;

public class SwitchMethods
{
	DatabaseConnection  DC = new DatabaseConnection();
	public String createNewCalender (String userName, String calenderName, int privatePublic) throws SQLException
	{
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
	public String deleteCalender (String userName, String calenderName)
	{
		String stringToBeReturned ="";

		return stringToBeReturned;
	}
}
