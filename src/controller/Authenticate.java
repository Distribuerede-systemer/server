package controller;

import java.sql.SQLException;

import model.Model;

public class Authenticate extends Model {

	private boolean authenticated = false;

	public boolean authenticate(String username, String password)
	{
		try{
			sqlStatement = doQuery("SELECT username AND password FROM users WHERE username = ?");
			sqlStatement.setString(1, username);
			resultSet = sqlStatement.executeQuery();

			if(resultSet.next())
			{
				if(resultSet.getString("username").equals(username) && resultSet.getString("password").equals(password))
				{
					authenticated = true;
				}
			}
			else
			{
				authenticated = false;
			}
		}
		catch(SQLException e){}

		return authenticated;
	}
}
