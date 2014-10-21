package GUI;

public class UserInformation {

	private int userid;
	private String email;
	private String password;
	private int active;
	private String created;
	private int type;

	public UserInformation(int userid, String email, String password,
			int active, String created, int type) {
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.active = active;
		this.created = created;
		this.type = type;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}

}
