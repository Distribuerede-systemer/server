package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class Login extends JPanel {
	private final JLabel lblWelcome = new JLabel("Welcome");
	private final JLabel lblUsername = new JLabel("Username");
	private final JLabel lblPassword = new JLabel("Password");
	private final JTextField textFieldPassword = new JTextField();
	private final JButton btnLogIn = new JButton("Log In");
	private final JButton btnForgotLogIn = new JButton("Forgot username or password?");
	private final JTextField textFieldUsername = new JTextField();
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblBackground = new JLabel("");
	


	/**
	 * Create the panel.
	 */
	public Login() {
		setSize(new Dimension(1366, 768));
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(105, 105, 105));
		textFieldPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		textFieldPassword.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPassword.setForeground(new Color(0, 0, 0));
		textFieldPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)));
		textFieldPassword.setBounds(642, 438, 164, 42);
		textFieldPassword.setColumns(10);
		setLayout(null);
		lblWelcome.setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setFont(new Font("Iowan Old Style", Font.BOLD, 78));
		lblWelcome.setBounds(460, 169, 346, 107);
		
		add(lblWelcome);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Iowan Old Style", Font.PLAIN, 26));
		lblUsername.setBounds(433, 334, 119, 36);
		
		add(lblUsername);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Iowan Old Style", Font.PLAIN, 26));
		lblPassword.setBounds(441, 438, 111, 36);
		
		add(lblPassword);
		
		add(textFieldPassword);
		btnLogIn.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setBackground(Color.WHITE);
		btnLogIn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textFieldUsername.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsername.setForeground(Color.BLACK);
		textFieldUsername.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)));
		textFieldUsername.setBounds(642, 334, 164, 42);
		
		add(textFieldUsername);
		btnLogIn.setBounds(521, 531, 224, 59);
		
		add(btnLogIn);
		btnForgotLogIn.setForeground(new Color(255, 255, 255));
		btnForgotLogIn.setBorderPainted(false);
		btnForgotLogIn.setBounds(515, 602, 236, 29);
		
		add(btnForgotLogIn);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Images/CBSLogo3.png")));
		lblNewLabel.setBounds(508, 684, 250, 59);
		
		add(lblNewLabel);
		lblBackground.setIcon(new ImageIcon(Login.class.getResource("/Images/MetalBackground.jpg")));
		lblBackground.setSize(new Dimension(1366, 768));
		lblBackground.setBounds(0, 0, 1366, 768);
		
		add(lblBackground);

	}

	public JTextField getTextField() {
		return textFieldUsername;
	}

	public JTextField getTextField_1() {
		return textFieldPassword;
	}

	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public JButton getBtnForgotLogIn() {
		return btnForgotLogIn;
	}
	public void addActionListener(ActionListener l) {
		btnLogIn.addActionListener(l);
		btnForgotLogIn.addActionListener(l);
}

	public JTextField getTextFieldUsername() {
		return textFieldUsername;
	}

	public JTextField getTextFieldPassword() {
		return textFieldPassword;
	}
}