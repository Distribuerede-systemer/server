package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * The Class DatabaseConnect.
 */
public class InitialDatabaseSetup {

	/** The Constant URL. Her skal info fra Henrik ind. */
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

	/**
	 * The insert new person. Her skal vi have oprettet vores SQL statements
	 */
	private PreparedStatement createTable = null;
	private String dbname = "BCBSDatabase";
	private PreparedStatement dropDatabase = null;
	private PreparedStatement createDatabase = null;
	private String dD = "Drop Database IF Exists " + dbname + ";";
	private String cD = "CREATE database" + dbname + "";
	private String createTables =

			"SET SESSION FOREIGN_KEY_CHECKS=0;\n" + 
			"\n" + 
			"DROP TABLE Accounts;\n"+ 
			"DROP TABLE Exchange;\n" + 
			"DROP TABLE Transactions;\n" + 
			"DROP TABLE Users;\n" + 
			"\n" + 
			"/* Create Tables */\n" + 
			"\n" + 
			"CREATE TABLE locationdata\n" + 
			"(\n" + 
			"	locationdataid int NOT NULL AUTO_INCREMENT,\n" + 
			"	longitude int NOT NULL,\n" + 
			"	latitude int UNIQUE,\n" + 
			"	PRIMARY KEY (locationdataid)\n" + 
			");\n" + 
			"\n" + 
			"\n" + 
			"CREATE TABLE roles\n" + 
			"(\n" + 
			"	roleid int NOT NULL AUTO_INCREMENT,\n" + 
			"	userid int NOT NULL,\n" + 
			"	type varchar(200) NOT NULL,\n" + 
			"	PRIMARY KEY (roleid)\n" + 
			");\n" + 
			"\n" + 
			"\n" + 
			"CREATE TABLE users\n" + 
			"(\n" + 
			"	userid int NOT NULL AUTO_INCREMENT,\n" + 
			"	email varchar(40) NOT NULL,\n" + 
			"	active boolean,\n" + 
			"	created datetime,\n" + 
			"	PRIMARY KEY (userid)\n" + 
			");\n" + 
			"\n" + 
			"\n" + 
			"CREATE TABLE userevents\n" + 
			"(\n" + 
			"	userid int NOT NULL,\n" + 
			"	eventid int NOT NULL\n" + 
			");\n" + 
			"\n" + 
			"\n" + 
			"CREATE TABLE notes\n" + 
			"(\n" + 
			"	noteid int NOT NULL AUTO_INCREMENT,\n" + 
			"	eventid int NOT NULL,\n" + 
			"	createdby int NOT NULL,\n" + 
			"	text text,\n" + 
			"	created datetime NOT NULL,\n" + 
			"	PRIMARY KEY (noteid)\n" + 
			");\n" + 
			"\n" + 
			"\n" + 
			"CREATE TABLE events\n" + 
			"(\n" + 
			"	eventid int NOT NULL AUTO_INCREMENT,\n" + 
			"	type int NOT NULL,\n" + 
			"	location int,\n" + 
			"	createdby int NOT NULL,\n" + 
			"	start datetime NOT NULL,\n" + 
			"	end datetime NOT NULL,\n" + 
			"	name varchar(0) NOT NULL,\n" + 
			"	text text NOT NULL,\n" + 
			"	PRIMARY KEY (eventid)\n" + 
			");\n" + 
			"\n" + 
			"\n" + 
			"CREATE TABLE weather\n" + 
			"(\n" + 
			"	date datetime NOT NULL UNIQUE,\n" + 
			"	apparentTemperature double,\n" + 
			"	summary text,\n" + 
			"	windspeed double,\n" + 
			"	PRIMARY KEY (date)\n" + 
			");\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"/* Create Foreign Keys */\n" + 
			"\n" + 
			"ALTER TABLE events\n" + 
			"	ADD FOREIGN KEY (location)\n" + 
			"	REFERENCES locationdata (locationdataid)\n" + 
			"	ON UPDATE RESTRICT\n" + 
			"	ON DELETE RESTRICT\n" + 
			";\n" + 
			"\n" + 
			"\n" + 
			"ALTER TABLE userevents\n" + 
			"	ADD FOREIGN KEY (userid)\n" + 
			"	REFERENCES users (userid)\n" + 
			"	ON UPDATE RESTRICT\n" + 
			"	ON DELETE RESTRICT\n" + 
			";\n" + 
			"\n" + 
			"\n" + 
			"ALTER TABLE notes\n" + 
			"	ADD FOREIGN KEY (createdby)\n" + 
			"	REFERENCES users (userid)\n" + 
			"	ON UPDATE RESTRICT\n" + 
			"	ON DELETE RESTRICT\n" + 
			";\n" + 
			"\n" + 
			"\n" + 
			"ALTER TABLE roles\n" + 
			"	ADD FOREIGN KEY (userid)\n" + 
			"	REFERENCES users (userid)\n" + 
			"	ON UPDATE RESTRICT\n" + 
			"	ON DELETE RESTRICT\n" + 
			";\n" + 
			"\n" + 
			"\n" + 
			"ALTER TABLE events\n" + 
			"	ADD FOREIGN KEY (createdby)\n" + 
			"	REFERENCES users (userid)\n" + 
			"	ON UPDATE RESTRICT\n" + 
			"	ON DELETE RESTRICT\n" + 
			";\n" + 
			"\n" + 
			"\n" + 
			"ALTER TABLE notes\n" + 
			"	ADD FOREIGN KEY (eventid)\n" + 
			"	REFERENCES events (eventid)\n" + 
			"	ON UPDATE RESTRICT\n" + 
			"	ON DELETE RESTRICT\n" + 
			";\n" + 
			"\n" + 
			"\n" + 
			"ALTER TABLE userevents\n" + 
			"	ADD FOREIGN KEY (eventid)\n" + 
			"	REFERENCES events (eventid)\n" + 
			"	ON UPDATE RESTRICT\n" + 
			"	ON DELETE RESTRICT\n" + 
			";";

	
	public InitialDatabaseSetup() {
//		setSelectedDatabase(dbname);
		getConnection();
		
		if(!testConnection())
		{
			System.err.println("No database detected. Creating environment");
			
			try
			{
//				setSelectedDatabase(null);
				dropDatabase = connection.prepareStatement(dD);
				createDatabase = connection.prepareStatement(cD);
//				setSelectedDatabase(dbname);
				createTable = connection.prepareStatement(createTables);
			
				System.out.println("Environment has been created");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}	
		}
		else
			System.out.println("Environment exists. No changes have been made");
	}

//	public static void setSelectedDatabase(String db) {
//		URL = "jdbc:mysql://localhost:3306/";
//
//		if (db != null && db.length() > 0)
//			URL += db;
//	}

	public boolean testConnection() {

		try {
			getConnection();

			if (connection.isValid(5000))
				return true;
		} catch (SQLException e) {
			System.out.println("unable to connect to database");
			System.out.println(e.getMessage());
		}

		return false;
	}

	// Instantiates a new database connect.
	//
	private void getConnection() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
// end class DatabaseConnect
