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
	private JButton btnMainMenu;
	private JLabel lblUserInfo;

	/**
	 * Create the panel.
	 */
	public UserInfo() {
		setPreferredSize(new Dimension(1366, 768));
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		lblCBSlogo = new JLabel("");
		lblCBSlogo.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/CBSLogo3.png")));
		lblCBSlogo.setBounds(10, 698, 250, 59);
		add(lblCBSlogo);
		

		btnLogout = new JButton("Log out");
		btnLogout.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setFont(new Font("Arial", Font.BOLD, 30));
		btnLogout.setContentAreaFilled(false);
		btnLogout.setBounds(624, 655, 117, 43);
		add(btnLogout);

		txtField_UserID = new JTextField();
		txtField_UserID.setForeground(new Color(105, 105, 105));
		txtField_UserID.setText("GetUserID");
		txtField_UserID.setName("");
		txtField_UserID.setBounds(755, 207, 120, 34);
		add(txtField_UserID);
		txtField_UserID.setColumns(10);

		JLabel lblUserID = new JLabel("UserID");
		lblUserID.setForeground(new Color(255, 255, 255));
		lblUserID.setFont(new Font("Arial", Font.BOLD, 26));
		lblUserID.setBounds(483, 210, 84, 30);
		add(lblUserID);

		txtField_Email = new JTextField();
		txtField_Email.setForeground(new Color(105, 105, 105));
		txtField_Email.setText("getEmail");
		txtField_Email.setColumns(10);
		txtField_Email.setBounds(755, 255, 120, 34);
		add(txtField_Email);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Arial", Font.BOLD, 26));
		lblEmail.setBounds(483, 253, 71, 30);
		add(lblEmail);

		txtField_Team = new JTextField();
		txtField_Team.setForeground(new Color(105, 105, 105));
		txtField_Team.setText("getTeam/Class");
		txtField_Team.setColumns(10);
		txtField_Team.setBounds(755, 301, 120, 34);
		add(txtField_Team);

		JLabel lblTeam = new JLabel("Team");
		lblTeam.setFont(new Font("Arial", Font.BOLD, 26));
		lblTeam.setForeground(new Color(255, 255, 255));
		lblTeam.setBounds(483, 296, 68, 30);
		add(lblTeam);

		txtField_CreatedDate = new JTextField();
		txtField_CreatedDate.setForeground(new Color(105, 105, 105));
		txtField_CreatedDate.setText("getCreatedDate");
		txtField_CreatedDate.setColumns(10);
		txtField_CreatedDate.setBounds(755, 347, 120, 34);
		add(txtField_CreatedDate);

		JLabel lblCreateddate = new JLabel("Created Date");
		lblCreateddate.setForeground(new Color(255, 255, 255));
		lblCreateddate.setFont(new Font("Arial", Font.BOLD, 26));
		lblCreateddate.setBounds(483, 339, 159, 31);
		add(lblCreateddate);

		JLabel lblOnline = new JLabel("Online");
		lblOnline.setForeground(new Color(255, 255, 255));
		lblOnline.setFont(new Font("Arial", Font.BOLD, 26));
		lblOnline.setBounds(483, 420, 82, 30);
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
		btnSubmit.setBounds(563, 500, 239, 43);
		add(btnSubmit);

		boolean active = true;
		lblOnlineDot = new JLabel("");
		lblOnlineDot.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Green.png")));
		if (active) {
			lblOnlineDot.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Red.png")));
		} else {
			lblOnlineDot.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/Green.png")));
		}
//<<<<<<< HEAD
		lblOnlineDot.setBounds(755, 433, 20, 20);
		add(lblOnlineDot);
				
				btnMainMenu = new JButton("Main menu");
				btnMainMenu.setForeground(Color.WHITE);
				btnMainMenu.setFont(new Font("Arial", Font.BOLD, 30));
				btnMainMenu.setContentAreaFilled(false);
				btnMainMenu.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
				btnMainMenu.setBounds(601, 557, 163, 43);
				add(btnMainMenu);
				
				lblUserInfo = new JLabel("User Info");
				lblUserInfo.setForeground(Color.WHITE);
				lblUserInfo.setFont(new Font("Arial", Font.BOLD, 78));
				lblUserInfo.setBounds(514, 90, 338, 90);
				add(lblUserInfo);
				//=======
				
				//>>>>>>> FETCH_HEAD
						
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
		btnMainMenu.addActionListener(l);
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
	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}
	
	public JButton getBtnLogout() {
		return btnLogout;
	}
}