package databaseMethods;
import java.sql.SQLException;

import DatabaseLogic.*;

public class SwitchMethods
{
	DatabaseConnection  DC = new DatabaseConnection();
	
	/**
	 * Allows the client to create a new calendar
	 * @param userName
	 * @param calenderName
	 * @param privatePublic
	 * @return
	 * @throws SQLException
	 */
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
	/**
	 * Allows the client to delete a calendar
	 * @param userName
	 * @param calenderName
	 * @return
	 */
	public String deleteCalender (String userName, String calenderName) throws SQLException
	{
		String stringToBeReturned ="";
		DC.TestConnection();
		stringToBeReturned = DC.deleteCalender(userName, calenderName);

		return stringToBeReturned;
	}
}
