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
	private JLabel label_1;
	private JLabel lblMainMenu;


	
	public MainMenu() {
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setForeground(Color.WHITE);
		lblMainMenu.setFont(new Font("Iowan Old Style", Font.BOLD, 78));
		lblMainMenu.setBounds(127, 99, 423, 107);
		add(lblMainMenu);
		
		JButton btnUserlist_1 = new JButton("User-list");
		btnUserlist_1.setForeground(Color.WHITE);
		btnUserlist_1.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnUserlist_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnUserlist_1.setBackground(Color.WHITE);
		btnUserlist_1.setBounds(268, 274, 145, 50);
		add(btnUserlist_1);
		
		JButton btnEventlist_1 = new JButton("Eventlist");
		btnEventlist_1.setForeground(Color.WHITE);
		btnEventlist_1.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnEventlist_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnEventlist_1.setBackground(Color.WHITE);
		btnEventlist_1.setBounds(536, 398, 145, 50);
		add(btnEventlist_1);
		
		JButton btnNotelist_1 = new JButton("Note-list");
		btnNotelist_1.setForeground(Color.WHITE);
		btnNotelist_1.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnNotelist_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnNotelist_1.setBackground(Color.WHITE);
		btnNotelist_1.setBounds(6, 398, 145, 50);
		add(btnNotelist_1);
		
		JButton btnUserAdministration_1 = new JButton("User Administration");
		btnUserAdministration_1.setForeground(Color.WHITE);
		btnUserAdministration_1.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnUserAdministration_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnUserAdministration_1.setBackground(Color.WHITE);
		btnUserAdministration_1.setBounds(212, 398, 286, 50);
		add(btnUserAdministration_1);
		
		JButton btnLogOut_1 = new JButton("Log Out");
		btnLogOut_1.setForeground(Color.WHITE);
		btnLogOut_1.setFont(new Font("Iowan Old Style", Font.PLAIN, 30));
		btnLogOut_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
		btnLogOut_1.setBackground(Color.WHITE);
		btnLogOut_1.setBounds(257, 517, 158, 56);
		add(btnLogOut_1);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/Background3.jpg")));
		label_1.setBounds(-13, -26, 1366, 768);
		add(label_1);

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
