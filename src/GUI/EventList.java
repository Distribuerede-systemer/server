package GUI;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EventList extends JPanel {

	/**
	 * Create the panel.
	 */
	public EventList() {
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		JLabel lblEvents = new JLabel("Events");
		lblEvents.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEvents.setBounds(658, 90, 128, 52);
		add(lblEvents);
		
		JButton btnDeleteEvent = new JButton("Delete Event");
		btnDeleteEvent.setBounds(1138, 672, 213, 41);
		add(btnDeleteEvent);
		
		JButton btnCreateEvent = new JButton("Create Event");
		btnCreateEvent.setBounds(1138, 615, 213, 41);
		add(btnCreateEvent);
		
		JLabel lblUpcomingEvent = new JLabel("Upcoming Event");
		lblUpcomingEvent.setBounds(164, 177, 309, 33);
		add(lblUpcomingEvent);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(EventList.class.getResource("/Images/MetalBackground.jpg")));
		label.setBounds(26, 0, 1366, 768);
		add(label);

	}
}
