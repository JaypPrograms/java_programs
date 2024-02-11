package try3.hello.src.Mysavings.Mysavings;

import java.util.Scanner;

public class mysavings {
	 
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		choices cho = new choices();
		

		boolean value = false;
		int num_choice; 
		int num_value;
		PiggyBank piggy = new PiggyBank(0);
		while(!value) {
			cho.choice();
			
			num_choice= cho.userinputvalidation("Enter your choice: ");
			switch(num_choice) {
			case 0:
				value =true;
				System.out.println("Thank you, Goodbye.");
				cho.newline();
				break;
			
			case 1:
				piggy.settotal();
				piggy.display();
				cho.newline();
				cho.enter();
				break;
			
			case 2:
				num_value= cho.userinputvalidation("Enter how many penny you want to add: ");
				if(num_value>0) {
					piggy.setpenny(num_value);
					System.out.println("added!!!!");
					cho.newline();
					cho.enter();
				}
				
				else {
					System.out.println("invalid input!/n You must enter an invalid number");
					cho.newline();
					cho.enter();
				}
				break;
			
			case 3:
				num_value= cho.userinputvalidation("Enter how many nickel you want to add: ");
				if(num_value>0) {
					piggy.setnickel(num_value);
					System.out.println("added!!!!");
					cho.newline();
					cho.enter();
				}
				
				else {
					System.out.println("invalid input!/n You must enter an invalid number");
					cho.newline();
					cho.enter();
				}
				break;	
				
			case 4:
				num_value= cho.userinputvalidation("Enter how many dime you want to add: ");
				if(num_value>0) {
					piggy.setdime(num_value);
					System.out.println("added!!!!");
					cho.newline();
					cho.enter();
				}
				
				else {
					System.out.println("invalid input!/n You must enter an invalid number");
					cho.newline();
					cho.enter();
				}
				break;
				
			case 5:
				num_value= cho.userinputvalidation("Enter how many quarter you want to add: ");
				if(num_value>0) {
					piggy.setquarter(num_value);
					System.out.println("added!!!!");
					cho.newline();
					cho.enter();
				}
				
				else {
					System.out.println("invalid input!/n You must enter an invalid number");
					cho.newline();
					cho.enter();
				}
				break;
			
			case 6:
				piggy.witdraw_total();
				cho.newline();
				cho.enter();
				break;	
				
			default:
				System.out.println("invalid input! You must input a number.");
				cho.newline();
				cho.enter();
				break;
						
				
			}
			cho.newline();
			
	}
	input.close();

}}
