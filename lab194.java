package Lab194;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab194{

	public static void main(String[] args) {
		// Lab Header
		String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is " + currentDirectory);
        String user_name = System.getProperty("user.name");
        System.out.println("Programmer " + user_name + "a lopez");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println("Lab 19.4: " + formatter.format(date));
	    
	    // allows decimal in answer for radius
	    double radius;
	    
	    Scanner scanner = new Scanner (System.in);
	    
	    // user input for radius
	    System.out.print("Enter the radius of a circle: ");
	    radius = scanner.nextDouble();
	    
	    scanner.close();
	    
	    // instance for circle
	    Circle circle = new Circle(radius);
	    
	    // print results
	    System.out.printf("The circle's area is %.2f%n"
	    				+ "The circle's diameter is %.2f%n"
	    				+ "The circle's circumference is %.2f%n", 
	    				circle.getArea(), circle.getDiameter(), circle.getCircumference());
	    
	    
	}

}
