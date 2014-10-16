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

public class EventList extends JPanel {

	/**
	 * Create the panel.
	 */
	public EventList() {
		setSize(new Dimension(1366, 768));
		setLayout(null);

		JLabel lblEvents = new JLabel("Events List");
		lblEvents.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEvents.setBounds(608, 91, 195, 52);
		add(lblEvents);

		JButton btnDeleteEvent = new JButton("Delete Event");
		btnDeleteEvent.setBounds(1138, 672, 213, 41);
		add(btnDeleteEvent);

		JButton btnCreateEvent = new JButton("Create Event");
		btnCreateEvent.setBounds(1138, 615, 213, 41);
		add(btnCreateEvent);

		JLabel lblUpcomingEvent = new JLabel("Upcoming Event:");
		lblUpcomingEvent.setBounds(164, 177, 309, 33);
		add(lblUpcomingEvent);

		
		//Laver tabellen inde i Eventlisten.
		String[] columnNames = { "Event", "Date", "Note" };

		Object[][] data = {

		{ "Kathy", "Smith", "HEJ", new Boolean(false) },
				{ "John", "Doe", new Integer(3), new Boolean(true) },
				{ "Sue", "Black", new Integer(2), new Boolean(false) },
				{ "Jane", "White", new Integer(20), new Boolean(true) },
				{ "Joe", "Brown", new Integer(10), new Boolean(false) } };

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
		scrollPane.setBounds(417, 225, 590, 360);

		// Add the scroll pane to this panel.
		add(scrollPane);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(EventList.class
				.getResource("/Images/MetalBackground.jpg")));
		label.setBounds(26, 0, 1366, 768);
		add(label);

	};

}
