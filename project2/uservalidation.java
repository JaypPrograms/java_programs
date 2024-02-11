package project2;
import java.util.*;


public class uservalidation {
	static Scanner scan = new Scanner(System.in);
	
	public static int userinput(String print){ 
	try {
		 System.out.print(print);
		 int x =scan.nextInt();
		 return x;
		 
	 } 
	catch(InputMismatchException hehe) {
		System.out.println("timang");
		scan.next();
		 return -1;
		 
	}

}
	public static int random() {
		Random r = new Random();
		int low = 200;
		int high = 500;
		int result = r.nextInt(high-low+1)+low;
		return result;
	}

}
