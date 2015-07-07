package Solution;

import javax.swing.JOptionPane;

public class HelloWorld {


/*	String myName = getName (); 
	JOptionPane.showMessageDialog(null, myName);
	;
}
	
	public static String getName() {
	String name = JOptionPane.showInputDialog("WHat is your name");
	return name;
	}
	
	public static void m2() {
		System.out.println("Hello from m2");
		
	}}*/
	
	
	
	public static void main(String[] args) {
		
		
		System.out.print("Hello \n");
		System.out.println("Stranger...");
		JOptionPane.showMessageDialog(null, "Hello darling...");
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		JOptionPane.showMessageDialog(null, "Hello" + name);
		String age = JOptionPane.showInputDialog("How old are you?");
		JOptionPane.showMessageDialog(null, "oh " + age + " you are too old");
		int intAGE = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, "I am" + (intAGE+10) + "years old");
	}

}
 
 
		
		
		
		
		