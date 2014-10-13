package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddUserGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblAddNewUser;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblEmail;
	private JTextField UsernameTextField;
	private JTextField PasswordTextField;
	private JTextField EmailTextField;
	private JLabel lblGender;
	private JLabel lblName;
	private JLabel lblStudy;
	private JTextField FirstnameTextField;
	private JTextField ClassTextField;
	private JLabel lblPhonenumber;
	private JRadioButton MaleNewRadioButton;
	private JRadioButton FemaleRadioButton;
	private JTextField PhonenumberTextField;
	private JLabel lblLastname;
	private JTextField LastnameTextField;
	private JButton btnAddUser;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddUserGUI frame = new AddUserGUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AddUserGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAddNewUser = new JLabel("Add new user");
		lblAddNewUser.setBounds(192, 11, 86, 14);
		contentPane.add(lblAddNewUser);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 29, 48, 14);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 54, 46, 14);
		contentPane.add(lblPassword);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 84, 46, 14);
		contentPane.add(lblEmail);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setBounds(81, 26, 86, 20);
		contentPane.add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setBounds(81, 51, 86, 20);
		contentPane.add(PasswordTextField);
		PasswordTextField.setColumns(10);
		
		EmailTextField = new JTextField();
		EmailTextField.setBounds(81, 81, 86, 20);
		contentPane.add(EmailTextField);
		EmailTextField.setColumns(10);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 109, 46, 14);
		contentPane.add(lblGender);
		
		lblName = new JLabel("Firstname");
		lblName.setBounds(10, 139, 47, 14);
		contentPane.add(lblName);
		
		lblStudy = new JLabel("Class");
		lblStudy.setBounds(12, 202, 46, 14);
		contentPane.add(lblStudy);
		
		FirstnameTextField = new JTextField();
		FirstnameTextField.setBounds(81, 140, 86, 20);
		contentPane.add(FirstnameTextField);
		FirstnameTextField.setColumns(10);
		
		ClassTextField = new JTextField();
		ClassTextField.setBounds(81, 199, 86, 20);
		contentPane.add(ClassTextField);
		ClassTextField.setColumns(10);
		
		lblPhonenumber = new JLabel("Phonenumber");
		lblPhonenumber.setBounds(10, 233, 66, 14);
		contentPane.add(lblPhonenumber);
		
		MaleNewRadioButton = new JRadioButton("Mr.");
		MaleNewRadioButton.setBounds(81, 105, 109, 23);
		contentPane.add(MaleNewRadioButton);
		
		FemaleRadioButton = new JRadioButton("Mrs.");
		FemaleRadioButton.setBounds(212, 105, 109, 23);
		contentPane.add(FemaleRadioButton);
		
		PhonenumberTextField = new JTextField();
		PhonenumberTextField.setBounds(81, 230, 86, 20);
		contentPane.add(PhonenumberTextField);
		PhonenumberTextField.setColumns(10);
		
		lblLastname = new JLabel("Lastname");
		lblLastname.setBounds(10, 164, 46, 14);
		contentPane.add(lblLastname);
		
		LastnameTextField = new JTextField();
		LastnameTextField.setBounds(81, 168, 86, 20);
		contentPane.add(LastnameTextField);
		LastnameTextField.setColumns(10);
		
		btnAddUser = new JButton("Add user");
		btnAddUser.setBounds(208, 213, 89, 23);
		contentPane.add(btnAddUser);
	}
	public void addActionListener(ActionListener l) {
		btnAddUser.addActionListener(l);
		
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

	public JTextField getFirstnameTextField() {
		return FirstnameTextField;
	}

	public JTextField getClassTextField() {
		return ClassTextField;
	}

	public JRadioButton getMaleNewRadioButton() {
		return MaleNewRadioButton;
	}

	public JRadioButton getFemaleRadioButton() {
		return FemaleRadioButton;
	}

	public JTextField getPhonenumberTextField() {
		return PhonenumberTextField;
	}

	public JTextField getLastnameTextField() {
		return LastnameTextField;
	}

	public JButton getBtnAddUser() {
		return btnAddUser;
	}
	
}
