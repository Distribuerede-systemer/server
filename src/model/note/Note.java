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
			
			String[] fields = {"noteID", "eventID", "createdBy", "text", "dateTime", "Active"};
			String[] values = {String.valueOf(noteID), text, dateTime, createdBy, activeStatus};
			try {
				qb.insertInto("notes", fields).values(values).Execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void DeleteNote (int noteID) throws SQLException {
			
					notes = GetNote(noteID);
					notes.setActive(false);
					SaveNote(notes);
					
				}

		public NoteModel GetNote (int noteID) throws SQLException{
			
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
				}
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
			
			String[] fields = {"eventID", "createdBy", "text", "dateTime", "isActive"};
			String[] values = {String.valueOf(noteID), text, dateTime, createdBy, activeStatus};
			qb.update("notes", fields, values).all();
				
		}
}
