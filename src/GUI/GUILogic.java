package GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import GUI.UserInformation;
import GUI.AuthUser;
import javax.swing.JOptionPane;

import GUI.Screen;

public class GUILogic {
	private Screen screen;
	private UserInformation u;
	
	AuthUser a = new AuthUser();
	

	public GUILogic(){
		screen = new Screen();


		screen.getLogin().addActionListener(new LoginActionListener());
		screen.getMainMenu().addActionListener(new MainMenuActionListener());
		screen.getUserInfo().addActionListener(new UserInfoActionListener());
//		screen.getNoteList().addActionListener(new NoteListActionListener());
		screen.getUserList().addActionListener(new UserListActionListener());
		
	}
	public void run() {

		screen.show(Screen.LOGIN);
		screen.setVisible(true);
	}
	
	private class LoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try{
				
			String userName = screen.getLogin().getTextFieldUsername().getText();
			String password = screen.getLogin().getTextFieldPassword().getText();
			u=a.login(userName, password);
			
			if (e.getSource() == screen.getLogin().getBtnLogIn()){
				
				if(u == null){
					JOptionPane.showMessageDialog(null, "\nPlease enter a valid username & password."
							, "Error message",JOptionPane.PLAIN_MESSAGE);
			}

			if	(u != null)
					{
						screen.show(Screen.MAINMENU);
					}
				
	
			}	
			}	
			catch(Exception e3){
			}
		}	
	}
	private class MainMenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == screen.getMainMenu().getBtnLogOut()){
				screen.show(Screen.LOGIN);
			}
			if (e.getSource() == screen.getMainMenu().getBtnUserlist()){
				screen.show(Screen.USERLIST);
			}
			if (e.getSource() == screen.getMainMenu().getBtnNotelist()){
				screen.show(Screen.NOTELIST);
			}
//			if (e.getSource() == screen.getMainMenu().getBtnEventlist()){
//				screen.show(Screen.EVENTLIST);
//			}
			

		}
	}
	private class UserInfoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == screen.getUserInfo().getBtnMainMenu()){
				screen.show(Screen.MAINMENU);
			}
			if (e.getSource() == screen.getUserInfo().getBtnLogout()){
				screen.show(Screen.LOGIN);
			}
			if (e.getSource() == screen.getUserInfo().getBtnSubmit()){
				
			}
		}
	}
//	private class NoteListActionListener implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//
//		}
//	}
	private class UserListActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == screen.getUserList().getBtnMainMenu()){
				screen.show(Screen.MAINMENU);
			}
			if (e.getSource() == screen.getUserList().getBtnLogout()){
				screen.show(Screen.LOGIN);
			}
			if (e.getSource() == screen.getUserList().getBtnAdd()){
			
			}
			if (e.getSource() == screen.getUserList().getBtnDelete()){
				
			}

		}
	}
	
	
}
