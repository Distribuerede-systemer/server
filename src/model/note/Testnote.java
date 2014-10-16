package model.note;
import model.*;

public class Testnote {
	public static void main (String [] args){
		int nID = 0;
		String text = "text";
		String date = "dateTime";
		String cb = "createdBy";
		boolean ia = true;
		int eID = 11;
		
		Note note = new Note();
		note.CreateNote(nID, text, date, cb, ia, eID);
	}
}
