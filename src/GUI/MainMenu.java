package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Dimension;

public class MainMenu extends JPanel {
	private JLabel label;
	private JLabel lblMainMenu;
	private JButton btnLogOut;
	private JButton btnUserlist;
	private JButton btnEventlist;
	private JButton btnNotelist;
	private JButton btnUserAdministration;
	

	
	public MainMenu() {
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setForeground(Color.WHITE);
		lblMainMenu.setFont(new Font("Iowan Old Style", Font.BOLD, 78));
		lblMainMenu.setBounds(127, 99, 423, 107);
		add(lblMainMenu);
		
		btnUserlist = new JButton("User-list");
		btnUserlist.setForeground(Color.WHITE);
		btnUserlist.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnUserlist.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnUserlist.setBackground(Color.WHITE);
		btnUserlist.setBounds(268, 274, 145, 50);
		add(btnUserlist);
		
		btnEventlist = new JButton("Eventlist");
		btnEventlist.setForeground(Color.WHITE);
		btnEventlist.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnEventlist.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnEventlist.setBackground(Color.WHITE);
		btnEventlist.setBounds(536, 398, 145, 50);
		add(btnEventlist);
		
		btnNotelist = new JButton("Note-list");
		btnNotelist.setForeground(Color.WHITE);
		btnNotelist.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnNotelist.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnNotelist.setBackground(Color.WHITE);
		btnNotelist.setBounds(6, 398, 145, 50);
		add(btnNotelist);
		
		btnUserAdministration = new JButton("User Administration");
		btnUserAdministration.setForeground(Color.WHITE);
		btnUserAdministration.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnUserAdministration.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnUserAdministration.setBackground(Color.WHITE);
		btnUserAdministration.setBounds(212, 398, 286, 50);
		add(btnUserAdministration);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnLogOut.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setBounds(257, 517, 158, 56);
		add(btnLogOut);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/MetalBackground.jpg")));
		lblBackground.setBounds(0, 0, 1366, 768);
		add(lblBackground);

	}
	public void addActionListener(ActionListener l) {
		btnLogOut.addActionListener(l);
		btnEventlist.addActionListener(l);
		btnNotelist.addActionListener(l);
		btnUserAdministration.addActionListener(l);
		btnUserlist.addActionListener(l);
		
		
	}
	public JButton getBtnUserlist() {
		return btnUserlist;
	}
	public JButton getBtnEventlist() {
		return btnEventlist;
	}
	public JButton getBtnNotelist() {
		return btnNotelist;
	}
	public JButton getBtnLogOut() {
		return btnLogOut;
	}
	public JButton getBtnUserAdministration() {
		return btnUserAdministration;
	}
}
