
import java.util.Scanner; //import scanner in order to create a object scanner

/**
* @Programmer Jayperson Babaran
* @Description: this program is for bank deposit that double the value every year
* Created Date: 05/12/2022
* Modified Date: 05/12/2022
* @Modified By: 05/12/2022
*/

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// creating an object scanner
		
		int balance, year=0; // creating a variable to determine the starting balance 
		
		System.out.print("Enter starting balance: ");
		balance = scan.nextInt(); //user input of the starting balance of the user
		
		do 
		{
			if(balance>=200_000 && year==0) System.out.println("It takes "+year+" years to reach $100,000");// output if the balance start greater than 100 thousand
			
			if((balance>=100_000) && balance<200_000)  System.out.println("It takes "+year+" years to reach $100,000" ); // output if the saving reach 100 thousand
			else if(balance>=1_000_000) System.out.println("It takes "+year+" years to reach $1,000,000"); // output if the saving reach 1 million
			
			year++;//increment the year
			balance*=2; // to double the balance.
				
		}while(balance<2_000_000);//condition of the do while loop
		scan.close();
	}

}
