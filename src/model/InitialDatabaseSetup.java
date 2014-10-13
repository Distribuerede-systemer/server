package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseConnect.
 */
public class InitialDatabaseSetup
{

	/** The Constant URL.  Her skal info fra Henrik ind.*/
	private static String URL = "jdbc:mysql://localhost:3306/";
	/** The Constant USERNAME. */
	private static String USERNAME = "root";
	/** The Constant PASSWORD. */
	private static String PASSWORD = "";

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
	private PreparedStatement createTable = null; 
	private PreparedStatement createDatabase = null;
	private PreparedStatement dropDatabase = null;

	public InitialDatabaseSetup() {
		getConnection();
		
		try {
			dropDatabase = connection.prepareStatement("DROP DATABASE IF EXISTS where DATABASE = ?;");
		createDatabase = connection.prepareStatement("CREATE DATABASE calDatabase where ;");
		createTable = connection.prepareStatement("CREATE TABLE calDatabase.Users(name varchar(255));");
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setSelectedDatabase(String db)
    {
    	URL ="jdbc:mysql://localhost:3306/";

    	if(db != null && db.length() > 0)
    		URL += db;
    }
	
    public boolean testConnection()
    {
    	
    	try 
    	{
        	getConnection();
			
        	if(connection.isValid(5000))
				return true;
		} catch (SQLException e) 
		{
			System.out.println("unable to connect to database");
			System.out.println(e.getMessage());
		}
		
		return false;
    }


	 // Instantiates a new database connect.
	 //
	private void getConnection() throws SQLException
	{
			connection = 
					DriverManager.getConnection( URL, USERNAME, PASSWORD );

// Opret her nogle prepareStatements.
//			setBTCrate = connection.prepareStatement(
//					"UPDATE exchangerate SET btcratedkk = ? WHERE ID = 1" );

		} 
	} 
 // end class DatabaseConnect

