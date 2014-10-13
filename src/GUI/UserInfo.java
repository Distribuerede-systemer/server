package GUI;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInfo extends JPanel {
	private JTextField txtField_UserID;
	private JTextField txtField_Email;
	private JTextField txtField_Team;
	private JTextField txtField_CreatedDate;
	private JButton btnSubmit;
	private JButton btnMainmenu;
	private JButton btnLogout;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public UserInfo() {
		setSize(new Dimension(1366, 768));
		setLayout(null);

		JLabel lblHeader = new JLabel("User Info");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(173, 27, 85, 34);
		add(lblHeader);

		txtField_UserID = new JTextField();
		txtField_UserID.setText("GetUserID");
		txtField_UserID.setName("");
		txtField_UserID.setBounds(212, 96, 111, 20);
		add(txtField_UserID);
		txtField_UserID.setColumns(10);

		JLabel lblUserID = new JLabel("UserID");
		lblUserID.setBounds(78, 99, 46, 14);
		add(lblUserID);

		txtField_Email = new JTextField();
		txtField_Email.setText("getEmail");
		txtField_Email.setColumns(10);
		txtField_Email.setBounds(212, 127, 111, 20);
		add(txtField_Email);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(78, 130, 46, 14);
		add(lblEmail);

		txtField_Team = new JTextField();
		txtField_Team.setText("getTeam/Class");
		txtField_Team.setColumns(10);
		txtField_Team.setBounds(212, 158, 111, 20);
		add(txtField_Team);

		JLabel lblTeam = new JLabel("Team");
		lblTeam.setBounds(78, 161, 46, 14);
		add(lblTeam);

		txtField_CreatedDate = new JTextField();
		txtField_CreatedDate.setText("getCreatedDate");
		txtField_CreatedDate.setColumns(10);
		txtField_CreatedDate.setBounds(212, 189, 111, 20);
		add(txtField_CreatedDate);

		JLabel lblCreateddate = new JLabel("Created Date");
		lblCreateddate.setBounds(78, 192, 67, 14);
		add(lblCreateddate);

		JLabel lblOnline = new JLabel("Online");
		lblOnline.setBounds(78, 217, 67, 14);
		add(lblOnline);

		JButton btnSubmit = new JButton("Submit changes");
//		btnSubmit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			//Submit changes to databases
//			//hvad sker der når ændringer ved en bruger submittes
//			}
//		}
//		);
		btnSubmit.setBounds(173, 266, 129, 23);
		add(btnSubmit);

		boolean active = true;
		lblNewLabel = new JLabel("Online");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(212, 220, 111, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("s");
		lblNewLabel_1.setSize(new Dimension(1366, 768));
		lblNewLabel_1.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/background.jpg")));
		lblNewLabel_1.setBounds(0, 0, 709, 525);
		add(lblNewLabel_1);
		
		JButton btnMainmenu = new JButton("Mainmenu");
		btnMainmenu.setBounds(169, 310, 89, 23);
		add(btnMainmenu);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(293, 310, 89, 23);
		add(btnLogOut);
		if (active) {
			lblNewLabel.setBackground(Color.GREEN);
			lblNewLabel.repaint();
			lblNewLabel.setText("Online");
		} else {
			lblNewLabel.setBackground(Color.RED);
			lblNewLabel.repaint();
			lblNewLabel.setText("Offline");
		}
		

	}
	
	public void addActionListener(ActionListener l) {
		btnSubmit.addActionListener(l);
		btnMainmenu.addActionListener(l);
		btnLogout.addActionListener(l);
	}

	public JTextField getTxtField_UserID() {
		return txtField_UserID;
	}

	public JTextField getTxtField_Email() {
		return txtField_Email;
	}

	public JTextField getTxtField_Team() {
		return txtField_Team;
	}

	public JTextField getTxtField_CreatedDate() {
		return txtField_CreatedDate;
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public JButton getBtnMainmenu() {
		return btnMainmenu;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}

	
	
	
}