package ex1;

import javax.swing.JOptionPane;



public class Shapes {
		
    public static int getUserInt (String msg) {
    	String str = JOptionPane.showInputDialog(msg);
    	int userInt = Integer.parseInt(str);
		return userInt;
	}
    
    public static double getUserDouble (String msg) {
    	String str = JOptionPane.showInputDialog(msg);
    	double userInt = Double.parseDouble(str);
		return userInt;
	}
    
    public static String getUserString (String msg) {
    	String str = JOptionPane.showInputDialog(msg);
		return str;
	}
    
    public static double calAreaCircle (double rad) {
    	double area = rad*rad*Math.PI;
    	return area;
		
	}
    public static double calcircumcircle (double rad1) {
    	double circum = rad1 * Math.PI*2;
    	return circum;
    }

    public static double getTriArea (double base, double height) {
    	double triarea = 0.5 * base * height;
    	return triarea;
        }
    
    
    public static double getTriCircum (double side1, double side2, double side3) {
    	double tricirm = side1 + side2 + side3;
    	return tricirm;
    }
    

   public static double getSqrArea (double sqrSide) {
	return sqrSide*sqrSide;
   }

   
   public static double getSqrCir (double sqrSide1){
	   return sqrSide1*4;
   }
   
   

}




