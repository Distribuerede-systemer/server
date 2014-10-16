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
import java.awt.SystemColor;

public class AddUser extends JPanel {
	private JTextField textField_Email;
	private JTextField textField_;
	private JTextField textField_Password;
	private JButton btnSubmit;
	private JButton btnLogout;
	private JLabel lblCBSlogo;
	private JButton btnMainMenu;
	private JLabel lblUserInfo;

	/**
	 * Create the panel.
	 */
	public AddUser() {
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
		btnLogout.setBounds(640, 477, 117, 43);
		add(btnLogout);

		textField_Email = new JTextField();
		textField_Email.setForeground(new Color(105, 105, 105));
		textField_Email.setName("");
		textField_Email.setBounds(755, 175, 120, 34);
		add(textField_Email);
		textField_Email.setColumns(10);

		JLabel lblUserID = new JLabel("Email");
		lblUserID.setForeground(new Color(255, 255, 255));
		lblUserID.setFont(new Font("Arial", Font.BOLD, 26));
		lblUserID.setBounds(483, 179, 104, 30);
		add(lblUserID);

		textField_ = new JTextField();
		textField_.setForeground(new Color(105, 105, 105));
		textField_.setColumns(10);
		textField_.setBounds(755, 222, 120, 34);
		add(textField_);

		JLabel lblEmail = new JLabel("Type");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Arial", Font.BOLD, 26));
		lblEmail.setBounds(483, 226, 109, 30);
		add(lblEmail);

		textField_Password = new JTextField();
		textField_Password.setForeground(new Color(105, 105, 105));
		textField_Password.setColumns(10);
		textField_Password.setBounds(755, 269, 120, 34);
		add(textField_Password);

		JLabel lblTeam = new JLabel("Password");
		lblTeam.setFont(new Font("Arial", Font.BOLD, 26));
		lblTeam.setForeground(new Color(255, 255, 255));
		lblTeam.setBounds(483, 273, 127, 30);
		add(lblTeam);

		btnSubmit = new JButton("Create User");
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
		btnSubmit.setBounds(570, 332, 239, 43);
		add(btnSubmit);

		
				
				btnMainMenu = new JButton("Main menu");
				btnMainMenu.setForeground(Color.WHITE);
				btnMainMenu.setFont(new Font("Arial", Font.BOLD, 30));
				btnMainMenu.setContentAreaFilled(false);
				btnMainMenu.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
				btnMainMenu.setBounds(611, 408, 163, 43);
				add(btnMainMenu);
				
				lblUserInfo = new JLabel("Create user");
				lblUserInfo.setForeground(Color.WHITE);
				lblUserInfo.setFont(new Font("Arial", Font.BOLD, 78));
				lblUserInfo.setBounds(451, 90, 464, 90);
				add(lblUserInfo);
						//=======
						
						//>>>>>>> FETCH_HEAD
								
								JLabel lblBackground = new JLabel("");
								lblBackground.setSize(new Dimension(1366, 768));
								lblBackground.setIcon(new ImageIcon(UserInfo.class.getResource("/Images/MetalBackground.jpg")));
								lblBackground.setBounds(0, 0, 1366, 768);
								add(lblBackground);
		
		

	}
	
	public void addActionListener(ActionListener l) {
		btnSubmit.addActionListener(l);
		btnLogout.addActionListener(l);
		btnMainMenu.addActionListener(l);
	}

	

	public JTextField getTextField_Eventtid() {
		return textField_Email;
	}

	public JTextField getTextField_Location() {
		return textField_;
	}

	public JTextField getTextField_Createdby() {
		return textField_Password;
	}

	public JTextField getTextField_Start() {
		return textField_Start;
	}

	public JTextField getTextField_End() {
		return textField_End;
	}

	public JTextField getTextField_Name() {
		return textField_Name;
	}

	public JTextField getTextField_Text() {
		return textField_Text;
	}
	

	public JTextField getTextField_Type() {
		return textField_Type;
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