package GUI;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class AddUserGUI extends JPanel {
	private JLabel lblAddUser;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblEmail;
	private JLabel lblPhonenumber;
	private JLabel lblClass;
	private JTextField UsernameTextField;
	private JTextField EmailTextField;
	private JTextField ClassTextField;
	private JButton btnAddUser;
	private JButton btnLogOut;
	private JButton btnMainMenu;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField PhonenumberTextField;
	private JPasswordField PasswordTextField;

	/**
	 * Create the panel.
	 */
	public AddUserGUI() {
		setLayout(null);
		
		PasswordTextField = new JPasswordField();
		PasswordTextField.setBounds(268, 168, 168, 39);
		add(PasswordTextField);
		
		PhonenumberTextField = new JTextField();
		PhonenumberTextField.setColumns(10);
		PhonenumberTextField.setBounds(268, 281, 167, 39);
		add(PhonenumberTextField);
		
		lblAddUser = new JLabel("Add user");
		lblAddUser.setBounds(287, 8, 134, 78);
		add(lblAddUser);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(59, 117, 142, 32);
		add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(59, 168, 168, 39);
		add(lblPassword);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(59, 227, 179, 39);
		add(lblEmail);
		
		lblPhonenumber = new JLabel("Phonenumber");
		lblPhonenumber.setBounds(59, 284, 200, 33);
		add(lblPhonenumber);
		
		lblClass = new JLabel("Class");
		lblClass.setBounds(59, 333, 163, 33);
		add(lblClass);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setBounds(268, 114, 167, 40);
		add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		EmailTextField = new JTextField();
		EmailTextField.setBounds(268, 227, 167, 39);
		add(EmailTextField);
		EmailTextField.setColumns(10);
		
		ClassTextField = new JTextField();
		ClassTextField.setBounds(268, 333, 167, 40);
		add(ClassTextField);
		ClassTextField.setColumns(10);
		
		btnAddUser = new JButton("Add User");
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddUser.setBounds(33, 416, 194, 23);
		add(btnAddUser);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(540, 416, 161, 23);
		add(btnLogOut);
		
		btnMainMenu = new JButton("Main menu");
		btnMainMenu.setBounds(248, 416, 266, 23);
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnMainMenu);
		lblNewLabel.setIcon(new ImageIcon(AddUserGUI.class.getResource("/Images/MetalBackground.jpg")));
		lblNewLabel.setBounds(0, 0, 754, 553);
		add(lblNewLabel);

	}
	public void addActionListener(ActionListener l) {
		btnLogOut.addActionListener(l);
		btnAddUser.addActionListener(l);
		btnMainMenu.addActionListener(l);
		
	}
	public JTextField getUsernameTextField() {
		return UsernameTextField;
	}
	public JTextField getPasswordTextField() {
		return PasswordTextField;
	}
	public JTextField getEmailTextField() {
		return EmailTextField;
	}
	public JTextField getPhonenumberTextField() {
		return PhonenumberTextField;
	}
	public JTextField getClassTextField() {
		return ClassTextField;
	}
	public JButton getBtnAddUser() {
		return btnAddUser;
	}
	public JButton getBtnLogOut() {
		return btnLogOut;
	}
	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}
}
