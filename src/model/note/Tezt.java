package model.note;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

public class Tezt {
	static final String DATABASE_URL = "jdbc:mysql://localhost:3306/matm";
	static final String USERNAME = "root";
	static final String PASSWORD = "1234";

	public static void main(String[] args) {

		
			//Set to null as default value
			Connection con = null;
			Statement stat = null;

			try {
				//establish connection to database
				con = DriverManager.getConnection(DATABASE_URL, USERNAME,
						PASSWORD);
				//creates object to send query to database
				stat = con.createStatement();
				//SQL statement to add a new user with all parameters
				String sqlStatement = String
						.format(Locale.ENGLISH,
								"INSERT 
				//Query is sent to database
				stat.execute(sqlStatement);

			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			} finally {
				try {
					//Closes Statement and Connection to database
					stat.close();
					con.close();
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}

		}
	}

}
