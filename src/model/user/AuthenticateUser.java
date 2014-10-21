package model.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import GUI.UserInformation;
import model.QueryBuild.QueryBuilder;

public class AuthenticateUser {

	private ResultSet resultSet;

	private QueryBuilder qb;

	// Metoden faar email og password fra switchen (udtrukket fra en json) samt en boolean der skal saettes til true hvis det er serveren der logger paa, og false hvis det er en klient
	/**
	 * Allows the client to log in
	 * @param email
	 * @param password
	 * @param isAdmin
	 * @return
	 * @throws Exception
	 */
	public int authenticate(String email, String password, boolean isAdmin) throws Exception {

		String[] keys = {"userid", "email", "active", "password"};

		qb = new QueryBuilder();

		// Henter info om bruger fra database via querybuilder
		resultSet = qb.selectFrom(keys, "users").where("email", "=", email).ExecuteQuery();

		// Hvis en bruger med forespurgt email findes
		if (resultSet.next()){

			// Hvis brugeren er aktiv
			if(resultSet.getInt("active")==1)
			{					
				// Hvis passwords matcher
				if(resultSet.getString("password").equals(password))
				{
					int userID = resultSet.getInt("userid");

					String[] key = {"type"};

					resultSet = qb.selectFrom(key, "roles").where("userid", "=", new Integer(userID).toString()).ExecuteQuery();

					// Hvis brugeren baade logger ind og er registreret som admin, eller hvis brugeren baade logger ind og er registreret som bruger
					if((resultSet.getString("type").equals("admin") && isAdmin) || (resultSet.getString("type").equals("user") && !isAdmin))
					{
						return 0; // returnerer "0" hvis bruger/admin er godkendt
					} else {
						return 4; // returnerer fejlkoden "4" hvis brugertype ikke stemmer overens med loginplatform
					}
				} else {
					return 3; // returnerer fejlkoden "3" hvis password ikke matcher
				}
			} else {
				return 2; // returnerer fejlkoden "2" hvis bruger er sat som inaktiv
			}
		} else {
			return 1; // returnerer fejlkoden "1" hvis email ikke findes
		}
	}
	
	public UserInformation getUser(String email) {
		ResultSet rs = null;
		UserInformation user = null;

		// tries to execute the query from selectUser
		try {
			
			rs = qb.selectFrom("users").where(email, "=", email).ExecuteQuery();

			// runs through the rows in the table and gets information needed
			while (rs.next()) {
				int userid = rs.getInt("userid");
				String name = rs.getString("email");
				String pass = rs.getString("password");
				int active = rs.getInt("active");
				String created = rs.getString("created");
				int type = rs.getInt("type");

				user = new UserInformation(userid, name, pass, active, created, type);

			}// end while

		}// end try

		// catches potential SQL errors and closes the connection
		catch (SQLException e) {

			e.printStackTrace();
		}// end catch
		return user;
}
}