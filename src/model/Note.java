package model;

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
				
}
