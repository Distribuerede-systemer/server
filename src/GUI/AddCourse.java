
	package GUI;

	import javax.swing.JPanel;

	import java.awt.Dimension;

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

		/**
		 * Create the panel.
		 */
		public AddCourse() {
			setSize(new Dimension(1366, 768));
			setLayout(null);

			JLabel lblEvents = new JLabel("Add Course");
			lblEvents.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblEvents.setBounds(658, 90, 184, 52);
			add(lblEvents);

			JButton btnDeleteEvent = new JButton("Delete Course");
			btnDeleteEvent.setBounds(1115, 672, 213, 41);
			add(btnDeleteEvent);

			JButton btnCreateEvent = new JButton("Create Course");
			btnCreateEvent.setBounds(1115, 614, 213, 41);
			add(btnCreateEvent);

			JLabel lblUpcomingEvent = new JLabel("Courses:");
			lblUpcomingEvent.setBounds(171, 139, 136, 33);
			add(lblUpcomingEvent);

			
			//Laver tabellen inde i Eventlisten.
			String[] columnNames = { "Course", "Place", "Time", "" };

			Object[][] data = {

					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(false) },
					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(true) },
					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(false) },
					{ "Distribuerede Systemer", "SP213", "8:40-22:40", new Boolean(true) },
					{ "Distribuerede Systemer", "SPS13", "8:40-12:35", new Boolean(false) } };

			final JTable table = new JTable(data, columnNames);
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
			scrollPane.setBounds(270, 177, 841, 536);

			// Add the scroll pane to this panel.
			add(scrollPane);

			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(EventList.class
					.getResource("/Images/MetalBackground.jpg")));
			label.setBounds(-26, -28, 1366, 768);
			add(label);

		};

	}


