package try3.hello.src.chapter_9exercise2;

import java.util.Scanner;

public class choices {
     Scanner input = new Scanner(System.in);
    public  int userinputvalidation(String print){
		
		System.out.print(print);
		if(!input.hasNextInt()) {
			newline();
			System.out.println("invalid input");
			input.next();
			boolean looping =false;
			while(!looping) {
				System.out.println("You must input a whole number");
				System.out.print("Enter deposit amount: ");
				if(!input.hasNextInt()) {
					input.next();
					newline();
					System.out.println("invalid input");
					newline();
				}
				else {
					looping=true;	
				}
		}}

				
			return input.nextInt();	
		}

     void newline() {
            System.out.println("");
            System.out.println("");
        }   

		public boolean looping(String display){

			System.out.println("");
				System.out.println(display);
				System.out.print("Please enter your choice: ");
				String loop = input.next();
			if(loop.equalsIgnoreCase("Y")) {	
				newline();
				return false;	
			}
			
			else if(loop.equalsIgnoreCase("N")){
					System.out.println("Thank you ");
					newline();
					return true;
				}
			else {
				System.out.print("Invalid Input!!! The process will be terminated! ");
				newline();
				return true;
				
			} 
}}
