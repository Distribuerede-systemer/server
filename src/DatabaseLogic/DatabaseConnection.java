package DatabaseLogic;

import java.sql.*;

import javax.swing.JOptionPane;

public class DatabaseConnection
{
	private static String sqlUrl = "jdbc:mysql://localhost:3306/";
	private static String sqlUser = "Asger";
	private static String sqlPasswd = "1darkeldar";
	//private static String sqlDriver = "com.mysql.jdbc.Driver";
	
	private Statement stmt;
	private ResultSet rs;
	private Connection conn = null;
	
	public boolean TestConnection()
    {
    	try
    	{
    		getConnection();
    		doUpdate("use test;");
    		
    		if(conn.isValid(5000))
	    	{
	    		JOptionPane.showMessageDialog(null, "You have succesfully connected to database!");
	    		
	    	}
    	}
    	catch (SQLException e)
    	{
    		System.out.println("Could not connect to database due to:");
    		System.out.println(e.getMessage());
    	}
    	
    	return false;
    }
	
	public boolean authenticateNewCalender(String newCalenderName) throws SQLException
	{
		getConnection();
		boolean authenticate = false;
		
		rs=doQuery("select * from test.calender where Name = '"+newCalenderName+"';");
		while(rs.next())
		{
			authenticate = true;
		}
		return authenticate;
	}
	
	public void createNewCalender (String newCalenderName, String userName, int publicOrPrivate) throws SQLException
	{
		doUpdate("insert into test.calender (Name, Active, CreatedBy, PrivatePublic) VALUES ('"+newCalenderName+"', '1', '"+userName+"', '"+publicOrPrivate+"');");
	}
	public ResultSet doQuery(String query) throws SQLException
    {
    	getConnection();
    	
    	try
    	{
    	stmt = conn.createStatement();
    	rs = stmt.executeQuery(query);
    	}  
    	catch(SQLException ex)
    	{
    		System.out.println(ex);
    		throw ex;
    	}
    	return rs;
    }
    
    public int doUpdate(String Update) throws SQLException
    {
    	getConnection();
    	int temp = 0;
    	
    	try
    	{
    		stmt = conn.createStatement();
    		temp = stmt.executeUpdate(Update);
    	}
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    		if(ex.getErrorCode() == 1062)
    		{
    			throw new SQLException ("Duplicate entry");
    		}
    		else
    		{
    			throw ex;
    		}
    	}
    	
    	finally
    	{
    		if(stmt != null)
    		{
    			try
    			{
    			stmt.close();
    			}
    			catch(SQLException sqlEx)
    			{
    				stmt = null;
    			}
    		}
    	}
    	return temp;
    }
	
	private void getConnection() throws SQLException
    {
    	conn = DriverManager.getConnection(sqlUrl, sqlUser, sqlPasswd);
    }	
}
