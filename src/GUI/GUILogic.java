package GUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



import javax.swing.JOptionPane;

import GUI.Screen;

public class GUILogic {
	private Screen screen;

	public GUILogic(){
		screen = new Screen();


		screen.getLogin().addActionListener(new LoginActionListener());
		screen.getMainMenu().addActionListener(new MainMenuActionListener());
		screen.getUserInfo().addActionListener(new UserInfoActionListener());
		screen.getNoteList().addActionListener(new NoteListActionListener());
		screen.getUserList().addActionListener(new UserListActionListener());
		
	}
	private class LoginActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == screen.getLogin().getBtnLogIn()){
				screen.show(Screen.MAINMENU);
			}
		}	
	}
	private class MainMenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}
	private class UserInfoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}
	private class NoteListActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}
	private class UserListActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

		}
	}
	
	
}
