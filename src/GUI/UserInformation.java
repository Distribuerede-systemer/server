package GUI;

// Fig. 28.30: Person.java
// Person class that represents an entry in an address book.
public class UserInformation
{
  
   private String userName;
   private String password;
  

   // no-argument constructor
   public UserInformation()
   {
   } // end no-argument Person constructor

   // constructor
   public UserInformation(  String user, String pass )
   {
	   
//      setUserid(id);
     
      setUserName ( user );
      setPassword ( pass );
      

   } 




public String getUserName() {
	return userName;
}

public void setUserName(String user) {
	userName = user;
}

public String getPassword() {
	return password;
}

public void setPassword(String pass) {
	password = pass;
}

}



 