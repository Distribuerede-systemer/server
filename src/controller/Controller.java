package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Model;

public class Controller extends Model {
	
	private PreparedStatement saveNotes = null;
	

	public Controller() {
		super();
		
		//saving notes
		try {
			saveNotes = conn.prepareStatement("INSERT INTO notes VALUES(?,?);");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	// Metode til at godkende bruger (hardcoded)
	
	public boolean authenticate(String username, String password)
	{
		if(username.equals("username") && password.equals("password"))
			return true;
		else
			return false;
	}
	
// Metoder for Notes
	
	public void saveNotes(String text, String created) {
			
		try {
			saveNotes.setString(4, text);
			saveNotes.setString(5, created);
			saveNotes.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
