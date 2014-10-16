package GUI;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class NoteList extends JPanel {
	private JScrollBar scrollBar;
	private JTable table;
	private final JLabel label = new JLabel("");
	private JLabel lblNewLabel;
	

	/**
	 * Create the panel.
	 */
	public NoteList() {
		setSize(new Dimension(1366, 768));
		setLayout(null);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(1349, 0, 17, 768);
		add(scrollBar);
		
		table = new JTable();
		table.setBounds(285, 173, 796, 320);
		add(table);
		
		lblNewLabel = new JLabel("NoteList");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 78));
		lblNewLabel.setBounds(527, 31, 312, 90);
		add(lblNewLabel);
		label.setIcon(new ImageIcon(NoteList.class.getResource("/Images/MetalBackground.jpg")));
		label.setBounds(0, 0, 1356, 768);
		
		add(label);
	}
}
