package GUI;

import java.awt.Dimension;

//public class AddCourse {

	import javax.swing.JPanel;

	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import javax.swing.JTable;
	import javax.swing.JTextField;

	import java.awt.Font;

	import javax.swing.SwingConstants;
	import javax.swing.JButton;

	import java.awt.Color;

	import javax.swing.JScrollPane;

	import java.awt.Component;

	import javax.swing.border.CompoundBorder;
	import javax.swing.border.BevelBorder;
	import javax.swing.border.MatteBorder;
	import javax.swing.JTextPane;


	public class AddCourse extends JPanel {
		private JTable table;
		private final JButton btnAdd = new JButton("Add");
		private final JButton btnDelete = new JButton("Delete");
		private final JButton btnMainMenu = new JButton("Main Menu");
		private final JButton btnLogout = new JButton("Log out");

		/**
		 * Create the panel.
		 */
		
		public AddCourse() {
			setAlignmentY(Component.BOTTOM_ALIGNMENT);
			setSize(new Dimension(1366, 768));
			setLayout(null);

			JLabel lblEvents = new JLabel("Add Course");
			lblEvents.setForeground(Color.WHITE);
			lblEvents.setFont(new Font("Tahoma", Font.BOLD, 78));
			lblEvents.setBounds(461, 90, 444, 95);
			add(lblEvents);

			JLabel lblUpcomingEvent = new JLabel("Courses:");
			lblUpcomingEvent.setBounds(149, 132, 124, 33);
			add(lblUpcomingEvent);

			
			//Laver tabellen inde i Eventlisten.
			String[] columnNames = { "Course", "Place", "Time", "" };

			Object[][] data = {

					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(false) },
					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(true) },
					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(false) },
					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(true) },
					{ "Distribuerede Systemer", "SPS13", "8:40-12:35", new Boolean(false) } };

			table = new JTable(data, columnNames);
			table.setSurrendersFocusOnKeystroke(true);
			table.setPreferredScrollableViewportSize(new Dimension(500, 100));
			table.setFillsViewportHeight(true);
			table.setRowSelectionAllowed(true);

			// Create the scroll pane and add the table to it.
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBorder(new CompoundBorder(new BevelBorder(
					BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255,
							255), new Color(0, 0, 205), new Color(255, 255, 255)),
					new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255))));
			scrollPane.setViewportBorder(new CompoundBorder(new BevelBorder(
					BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255,
							255), new Color(0, 0, 205), new Color(255, 255, 255)),
					null));
			scrollPane.setBounds(350, 217, 666, 389);

			// Add the scroll pane to this panel.
			add(scrollPane);

			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(EventList.class
					.getResource("/Images/MetalBackground.jpg")));
			label.setBounds(-26, -28, 0, 0);
			add(label);
			btnAdd.setOpaque(true);
			btnAdd.setForeground(new Color(0, 0, 205));
			btnAdd.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
			btnAdd.setBounds(1043, 217, 118, 29);
			
			add(btnAdd);
			btnDelete.setOpaque(true);
			btnDelete.setForeground(new Color(0, 0, 205));
			btnDelete.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
			btnDelete.setBounds(1043, 257, 118, 29);
			
			add(btnDelete);
			btnMainMenu.setForeground(Color.WHITE);
			btnMainMenu.setFont(new Font("Arial", Font.BOLD, 30));
			btnMainMenu.setContentAreaFilled(false);
			btnMainMenu.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
			btnMainMenu.setBounds(601, 620, 163, 43);
			
			add(btnMainMenu);
			btnLogout.setForeground(Color.WHITE);
			btnLogout.setFont(new Font("Arial", Font.BOLD, 30));
			btnLogout.setContentAreaFilled(false);
			btnLogout.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
			btnLogout.setBounds(624, 694, 117, 43);
			
			add(btnLogout);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(AddCourse.class.getResource("/Images/MetalBackground.jpg")));
			label_1.setBounds(0, 0, 1366, 768);
			add(label_1);
			

		}
	}
