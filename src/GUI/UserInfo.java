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
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.KeyEvent;

public class UserInfo extends JPanel {
	private JTextField txtField_UserID;
	private JTextField txtField_Email;
	private JTextField txtField_Team;
	private JTextField txtField_CreatedDate;
	private JButton btnSubmit;
	private JButton btnLogout;
	private JLabel lblOnlineDot;
	private JLabel lblCBSlogo;

	/**
	 * Create the panel.
	 */
	public UserInfo() {
		setPreferredSize(new Dimension(1366, 768));
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		lblCBSlogo = new JLabel("");
		lblCBSlogo.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/CBSLogo3.png")));
		lblCBSlogo.setBounds(34, 695, 263, 73);
		add(lblCBSlogo);
		

		btnLogout = new JButton("Log out");
		btnLogout.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Arial", Font.BOLD, 30));
		btnLogout.setContentAreaFilled(false);
		btnLogout.setBounds(588, 543, 152, 44);
		add(btnLogout);

		JLabel lblHeader = new JLabel("User Info");
		lblHeader.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblHeader.setForeground(new Color(255, 255, 255));
		lblHeader.setFont(new Font("Arial", Font.BOLD, 78));
		lblHeader.setBounds(483, 86, 338, 91);
		add(lblHeader);

		txtField_UserID = new JTextField();
		txtField_UserID.setForeground(new Color(105, 105, 105));
		txtField_UserID.setText("GetUserID");
		txtField_UserID.setName("");
		txtField_UserID.setBounds(736, 208, 120, 34);
		add(txtField_UserID);
		txtField_UserID.setColumns(10);

		JLabel lblUserID = new JLabel("UserID");
		lblUserID.setForeground(new Color(255, 255, 255));
		lblUserID.setFont(new Font("Arial", Font.BOLD, 26));
		lblUserID.setBounds(464, 211, 83, 31);
		add(lblUserID);

		txtField_Email = new JTextField();
		txtField_Email.setForeground(new Color(105, 105, 105));
		txtField_Email.setText("getEmail");
		txtField_Email.setColumns(10);
		txtField_Email.setBounds(736, 256, 120, 34);
		add(txtField_Email);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Arial", Font.BOLD, 26));
		lblEmail.setBounds(464, 254, 68, 31);
		add(lblEmail);

		txtField_Team = new JTextField();
		txtField_Team.setForeground(new Color(105, 105, 105));
		txtField_Team.setText("getTeam/Class");
		txtField_Team.setColumns(10);
		txtField_Team.setBounds(736, 302, 120, 34);
		add(txtField_Team);

		JLabel lblTeam = new JLabel("Team");
		lblTeam.setFont(new Font("Arial", Font.BOLD, 26));
		lblTeam.setForeground(new Color(255, 255, 255));
		lblTeam.setBounds(464, 297, 67, 31);
		add(lblTeam);

		txtField_CreatedDate = new JTextField();
		txtField_CreatedDate.setForeground(new Color(105, 105, 105));
		txtField_CreatedDate.setText("getCreatedDate");
		txtField_CreatedDate.setColumns(10);
		txtField_CreatedDate.setBounds(736, 348, 120, 34);
		add(txtField_CreatedDate);

		JLabel lblCreateddate = new JLabel("Created Date");
		lblCreateddate.setForeground(new Color(255, 255, 255));
		lblCreateddate.setFont(new Font("Arial", Font.BOLD, 26));
		lblCreateddate.setBounds(464, 340, 159, 31);
		add(lblCreateddate);

		JLabel lblOnline = new JLabel("Online");
		lblOnline.setForeground(new Color(255, 255, 255));
		lblOnline.setFont(new Font("Arial", Font.BOLD, 26));
		lblOnline.setBounds(464, 421, 80, 31);
		add(lblOnline);

		btnSubmit = new JButton("Submit changes");
		btnSubmit.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSubmit.setContentAreaFilled(false);
		btnSubmit.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 30));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Submit changes to databases
			//hvad sker der n�r �ndringer ved en bruger submittes
			}
		}
		);
		btnSubmit.setBounds(543, 500, 239, 44);
		add(btnSubmit);

		boolean active = true;
		lblOnlineDot = new JLabel("");
		lblOnlineDot.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Green.png")));
		if (active) {
			lblOnlineDot.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Red.png")));
		} else {
			lblOnlineDot.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Green.png")));
		}
		lblOnlineDot.setBounds(736, 434, 20, 20);
		add(lblOnlineDot);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setSize(new Dimension(1366, 768));
		lblBackground.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/MetalBackground.jpg")));
		lblBackground.setBounds(0, 0, 1366, 768);
		add(lblBackground);
		if (active) {
			lblOnlineDot.setBackground(Color.GREEN);
			lblOnlineDot.repaint();
			lblOnlineDot.setText("Online");
		} else {
			lblOnlineDot.setBackground(Color.RED);
			lblOnlineDot.repaint();
			lblOnlineDot.setText("Offline");
		}
		

	}
	
	public void addActionListener(ActionListener l) {
		btnSubmit.addActionListener(l);
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


	

	public JButton getBtnLogout() {
		return btnLogout;
	}

	
	
	
}