package module1.src.economicPolicy;

import java.util.Scanner; //import scanner in order to create a object scanner

/**
* @Programmer Jayperson Babaran
* @Description: this program illustrate traditional economic policy theory in terms of regulating a government’s economy.
* Created Date: 05/12/2022
* Modified Date: 05/20/2022
* @Modified By: Jayperson Babaran
*/
public class EconomicPolicy {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);// creating an object scanner
		
		int annual_Growth, inflation; // creating a variable for the annual growth and inflation 
		
		System.out.print("Please enter the annual growth: ");
		annual_Growth = scan.nextInt(); //user input of the annual growth

		System.out.print("Please enter the inflation: ");
		inflation = scan.nextInt();//user input of the inflation
		
		if(annual_Growth<1) // condition if annual growth is less than 1%
		{ 
			if(inflation<3) System.out.println("Increase welfare spending, reduce personal taxes, and decrease discount rate."); // condition if inflation is less than 3%
			else System.out.println("Reduce business taxes.");	
		}
		else if(annual_Growth>3) // condition if annual growth is greater than 3%
		{ 
			if(inflation<1) System.out.println("Increase personal and business taxes, and decrease discount rate."); //condition if inflation is less than 1		
			else if(inflation>3) System.out.println("Increase discount rate"); //condition if inflation is greater than 3
			else System.out.println("No change in economic policy.");// if condition is false in other if or if else statement it will go in here
		}
		else System.out.println("No change in economic policy.");// if condition is false in other if or if else statement it will go in here
		
		scan.close();//closing the scanner
	}

}