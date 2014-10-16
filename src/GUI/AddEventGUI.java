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

public class AddEventGUI extends JPanel {
	private JTextField textField_Location;
	private JTextField textField_Createdby;
	private JTextField textField_Start;
	private JButton btnSubmit;
	private JButton btnLogout;
	private JLabel lblCBSlogo;
	private JButton btnMainMenu;
	private JLabel lblUserInfo;
	private JLabel lblEnd;
	private JLabel lblName;
	private JLabel lblText;
	private JTextField textField_End;
	private JTextField textField_Name;
	private JTextField textField_Text;
	private JLabel lblType;
	private JTextField textField_Type;

	/**
	 * Create the panel.
	 */
	public AddEventGUI() {
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
		btnLogout.setBounds(599, 637, 143, 59);
		add(btnLogout);

		textField_Location = new JTextField();
		textField_Location.setForeground(new Color(105, 105, 105));
		textField_Location.setColumns(10);
		textField_Location.setBounds(755, 191, 120, 34);
		add(textField_Location);

		JLabel lblEmail = new JLabel("Location");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Arial", Font.BOLD, 26));
		lblEmail.setBounds(483, 195, 109, 30);
		add(lblEmail);

		textField_Createdby = new JTextField();
		textField_Createdby.setForeground(new Color(105, 105, 105));
		textField_Createdby.setColumns(10);
		textField_Createdby.setBounds(755, 238, 120, 34);
		add(textField_Createdby);

		JLabel lblTeam = new JLabel("Created by");
		lblTeam.setFont(new Font("Arial", Font.BOLD, 26));
		lblTeam.setForeground(new Color(255, 255, 255));
		lblTeam.setBounds(483, 242, 133, 31);
		add(lblTeam);

		textField_Start = new JTextField();
		textField_Start.setForeground(new Color(105, 105, 105));
		textField_Start.setColumns(10);
		textField_Start.setBounds(755, 285, 120, 34);
		add(textField_Start);

		JLabel lblCreateddate = new JLabel("Start");
		lblCreateddate.setForeground(new Color(255, 255, 255));
		lblCreateddate.setFont(new Font("Arial", Font.BOLD, 26));
		lblCreateddate.setBounds(483, 288, 159, 31);
		add(lblCreateddate);

		btnSubmit = new JButton("Create event");
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
		btnSubmit.setBounds(553, 544, 239, 43);
		add(btnSubmit);

		
				
				btnMainMenu = new JButton("Main menu");
				btnMainMenu.setForeground(Color.WHITE);
				btnMainMenu.setFont(new Font("Arial", Font.BOLD, 30));
				btnMainMenu.setContentAreaFilled(false);
				btnMainMenu.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
				btnMainMenu.setBounds(586, 591, 164, 44);
				add(btnMainMenu);
				
				lblUserInfo = new JLabel("Create event");
				lblUserInfo.setForeground(Color.WHITE);
				lblUserInfo.setFont(new Font("Arial", Font.BOLD, 78));
				lblUserInfo.setBounds(451, 90, 466, 91);
				add(lblUserInfo);
						
						lblEnd = new JLabel("End");
						lblEnd.setForeground(Color.WHITE);
						lblEnd.setFont(new Font("Arial", Font.BOLD, 26));
						lblEnd.setBounds(483, 337, 159, 31);
						add(lblEnd);
						
						lblName = new JLabel("Name");
						lblName.setForeground(Color.WHITE);
						lblName.setFont(new Font("Arial", Font.BOLD, 26));
						lblName.setBounds(483, 379, 159, 31);
						add(lblName);
								
								lblText = new JLabel("Text");
								lblText.setForeground(Color.WHITE);
								lblText.setFont(new Font("Arial", Font.BOLD, 26));
								lblText.setBounds(483, 429, 159, 31);
								add(lblText);
								
								textField_End = new JTextField();
								textField_End.setForeground(SystemColor.controlDkShadow);
								textField_End.setColumns(10);
								textField_End.setBounds(755, 332, 120, 34);
								add(textField_End);
								
								textField_Name = new JTextField();
								textField_Name.setForeground(SystemColor.controlDkShadow);
								textField_Name.setColumns(10);
								textField_Name.setBounds(755, 379, 120, 34);
								add(textField_Name);
								
								textField_Text = new JTextField();
								textField_Text.setForeground(SystemColor.controlDkShadow);
								textField_Text.setColumns(10);
								textField_Text.setBounds(755, 426, 120, 34);
								add(textField_Text);
								
								textField_Type = new JTextField();
								textField_Type.setForeground(SystemColor.controlDkShadow);
								textField_Type.setColumns(10);
								textField_Type.setBounds(755, 473, 120, 34);
								add(textField_Type);
								
								lblType = new JLabel("Type");
								lblType.setForeground(Color.WHITE);
								lblType.setFont(new Font("Arial", Font.BOLD, 26));
								lblType.setBounds(483, 471, 159, 31);
								add(lblType);
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

	
	public JTextField getTextField_Location() {
		return textField_Location;
	}

	public JTextField getTextField_Createdby() {
		return textField_Createdby;
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