package model.note;
import java.sql.SQLException;

import model.*;

public class Testnote {
	public static void main (String [] args) throws SQLException{
		int nID = 3;
		String text = "penis";
		String date = "1000-01-01 00:00:00";
		String cb = "createdBy din mor haha";
		int ia = 1;
		int eID = 11;
		
		Note note = new Note();
		note.CreateNote(nID, text, date, cb, ia, eID);
		note.DeleteNote(nID);
	}
}
