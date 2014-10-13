package model;

public class Events extends Model {
	
	private int eventID;
	private int type;
	private int createdBy;
	private int location;
	private String start;
	private String end;
	private String name;
	private String text;
	
	public Events(int eventID, int type, int createdBy, int location, String start,
			String end, String name, String text) {
		super();
		this.eventID = eventID;
		this.type = type;
		this.createdBy = createdBy;
		this.location = location;
		this.start = start;
		this.end = end;
		this.name = name;
		this.text = text;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public int getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void getEvent () {
		
	}
	
	public void getEventInfo() {
		
	}
	
	public void createCalendar() {
		
	}
	
	

}