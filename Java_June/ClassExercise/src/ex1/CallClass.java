package ex1;

import java.awt.Shape;

public class CallClass {

	public static void main(String[] args) {


		int option = Shapes.getUserInt("1.Circle\n2Triangle\n3Square");

        if (option == 1){
        	double rad = Shapes.getUserDouble("Enter the redius :");
    		System.out.println(Shapes.calAreaCircle(rad));

    		double rad1 = Shapes.getUserDouble("Enter the radius");
    		System.out.println(Shapes.calAreaCircle(rad1));
        	
        }
        else if (option == 2){
    		double base = Shapes.getUserDouble("Enter the base");
    		System.out.println(base);

    		double height = Shapes.getUserDouble("Enter the height");
    		System.out.println(height);

    		System.out.println(Shapes.getTriArea(base, height));

    		double side_one = Shapes.getUserDouble("Enter first side");
    		double side_two = Shapes.getUserDouble("Enter second side");
    		double side_three = Shapes.getUserDouble("Enter third side");
    		System.out.println(Shapes.getTriCircum(side_one, side_two, side_three));
        	
        }
        else if (option == 3){
        	double sqrside = Shapes.getUserDouble("Enter the size of the square's side");
    		System.out.println(sqrside);


    		double Sqrside1 = Shapes.getUserDouble("Enter the size of the square's side");
    		System.out.println(Sqrside1);
        	
        }
        else
        	System.out.println("Wrong input");


	}



}
