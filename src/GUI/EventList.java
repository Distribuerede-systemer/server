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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


	public class EventList extends JPanel {

		/**
		 * Create the panel.
		 */
		public EventList() {
			setSize(new Dimension(1366, 768));
			setLayout(null);

			JLabel lblEvents = new JLabel("Eventlist");
			lblEvents.setForeground(Color.WHITE);
			lblEvents.setFont(new Font("Arial", Font.BOLD, 78));
			lblEvents.setBounds(521, 90, 323, 90);
			add(lblEvents);

			JLabel lblUpcomingEvent = new JLabel("Upcomming Events:");
			lblUpcomingEvent.setFont(new Font("Arial", Font.BOLD, 27));
			lblUpcomingEvent.setForeground(Color.WHITE);
			lblUpcomingEvent.setBounds(51, 140, 309, 33);
			add(lblUpcomingEvent);

			
			//Laver tabellen inde i Eventlisten.
			String[] columnNames = { "Event", "Date", "Note", "" };

			Object[][] data = {

					{ "DØK Julefrokost", "11.11.2022", "Game on!", new Boolean(false) },
					{ "DØK Julefrokost", "11.11.2022", "Game on!", new Boolean(true) },
					{ "DØK Julefrokost", "11.11.2022", "Game on!", new Boolean(false) },
					{ "DØK Julefrokost", "11.11.2022", "Game on!", new Boolean(true) },
					{ "DØK Julefrokost", "11.11.2022", "Game on!", new Boolean(false) } };

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
			scrollPane.setBounds(387, 194, 591, 361);

			// Add the scroll pane to this panel.
			add(scrollPane);
			
			JButton button = new JButton("Main Menu");
			button.setForeground(Color.WHITE);
			button.setFont(new Font("Arial", Font.BOLD, 30));
			button.setContentAreaFilled(false);
			button.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
			button.setBounds(601, 612, 163, 43);
			add(button);
			
			JButton button_1 = new JButton("Log out");
			button_1.setForeground(Color.WHITE);
			button_1.setFont(new Font("Arial", Font.BOLD, 30));
			button_1.setContentAreaFilled(false);
			button_1.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
			button_1.setBounds(624, 667, 117, 43);
			add(button_1);
						
						JButton button_2 = new JButton("Delete");
						button_2.setOpaque(true);
						button_2.setForeground(new Color(0, 0, 205));
						button_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
						button_2.setBounds(988, 194, 118, 29);
						add(button_2);
						
						JButton button_3 = new JButton("Add");
						button_3.setOpaque(true);
						button_3.setForeground(new Color(0, 0, 205));
						button_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
						button_3.setBounds(988, 234, 118, 29);
						add(button_3);
			
						JLabel label = new JLabel("");
						label.setIcon(new ImageIcon(EventList.class
								.getResource("/Images/MetalBackground.jpg")));
						label.setBounds(-26, -28, 1366, 768);
						add(label);

		}
	}

