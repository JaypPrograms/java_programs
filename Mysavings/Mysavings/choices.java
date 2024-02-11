package try3.hello.src.Mysavings.Mysavings;

import java.util.*;


public class choices {
	
	 
	 Scanner input = new Scanner(System.in);
	 Scanner userinput = new Scanner(System.in);
	
	 void choice(){
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t\t   Piggy Bank ");
		System.out.println("\t[1]. Show total in bank.");
		System.out.println("\t[2]. Add penny");
		System.out.println("\t[3]. Add nickel");
		System.out.println("\t[4]. Add dime");
		System.out.println("\t[5]. Add quarter");
		System.out.println("\t[6]. Take money out of bank.");
		System.out.println("\tEnter 0 to quit");
		System.out.println("------------------------------------------------------------");
	}

	
	public  int userinputvalidation(String print){	
		System.out.print(print);
		if(!input.hasNextInt()) {
			input.next();
			return -1;		
		}
		else {
		return input.nextInt();		
	}}
	
	public  Float userinputvalidationfloat(String print){	
		System.out.print(print);
		if(!input.hasNextFloat()) {
			input.next();
			return -1f;		
		}
		else {
		return input.nextFloat();		
	}}
	
	 void newline() {
		System.out.println("");
		System.out.println();
	}
	
	 void enter() {
		
		System.out.print("Please press Enter to continue: ");
		userinput.nextLine();
		
	}
}
