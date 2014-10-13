package GUI;

import java.sql.ResultSet;

import GUI.UserInformation;

public class AuthUser {
	public UserInformation login(String userName, String password)
	{
		ResultSet rs;
		UserInformation u = null;

		try
		{	
				if(password == "nej" && userName == "hej"){
					u = new UserInformation("nej", "hej");
				}				

				else
					u = null;

			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

		return u;
	}

}
