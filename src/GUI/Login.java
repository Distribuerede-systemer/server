package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Login extends JPanel {
	private final JLabel lblWelcome = new JLabel("Welcome");
	private final JLabel lblUsername = new JLabel("Username");
	private final JTextField textField = new JTextField();
	private final JLabel lblPassword = new JLabel("Password");
	private final JLabel label = new JLabel("");

	/**
	 * Create the panel.
	 */
	public Login() {
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
		label.setIcon(new ImageIcon("C:\\Users\\Mathias\\Documents\\GitHub\\server\\src\\Images\\background.jpg"));
		label.setBounds(0, 1, 455, 313);
		
		add(label);

	}
}
