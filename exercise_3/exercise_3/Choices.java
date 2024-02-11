package try3.hello.src.exercise_3.exercise_3;

import java.util.Scanner;

public class Choices {
	 Scanner input = new Scanner(System.in);
	
	public Float userinputvalidationfloat(String print){	
		System.out.print(print);
		if(!input.hasNextFloat()) {
			input.next();
			boolean looping =false;
			while(!looping) {
				System.out.println("You must input a whole number");
				System.out.print("Enter a number: ");
				if(!input.hasNextFloat()) {
					input.next();
					System.out.println("invalid input");
				}
				else {
					looping=true;	
				}
		}}

				
			return input.nextFloat();	
		}
	
	public  int userinputvalidation(String print){	
		System.out.print(print);
		if(!input.hasNextInt()) {
			input.next();
			return 0;		
		}
		else {
		return input.nextInt();		
	}}
	
	 void newline() {
		System.out.println("");
		System.out.println("");
	}
}
