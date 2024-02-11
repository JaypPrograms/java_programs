package peachBox;
import java.util.Scanner; //import scanner in order to create a object scanner

/**
* @Programmer Jayperson Babaran
* @Description: this program show how many peaches is being shipped
* Created Date: 05/12/2022
* Modified Date: 05/12/2022
* @Modified By: 05/12/2022
*/

public class PeachBoxCounter {

	public static void main(String[] args)
	{// start of main method
		Scanner scan = new Scanner(System.in);// creating an object scanner
		
		int peach;
		
		System.out.print("Enter the number of peaches picked: ");
		peach = scan.nextInt(); //user input of value of peach
		
		for(int x=0; x<peach; x+=20) //start of for loop to determine the peaches shipped
		{ 
			System.out.println("shipped "+x+" peaches so far"); // output of how many peaches shipped
		}
		
		scan.close(); // closing the scanner
	}

}
