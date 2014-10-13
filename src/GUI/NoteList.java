package GUI;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollBar;
import javax.swing.JTable;

public class NoteList extends JPanel {
	private JScrollBar scrollBar;
	private JTable table;
	

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
		table.setBounds(0, 0, 1349, 768);
		add(table);
	}

}
