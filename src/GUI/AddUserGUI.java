package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddUserGUI extends JPanel {
	private JLabel lblAddUser;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblEmail;
	private JLabel lblPhonenumber;
	private JLabel lblClass;
	private JTextField UsernameTextField;
	private JTextField PasswordTextField;
	private JTextField EmailTextField;
	private JTextField PhonenumberTextField;
	private JTextField ClassTextField;
	private JButton btnAddUser;
	private JButton btnLogOut;
	private JButton btnMainMenu;

	/**
	 * Create the panel.
	 */
	public AddUserGUI() {
		setLayout(null);
		
		lblAddUser = new JLabel("Add user");
		lblAddUser.setBounds(184, 11, 43, 14);
		add(lblAddUser);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(27, 37, 48, 14);
		add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(27, 70, 46, 14);
		add(lblPassword);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(27, 107, 46, 14);
		add(lblEmail);
		
		lblPhonenumber = new JLabel("Phonenumber");
		lblPhonenumber.setBounds(27, 146, 66, 14);
		add(lblPhonenumber);
		
		lblClass = new JLabel("Class");
		lblClass.setBounds(27, 182, 46, 14);
		add(lblClass);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setBounds(110, 36, 86, 20);
		add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setBounds(110, 67, 86, 20);
		add(PasswordTextField);
		PasswordTextField.setColumns(10);
		
		EmailTextField = new JTextField();
		EmailTextField.setBounds(110, 104, 86, 20);
		add(EmailTextField);
		EmailTextField.setColumns(10);
		
		PhonenumberTextField = new JTextField();
		PhonenumberTextField.setBounds(110, 143, 86, 20);
		add(PhonenumberTextField);
		PhonenumberTextField.setColumns(10);
		
		ClassTextField = new JTextField();
		ClassTextField.setBounds(110, 179, 86, 20);
		add(ClassTextField);
		ClassTextField.setColumns(10);
		
		btnAddUser = new JButton("Add User");
		btnAddUser.setBounds(87, 266, 89, 23);
		add(btnAddUser);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(285, 266, 89, 23);
		add(btnLogOut);
		
		btnMainMenu = new JButton("Main menu");
		btnMainMenu.setBounds(186, 266, 89, 23);
		add(btnMainMenu);

	}
}
