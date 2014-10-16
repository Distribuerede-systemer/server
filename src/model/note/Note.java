package model.note;

import model.Model;

public class Note extends Model{
	
	NoteModel notes;
			
		public void CreateNote(
			int noteID, 
			String text, 
			String dateTime, 
			String createdBy, 
			boolean isActive, 
			int eventID)	{
			
			notes = new NoteModel(noteID, text, text, text, isActive, noteID);
			
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
		public void DeleteNote (int noteID) {
			
			//SQL deletes note at noteID
			
		}
		public NoteModel GetNote (int noteID){
			
//			notes = new NoteModel(noteID, text, text, text, isActive, noteID);
			//Dette notes object skal dannes af information hentet fra databasen
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
