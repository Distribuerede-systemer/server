package model;

import java.sql.SQLException;

public class Notes extends Model {
	
	private int noteID;
	private String text;
	private String dateTime;
	
	public Notes(int noteID, String text, String dateTime) {
		super();
		this.noteID = noteID;
		this.text = text;
		this.dateTime = dateTime;
		
	}

	public int getNoteID() {
		return noteID;
	}

	public void setNoteID(int noteID) {
		this.noteID = noteID;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public void saveNote () {
		
		
	}
	
	public void getNote () throws SQLException {
	
		doUpdate("select * from notes;");
		
		
		
		sqlStatement = doQuery("SELECT * FROM table");
			
	}

}
