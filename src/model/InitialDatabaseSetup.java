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

// Opret her nogle prepareStatements.
			setBTCrate = connection.prepareStatement(
					"UPDATE exchangerate SET btcratedkk = ? WHERE ID = 1" );

		} 
		catch ( SQLException sqlException )
		{
			sqlException.printStackTrace();
			System.exit( 1 );
		} 
	} 


	
	}
} // end class DatabaseConnect

