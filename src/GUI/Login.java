package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login extends JPanel {
	private final JLabel lblWelcome = new JLabel("Welcome");
	private final JLabel lblUsername = new JLabel("Username");
	private final JTextField textField = new JTextField();
	private final JLabel lblPassword = new JLabel("Password");
	private final JTextField textField_1 = new JTextField();
	private final JButton btnLogIn = new JButton("Log In");
	private final JButton btnForgotLogIn = new JButton("Forgot log in?");

	/**
	 * Create the panel.
	 */
	public Login() {
		textField_1.setBounds(174, 169, 86, 20);
		textField_1.setColumns(10);
		textField.setBounds(173, 116, 86, 20);
		textField.setColumns(10);
		setLayout(null);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setBounds(177, 11, 93, 25);
		
		add(lblWelcome);
		lblUsername.setBounds(187, 90, 59, 14);
		
		add(lblUsername);
		
		add(textField);
		lblPassword.setBounds(196, 148, 63, 14);
		
		add(lblPassword);
		
		add(textField_1);
		btnLogIn.setBounds(175, 206, 89, 23);
		
		add(btnLogIn);
		btnForgotLogIn.setBounds(173, 240, 97, 23);
		
		add(btnForgotLogIn);

	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public JButton getBtnForgotLogIn() {
		return btnForgotLogIn;
	}
	
	
}
