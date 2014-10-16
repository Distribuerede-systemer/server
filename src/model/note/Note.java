package model.note;

import java.sql.SQLException;

import model.Model;
import model.QueryBuild.*;

public class Note extends Model{
	
	NoteModel notes;
	QueryBuilder qb;
	
		public void CreateNote(
			int noteID, 
			String text, 
			String dateTime, 
			String createdBy, 
			boolean isActive, 
			int eventID)	{
			
			String activeStatus = "0";
			if (isActive)
				activeStatus = "1";
			
			String[] fields = {"eventID", "createdBy", "text", "dateTime", "isActive"};
			String[] values = {String.valueOf(noteID), text, dateTime, createdBy, activeStatus};
			try {
				qb.insertInto("notes", fields).values(values).Execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			String SqlSave = String.format( ""
//					+ "INSERT INTO notes"
//					+ "VALUES 	(eventID = %.0f,"
//					+ "		createdBy = %s"
//					+ "		text = %s"
//					+ "		dateTime = %s"
//					+ "		isActive = %s)", 
//					eventID, createdBy, text, dateTime, activeStatus);
			
			
//			notes = new NoteModel(noteID, text, text, text, isActive, noteID);
			
			//Insert SQL function
			//Must create note based on note Object
		}
		public void EditNote(int noteID, 
			String text, 
			String dateTime, 
			String createdBy, 
			boolean isActive, 
			int eventID){
			
			notes = new NoteModel(noteID, text, text, text, isActive, noteID);
			//Insert Update SQL function
			//SQL statement must replace the note with equal NoteID with this Note
			//Potentially add edit stamp ?
		}
		public void DeleteNote (int noteID) throws SQLException {
			
			try {
				resultSet = qb.selectFrom("notes").where("noteID", "= ", String.valueOf(noteID)).ExecuteQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				while(resultSet.next()){
					notes = new NoteModel(
							resultSet.getInt("noteID"), 
							resultSet.getString("text"), 
							resultSet.getString("dateTime"), 
							resultSet.getString("createdBy"), 
							resultSet.getBoolean("isActive"), 
							noteID);
					notes.setActive(false);
					
					
				}

			
		}
		public NoteModel GetNote (int noteID){
			
			try {
				resultSet = qb.selectFrom("notes").where("noteID", "= ", String.valueOf(noteID)).ExecuteQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				while(resultSet.next()){
					notes = new NoteModel(
							resultSet.getInt("noteID"), 
							resultSet.getString("text"), 
							resultSet.getString("dateTime"), 
							resultSet.getString("createdBy"), 
							resultSet.getBoolean("isActive"), 
							noteID);
					
					return notes;
				
			
		}
		public void SaveNote (NoteModel note){
			
			String text = note.getText();
			String dateTime = note.getDateTime();
			String createdBy = note.getCreatedBy();
			boolean isActive = note.isActive();
			String activeStatus = "0";
			if (isActive)
				activeStatus = "1";
			int eventID = note.getEventID();
			int noteID = note.getNoteID();
			
			String SqlSave = String.format( ""
					+ "UPDATE notes"
					+ "SET 	eventID = %.0f,"
					+ "		createdBy = %s"
					+ "		text = %s"
					+ "		dateTime = %s"
					+ "		isActive = %s,"
					+ "WHERE noteID = %s", 
					eventID, createdBy, text, dateTime, activeStatus, noteID);
			
		}
				
}
