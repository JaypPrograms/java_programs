package circle_Parameters;

/**
* @Programmer Jayperson Babaran
* @Description: this program compute the diameter, circumference, area and show all
* Created Date: 05/11/2022
* Modified Date: 05/11/2022
* @Modified By: 05/11/2022
*/

import java.util.Scanner; //imported util.scanner in order to use in user input

public class Circle_Values {

	public static void main(String[] args) {// start of main method
		Scanner scan =new Scanner(System.in); //instantiation an object in order to use the scanner
		double radius, diameter, circumference, area; // declaring the variables
		
		System.out.print("Enter a radius value: "); 
		radius= scan.nextDouble(); //user define input for radius
		
		diameter=radius*2; //computation of diameter
		System.out.println("Diameter = "+ diameter);
		
		circumference=Math.PI*diameter; //computation of circumference
		System.out.println("Circumference  = "+ circumference);
		
		area=Math.PI*(radius*radius); //computation of area
		System.out.println("Area  = "+ area);
		
		scan.close(); //close the scanner
		
		
	}//end of main method

}
