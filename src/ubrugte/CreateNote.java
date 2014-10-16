package ubrugte;

import model.Model;
import model.Notes;

public class CreateNote{
	
	Notes notes;
	
		
	
	
	public Model CreateNote (
			int noteID, 
			String text, 
			String dateTime, 
			String createdBy, 
			boolean isActive, 
			int eventID){
		
			
		notes = new Notes(noteID, text, text, text, isActive, noteID);
		
	
		return notes;
		
	}
}
