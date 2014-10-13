package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class MainMenu extends JPanel {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnLogOut;
	private JLabel lblMainMenu;
	private JButton btnUserAdministration;

	/**
	 * Create the panel.
	 */
	public MainMenu() {
		setLayout(null);
		
		btnNewButton = new JButton("Userlist");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(158, 83, 125, 23);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Eventlist");
		btnNewButton_1.setBounds(158, 117, 125, 23);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Notelist");
		btnNewButton_2.setBounds(158, 151, 125, 23);
		add(btnNewButton_2);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(158, 235, 125, 23);
		add(btnLogOut);
		
		lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMainMenu.setBounds(165, 37, 111, 25);
		add(lblMainMenu);
		
		btnUserAdministration = new JButton("User administration");
		btnUserAdministration.setBounds(158, 185, 125, 23);
		add(btnUserAdministration);

	}
}
