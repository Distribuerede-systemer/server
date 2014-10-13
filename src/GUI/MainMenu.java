package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class MainMenu extends JPanel {
	private JButton btnUserlist;
	private JButton btnEventlist;
	private JButton btnNotelist;
	private JButton btnLogOut;
	private JLabel lblMainMenu;
	private JButton btnUserAdministration;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public MainMenu() {
		setLayout(null);
		
		btnUserlist = new JButton("Userlist");
		btnUserlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUserlist.setBounds(158, 83, 125, 23);
		add(btnUserlist);
		
		btnEventlist = new JButton("Eventlist");
		btnEventlist.setBounds(158, 117, 125, 23);
		add(btnEventlist);
		
		btnNotelist = new JButton("Notelist");
		btnNotelist.setBounds(158, 151, 125, 23);
		add(btnNotelist);
		
		btnLogOut = new JButton("Log out");
		btnLogOut.setBounds(158, 235, 125, 23);
		add(btnLogOut);
		
		lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMainMenu.setBounds(165, 37, 141, 25);
		add(lblMainMenu);
		
		btnUserAdministration = new JButton("User administration");
		btnUserAdministration.addActionListener(new BtnUserAdministrationActionListener());
		btnUserAdministration.setBounds(158, 185, 125, 23);
		add(btnUserAdministration);
		
		JLabel label = new JLabel(new ImageIcon(getClass().getResource("/Images/background.jpg")));
		label.setBounds(0, 0, 450, 300);
		add(label);

	}
	public void addActionListener(ActionListener l) {
		btnLogOut.addActionListener(l);
		btnEventlist.addActionListener(l);
		btnNotelist.addActionListener(l);
		btnUserAdministration.addActionListener(l);
		btnUserlist.addActionListener(l);
		
		
	}
	private class BtnUserAdministrationActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
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
