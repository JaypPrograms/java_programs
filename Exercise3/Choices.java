package Exercise3;

import java.util.Scanner;

public class Choices {
	static Scanner input = new Scanner(System.in);
	
	public static Float userinputvalidationfloat(String print){	
		System.out.print(print);
		if(!input.hasNextFloat()) {
			input.next();
			return -1f;		
		}
		else {
		return input.nextFloat();		
	}}
	
	public static int userinputvalidation(String print){	
		System.out.print(print);
		if(!input.hasNextInt()) {
			input.next();
			return 0;		
		}
		else {
		return input.nextInt();		
	}}
	
	static void newline() {
		System.out.println("");
		System.out.println("");
	}
}
