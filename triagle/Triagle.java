package triagle;
import java.util.Scanner; //import scanner in order to create a object scanner

/**
* @Programmer Jayperson Babaran
* @Description: this program create a triagle using asterisk
* Created Date: 05/12/2022
* Modified Date: 05/12/2022
* @Modified By: 05/12/2022
*/
public class Triagle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// creating an object scanner
		
		int size; // creating a variable to determine the size of the triangle 
		
		System.out.print("Enter the size of the equal sides in an isosceles triangle: ");
		size = scan.nextInt(); //user input of the value of the size that will be use in the height and size of triangle
		
		for(int x=0; x<=size; x++) //using nested for loop to show the triangle
		{ 
			for(int y=0; y<x; y++) // second for loop
			{
			System.out.print("*"); // printing out the asterisk to build a triangle
		}
		System.out.println("");// this line is use in order for the line to move to the next line to build a correct triangle
		} 
		
		scan.close(); // closing the scanner

	}

}
