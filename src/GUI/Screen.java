package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Screen extends JFrame {

	public static final String LOGIN = "name_276091497157488";
	public static final String MAINMENU = "name_276416022878030";
	public static final String USERINFO = "name_277892826656058";
	public static final String ADDUSERGUI = "name_278604525733268";
	public static final String NOTELIST = "name_278522430661848";
	public static final String USERLIST = "name_279726941239982";

	
	private JPanel contentPane;
	private final Login login = new Login();
	private final MainMenu mainMenu = new MainMenu();
	private final UserInfo userInfo = new UserInfo();
	private final NoteList noteList = new NoteList();
	private final AddUserGUI addUserGUI = new AddUserGUI();
	private final UserList userList = new UserList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Screen() {
		setTitle("Doek4life");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		contentPane.add(login, "name_276091497157488");
		
		contentPane.add(mainMenu, "name_276416022878030");
		
		contentPane.add(userInfo, "name_277892826656058");
		
		contentPane.add(addUserGUI, "name_278604525733268");
		
		contentPane.add(userList, "name_279726941239982");
		
		contentPane.add(noteList, "name_278522430661848");
	}
	
	public Login getLogin() {
		return login;
	}
	
	public MainMenu getMainMenu() {
		return mainMenu;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public AddUserGUI getAddUserGUI() {
		return addUserGUI;
	}
	public NoteList getNoteList() {
		return noteList;
	}
	public UserList getUserList() {
		return userList;
	}
}
