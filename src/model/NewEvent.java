package model;
import java.util.Scanner;

public class NewEvent {
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		Events e = new Events(0, 0, 0, null, null, null, null, null);
		
//		private int eventID;
//		private int type;
//		private int createdBy;
//		private int location;
//		private String start;
//		private String end;
//		private String name;
//		private String text;
		System.out.println("Welcome to event creator");
		System.out.println("Please enter the eventID");
		e.setEventID (input.nextInt()); 
		System.out.println("Please enter the type");
		e.setType(input.nextInt());
		System.out.println("Please enter the CreatedBy");
		e.setCreatedBy(input.nextInt());
		System.out.println("Please enter the Location");
		e.setLocation(input.nextLine());
		System.out.println("Please enter the start  time");
		e.setStart(input.nextLine());
		System.out.println("Please enter the end time");
		e.setEnd(input.nextLine());
		System.out.println("Please enter the name");
		e.setName(input.nextLine());
		System.out.println("Please enter the text");
		e.setText(input.nextLine());
		
	}

}
