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
		setLayout(new BorderLayout(0, 0));
		setSize(new Dimension(1366, 768));
		
		scrollBar = new JScrollBar();
		add(scrollBar, BorderLayout.EAST);
		
		table = new JTable();
		add(table, BorderLayout.CENTER);
	}

}
