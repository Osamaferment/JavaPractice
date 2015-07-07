package ex1;

import javax.swing.JOptionPane;

public class Weight {

	static int gallon = 0;
	static int pint = 0;
	
	public static int getUserInt (String msg) {
	 String str = JOptionPane.showInputDialog(msg);
	 int userInt = Integer.parseInt(str);
	 return userInt;
		}
	
	public static void setWeight (int g, int p) {
		gallon = g;
		pint = p;
	}
		 
	public static void addWeight (int g, int p) {
	     gallon += g;
	      pint += p;
	
	}	
	
	public static void subWeight (int g, int p) {
	
	   gallon -= g;
	   pint -= p;
	
	
	}
	
	public static String getWeight () {
		return "Gallon: " + gallon + "\nPints: "+ pint;

	}
	
	public static void displayWeight() {
		System.out.println(getWeight());
	}

}
