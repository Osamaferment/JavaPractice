package Solution;

import javax.swing.JOptionPane;

public class Conversion1 {

	public static void main(String[] args) {
		
		String Sr1 = JOptionPane.showInputDialog(null, "1. Convert � to $ \n2 Convert $ to �");
		int option = Integer.parseInt(Sr1);
		
		 
		String strNum = JOptionPane.showInputDialog("Enter amount");
		
		double amount = Double.parseDouble(strNum);
		double result = 0;
		
			
		
		if (option == 1){
			 result = conv� (amount);
			 
		 }
		 else if (option == 2){
			 result = conv$(amount);
			 
		 }
		 else { 
			 System.out.println("Unknown input");
		     System.exit(0);
		 }
        
		System.out.println("the result is : " + result);
	}
         public static double conv�(double money){
         return money/0.64;
         
}
	
	     public static double conv$ (double money) {
	    	 return money*0.64 ;
	     }
}


public static int 
	     