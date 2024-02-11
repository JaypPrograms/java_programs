package one_Hundredth_Birthday;

/**
* @Programmer Jayperson Babaran
* @Description: this program compute and sho
* Created Date: 05/11/2022
* Modified Date: 05/11/2022
* @Modified By: 05/11/2022
*/

import java.util.Scanner;//importing util.scanner in order to use in user input

public class One_Hundredth_Birthday {

	public static void main(String[] args) {// start of main method
		Scanner scan =new Scanner(System.in);//instantiation an object in order to use the scanner
		// declaring the variables
		String month; 
		int day, year;
		
		System.out.print("Enter the month you were born: ");
		month=scan.next(); //user define input for month
		System.out.println();
		
		System.out.print("Enter the day you were born: ");
		day=scan.nextInt();//user define input for day
		System.out.println();
		
		System.out.print("Enter the year you were born: ");
		year=scan.nextInt();//user define input for year
		System.out.println();
		
		System.out.println("You will be 100 on "+ month +" "+day+", "+ (year+100)+ ".");//output of the 100th birthday
		System.out.println();
		
		scan.close();//close the scanner
		

	}//end of main method

}
