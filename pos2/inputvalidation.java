package pos2;

public class inputvalidation {

	public static int userinputvalidation(String print){	
		System.out.print(print);
		if(!main1.input.hasNextInt()) {
			main1.input.next();
			return -1;		
		}
		
		else {
			return main1.input.nextInt();
		
	}}
}
