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
		setPreferredSize(new Dimension(1366, 768));
		setSize(new Dimension(1366, 768));
		setLayout(null);

		JLabel lblHeader = new JLabel("User Info");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeader.setBounds(640, 31, 85, 34);
		add(lblHeader);

		txtField_UserID = new JTextField();
		txtField_UserID.setText("GetUserID");
		txtField_UserID.setName("");
		txtField_UserID.setBounds(627, 96, 111, 20);
		add(txtField_UserID);
		txtField_UserID.setColumns(10);

		JLabel lblUserID = new JLabel("UserID");
		lblUserID.setBounds(504, 99, 46, 14);
		add(lblUserID);

		txtField_Email = new JTextField();
		txtField_Email.setText("getEmail");
		txtField_Email.setColumns(10);
		txtField_Email.setBounds(627, 127, 111, 20);
		add(txtField_Email);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(504, 130, 46, 14);
		add(lblEmail);

		txtField_Team = new JTextField();
		txtField_Team.setText("getTeam/Class");
		txtField_Team.setColumns(10);
		txtField_Team.setBounds(627, 158, 111, 20);
		add(txtField_Team);

		JLabel lblTeam = new JLabel("Team");
		lblTeam.setBounds(504, 161, 46, 14);
		add(lblTeam);

		txtField_CreatedDate = new JTextField();
		txtField_CreatedDate.setText("getCreatedDate");
		txtField_CreatedDate.setColumns(10);
		txtField_CreatedDate.setBounds(627, 189, 111, 20);
		add(txtField_CreatedDate);

		JLabel lblCreateddate = new JLabel("Created Date");
		lblCreateddate.setBounds(504, 192, 67, 14);
		add(lblCreateddate);

		JLabel lblOnline = new JLabel("Online");
		lblOnline.setBounds(504, 217, 67, 14);
		add(lblOnline);

		btnSubmit = new JButton("Submit changes");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Submit changes to databases
			//hvad sker der når ændringer ved en bruger submittes
			}
		}
		);
		btnSubmit.setBounds(618, 266, 129, 23);
		add(btnSubmit);

		boolean active = true;
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Green.png")));
		if (active) {
			lblNewLabel.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Red.png")));
		} else {
			lblNewLabel.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Green.png")));
		}
		lblNewLabel.setBounds(673, 214, 20, 20);
		add(lblNewLabel);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setSize(new Dimension(1366, 768));
		lblBackground.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/MetalBackground.jpg")));
		lblBackground.setBounds(0, 0, 1366, 768);
		add(lblBackground);
		
		btnMainmenu = new JButton("Mainmenu");
		btnMainmenu.setBounds(169, 310, 89, 23);
		add(btnMainmenu);
		

		btnLogout = new JButton("Log out");
		btnLogout.setBounds(293, 310, 89, 23);
		add(btnLogout);
		if (active) {
			lblNewLabel.setBackground(Color.GREEN);
			lblNewLabel.repaint();
			lblNewLabel.setText("Online");
		} else {
			lblNewLabel.setBackground(Color.RED);
			lblNewLabel.repaint();
			lblNewLabel.setText("Offline");
		}

		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(293, 310, 89, 23);
		add(btnLogOut);
		

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