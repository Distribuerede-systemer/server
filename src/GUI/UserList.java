package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
 
public class UserList extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final ActionListener ActionListener = null;
	private boolean DEBUG = false;
	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnLogout;
	private JButton btnMainMenu;
 
    public UserList() {
    	setSize(new Dimension(1366, 768));
 
        String[] columnNames = {"First Name",
                                "Last Name",
                                "Email"};
 
        Object[][] data = {
        		
        {"Kathy", "Smith", new Integer(5), new Boolean(false)},
        {"John", "Doe", new Integer(3), new Boolean(true)},
        {"Sue", "Black", new Integer(2), new Boolean(false)},
        {"Jane", "White", new Integer(20), new Boolean(true)},
        {"Joe", "Brown", new Integer(10), new Boolean(false)}
        };
 
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        table.setRowSelectionAllowed(true);
 
        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }
        setLayout(null);
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255, 255), new Color(0, 0, 205), new Color(255, 255, 255)), new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255))));
        scrollPane.setViewportBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255, 255), new Color(0, 0, 205), new Color(255, 255, 255)), null));
        scrollPane.setBounds(417, 225, 590, 360);
 
        //Add the scroll pane to this panel.
        add(scrollPane);
        
        btnAdd = new JButton("Add");
        btnAdd.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
        btnAdd.setForeground(new Color(0, 0, 205));
        btnAdd.setOpaque(true);
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {

          String firstName = JOptionPane.showInputDialog(null, "First Name", null);
          String lastName = JOptionPane.showInputDialog(null, "Last Name", null);
          String eMail = JOptionPane.showInputDialog(null, "Email", null);
        	}
        });
        
        btnAdd.setBounds(1019, 556, 118, 29);
        add(btnAdd);
        
        btnLogout = new JButton("Log out");
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setFont(new Font("Arial", Font.BOLD, 30));
        btnLogout.setContentAreaFilled(false);
        btnLogout.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
        btnLogout.setBounds(642, 688, 152, 44);
        add(btnLogout);
        
        btnMainMenu = new JButton("Main Menu");
        btnMainMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnMainMenu.setForeground(Color.WHITE);
        btnMainMenu.setFont(new Font("Arial", Font.BOLD, 30));
        btnMainMenu.setContentAreaFilled(false);
        btnMainMenu.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0)), new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0))));
        btnMainMenu.setBounds(622, 646, 194, 44);
        add(btnMainMenu);
        
        JLabel lblUserlist = new JLabel("Userlist");
        lblUserlist.setForeground(Color.WHITE);
        lblUserlist.setFont(new Font("Arial", Font.BOLD, 78));
        lblUserlist.setBounds(549, 118, 298, 90);
        add(lblUserlist);
        
        btnDelete = new JButton("Delete");
        btnDelete.setOpaque(true);
        btnDelete.setForeground(new Color(0, 0, 205));
        btnDelete.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
        btnDelete.setBounds(1019, 336, 118, 29);
        add(btnDelete);
    
        JLabel lblBackground = new JLabel("Background");
        lblBackground.setIcon(new ImageIcon(UserList.class.getResource("/Images/MetalBackground.jpg")));
        lblBackground.setBackground(new Color(245, 245, 245));
        lblBackground.setForeground(new Color(245, 255, 250));
        lblBackground.setOpaque(true);
        lblBackground.setBounds(0, 0, 1376, 768);
        add(lblBackground);
    }
 
    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
 
        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SimpleTableDemo");
        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        UserList newContentPane = new UserList();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window
        
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
     

        }
        });
    }
    
    public void addActionListener(ActionListener l) {
//		btnAdd.addActionListener(l);
		btnDelete.addActionListener(l);
		btnLogout.addActionListener(l);
		btnMainMenu.addActionListener(l);
		
	}

	public static ActionListener getActionlistener() {
		return ActionListener;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}
    
    
}
