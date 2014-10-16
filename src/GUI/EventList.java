package GUI;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
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
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setViewportBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255, 255), new Color(0, 0, 205), new Color(255, 255, 255)), null));
		scrollPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255, 255), new Color(0, 0, 205), new Color(255, 255, 255)), new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255))));
		scrollPane.setBounds(381, 212, 751, 501);
		add(scrollPane);
		
		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setText("Date");
		scrollPane.setViewportView(txtpnDate);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(EventList.class.getResource("/Images/MetalBackground.jpg")));
		label.setBounds(26, 0, 1366, 768);
		add(label);

	}
}
