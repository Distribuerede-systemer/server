package GUI;

import model.Model;
import model.user.AuthenticateUser;
import GUI.UserInformation;

public class AuthUser extends Model{
	
	AuthenticateUser au = new AuthenticateUser();
	public UserInformation currentUser;

	
	public UserInformation login(String email, String password) {

		currentUser = null;
		UserInformation tempUser = null;


		try {

			getConn();

			// sets tempUser to the user found on the database
			tempUser = au.getUser(email);

			if (tempUser.getPassword().equals(password)) {
				// if tempUser is of Usertype 1
				if (tempUser.getType() == 1) {
					currentUser = new UserInformation(tempUser.getUserid(), tempUser.getEmail(),
							tempUser.getPassword(), tempUser.getActive(),
							 tempUser.getCreated(),tempUser.getType());
				}// end if statement
					// else if tempUser is of Usertype 2
				else if (tempUser.getType() == 2) {
					currentUser = new UserInformation(tempUser.getUserid(), tempUser.getEmail(),
							tempUser.getPassword(), tempUser.getActive(),
							 tempUser.getCreated(),tempUser.getType());
				}// end else if statement

			}
		} catch (Exception ex) {
			close();
		}

		// }//end if statment
		return currentUser;
	}// end method login


}
