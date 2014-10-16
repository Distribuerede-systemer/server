import GUI.GUILogic;

public class Main {
	//Starts public main method.
	
	public static void main(String[] args) {
		Configurations cf = new Configurations();
		
		cf.ReadFile();
		
		System.out.println(cf.getPassword());
		
		//new GUILogic().run();
	}

}
