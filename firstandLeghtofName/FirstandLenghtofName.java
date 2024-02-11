package firstandLeghtofName;
import java.util.Scanner; //import scanner in order to create a object scanner
/**
* @Programmer Jayperson Babaran
* @Description: this program illustrate traditional economic policy theory in terms of regulating a government’s economy.
* Created Date: 05/12/2022
* Modified Date: 05/12/2022
* @Modified By: 05/12/2022
*/
public class FirstandLenghtofName {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);// creating an object scanner
		String name;// creating a variable of name that will check the lenght and first letter
		
		System.out.print("Enter your name: ");
		name=scan.nextLine();//user input of value of name
		
		System.out.println("Your name has "+name.length() +" letters including space.\n"); // determining and output the lenght of the name variable
		
		System.out.println("The first letter is: "+ name.substring(0,1)); //determining the first letter of the name and output
		
		scan.close(); //closing the scanner
	}

}
