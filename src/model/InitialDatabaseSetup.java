/*
 * 
 */
package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseConnect.
 */
public class InitialDatabaseSetup
{

	/** The Constant URL.  Her skal info fra Henrik ind.*/
	private static final String URL = "jdbc:mysql://localhost:3306/bcbs_light";

	/** The Constant USERNAME. */
	private static final String USERNAME = "root";

	/** The Constant PASSWORD. */
	private static final String PASSWORD = "";

	/** The connection. */
	public Connection connection;

	/** The statement. */
	public Statement statement;

	/** The result set. */
	public ResultSet resultSet;

	/** The meta data. */
	public ResultSetMetaData metaData;

	/** The number of rows. */
	public int numberOfRows;


	/** The insert new person. 
	Her skal vi have oprettet vores SQL statements*/
	private PreparedStatement insertEnTabel = null; 


	 * Instantiates a new database connect.
	 */
	public DatabaseConnect()
	{
		try 
		{
			connection = 
					DriverManager.getConnection( URL, USERNAME, PASSWORD );

			setBTCrate = connection.prepareStatement(
					"UPDATE exchangerate SET btcratedkk = ? WHERE ID = 1" );

			getBTCRate = connection.prepareStatement(
					"SELECT btcratedkk FROM exchangerate");

			getUserById = 
					connection.prepareStatement( "SELECT * FROM user WHERE IDMail = ?" );

			// create insert that adds a new user into the database
			insertNewPerson = connection.prepareStatement( 
					"INSERT INTO user " + 
							"( IDMail, firstName, lastName, userAdress, zipCode,"
							+ "userAge, userPhone, userBTCBalance, Password, isAdmin  ) " + 
					"VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )" );

			// create an edit that edits a user in the database
			editPerson = connection.prepareStatement( "UPDATE user SET firstName = ?, lastName = ?, userAdress = ?, zipCode = ?,"
					+ " userAge = ?, userPhone = ?, userBTCBalance = ?, Password = ?, isAdmin = ? WHERE IDMail = ?");




		} 
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
			System.exit( 1 );
		} 
	} 

	// Add a new person
	/**
	 * Adds the person.
	 *
	 * @param mail the mail
	 * @param fname the fname
	 * @param lname the lname
	 * @param uadress the uadress
	 * @param uzip the uzip
	 * @param uage the uage
	 * @param uphone the uphone
	 * @param uBTCBalance the u btc balance
	 * @param upass the upass
	 * @param admin the admin
	 * @return the int
	 */
	public int addPerson( 
			String mail, String fname, String lname, String uadress, int uzip, 
			int uage, String uphone, double uBTCBalance, String upass, boolean admin)
	{
		int result = 0;
		// set parameters, then execute insertNewPerson
		try 
		{
			insertNewPerson.setString(1, mail );
			insertNewPerson.setString( 2, fname );
			insertNewPerson.setString( 3, lname );
			insertNewPerson.setString( 4, uadress );
			insertNewPerson.setInt( 5, uzip );
			insertNewPerson.setInt( 6, uage );
			insertNewPerson.setString( 7, uphone );
			insertNewPerson.setDouble( 8, uBTCBalance );
			insertNewPerson.setString( 9, upass );
			insertNewPerson.setBoolean( 10, admin);

			// insert the new entry; returns # of rows updated
			result = insertNewPerson.executeUpdate(); 
		} // end try
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
			close();
		} // end catch

		return result;
	} // end method addPerson

	/**
	 * Edits the person.
	 *
	 * @param mail the mail
	 * @param fname the fname
	 * @param lname the lname
	 * @param uadress the uadress
	 * @param uzip the uzip
	 * @param uage the uage
	 * @param uphone the uphone
	 * @param uBTCBalance the u btc balance
	 * @param upass the upass
	 * @param admin the admin
	 * @return the int
	 */
	public int editPerson( 
			String mail, String fname, String lname, String uadress, int uzip, 
			int uage, String uphone, double uBTCBalance, String upass, boolean admin)
	{
		int result = 0;

		try 
		{
			editPerson.setString( 1, fname );
			editPerson.setString( 2, lname );
			editPerson.setString( 3, uadress );
			editPerson.setInt( 4, uzip );
			editPerson.setInt( 5, uage );
			editPerson.setString( 6, uphone );
			editPerson.setDouble( 7, uBTCBalance );
			editPerson.setString( 8, upass );
			editPerson.setBoolean( 9, admin);
			editPerson.setString(10, mail );
			// insert the new entry; returns # of rows updated
			result = editPerson.executeUpdate(); 
		} // end try
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
			close();
		} // end catch

		return result;
	} // end method editPerson


	/**
	 * Adds the btc rate.
	 *
	 * @param btcrate the btcrate
	 * @return the int
	 */
	public int addBTCRate( 
			double btcrate)
	{
		int result = 0;

		// set parameters, then execute insertNewPerson
		try 
		{
			setBTCrate.setDouble ( 1, btcrate);

			// insert the new entry; returns # of rows updated
			result = setBTCrate.executeUpdate(); 
		} // end try
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
			close();
		} // end catch

		return result;
	} // end method addBTCRate

	/**
	 * Gets the BTC rate.
	 *
	 * @return the BTC rate
	 */
	public double getBTCRate() {

		ResultSet result;
		double currentBTCRate = 0.0;
		// set parameters, then execute getBTCRate
		try 
		{
			result = getBTCRate.executeQuery();
			while (result.next()) {
				currentBTCRate = result.getDouble(1);	
			}
		}
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
			close();
		}

		return currentBTCRate;
	}


	// close the database connection
	/**
	 * Close.
	 */
	public void close()
	{
		try 
		{
			connection.close();
		} // end try
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
		} // end catch
	} // end method close

	/**
	 * Does user by id exist.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	public boolean doesUserByIDExist(String id) {
		ResultSet result;
		boolean hasRows = false;
		try
		{
			getUserById.setString(1, id);
			result = getUserById.executeQuery();
			while(result.next()) {
				hasRows = true;
			}

			if(!hasRows)
				return false;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			close();
			return false;
		}
		return true;
	}

	/**
	 * Gets the user by id.
	 *
	 * @param id the id
	 * @return the user by id
	 */
	public User getUserByID(String id) {

		ResultSet result;
		User u = null;
		// set parameters, then execute getUserByID
		try 
		{
			getUserById.setString ( 1, id);

			// insert the new entry; returns # of rows updated
			result = getUserById.executeQuery(); 

			while (result.next()) {
				u = new User(result.getString("IDMail"), result.getString("firstName"), result.getString("lastName"), result.getString("userAdress"),
						result.getInt("zipCode"), result.getString("userPhone"), result.getInt("userAge")
						, result.getDouble("userBTCBalance"), result.getString("Password"), result.getBoolean("isAdmin") );

			}
		} // end try
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
			close();
		} // end catch

		return u;

		// TODO Auto-generated method stub

	}
} // end class DatabaseConnect

