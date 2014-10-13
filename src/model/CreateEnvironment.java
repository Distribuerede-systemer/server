package model;

import java.sql.SQLException;

public class CreateEnvironment {

		private InitialDatabaseSetup ids;
		private final String dbName = "Caldatabase";
		
		public CreateEnvironment()
		{
			ids = new InitialDatabaseSetup();
			ids.setSelectedDatabase(dbName);
			
			if(!ids.testConnection())
			{
				System.err.println("No database detected. Creating environment");
				
				try
				{
					ids.setSelectedDatabase(null);
					createDatabase();
					ids.setSelectedDatabase(dbName);
					
					createTables();
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
		
//		private void createDatabase() throws SQLException
//		{
//			String sqlDrop = "DROP DATABASE IF EXISTS "+ dbName + ";";
//			String sqlCreate = "CREATE DATABASE calDatabase";
//			
//			ids.doUpdate(sqlDrop);
//			ids.doUpdate(sqlCreate);
//
//			
//		}
//		
//		private void createTables() throws SQLException
//		{
//		    String sqlCreateTable = "CREATE TABLE calDatabase.Users(name varchar(255));";
//		    
//			ids.doUpdate(sqlCreateTable);
//
//		}
	}


