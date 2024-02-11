package try3.hello.src.exercise_3.exercise_3;
import java.util.*;
import java.text.NumberFormat;

public class LunchOrder {

	
	public static void main(String[] args) {
		Choices cho= new Choices();
		Scanner scan =new Scanner(System.in);
	 	Scanner userinput =new Scanner(System.in);
		String looping;
		
		boolean value= false;
		float num_holder;
		
		Locale uslocale = new Locale( "en", "US");
		NumberFormat currency = NumberFormat.getCurrencyInstance(uslocale);
		
		Food Hamburger = new Food("hamburger",1.85f,9f,33f,1f);
		Food salad = new Food("salad",2.00f,1f,11f,5f);
		Food french = new Food("french ",1.30f,11f,36f,4f);
		Food soda = new Food("soda",0.95f,0f,38f,0f);

		
		while(!value) {
			cho.newline();
			float total = 0;
				boolean loop = false;
				while(!loop) {
					num_holder = cho.userinputvalidationfloat("Enter number of "+ Hamburger.getitem()+":");
					if(num_holder>0) {
						System.out.println("Each "+Hamburger.getitem()+ " has "+ Hamburger.getfat()+ "g of fat, "+ Hamburger.getcarbo()
								+ "g of carbs, and "+ Hamburger.getfiber()+ "g.");
						total=total+Hamburger.getprice()*num_holder;
						cho.newline();
						loop=true;	
					}
					
					num_holder = cho.userinputvalidationfloat("Enter number of "+ salad.getitem()+":");
					if(num_holder>0) {
						System.out.println("Each "+salad.getitem()+ " has "+ salad.getfat()+ "g of fat, "+ salad.getcarbo()
								+ "g of carbs, and "+ salad.getfiber()+ "g.");
						total=total+salad.getprice()*num_holder;
						cho.newline();
						loop=true;	
					}
					
					num_holder = cho.userinputvalidationfloat("Enter number of "+ soda.getitem()+":");
					if(num_holder>0) {
						System.out.println("Each "+soda.getitem()+ " has "+ soda.getfat()+ "g of fat, "+ soda.getcarbo()
								+ "g of carbs, and "+ soda.getfiber()+ "g.");
						total=total+soda.getprice()*num_holder;
						cho.newline();
						loop=true;	
					}
					num_holder = cho.userinputvalidationfloat("Enter number of "+ french.getitem()+":");
					if(num_holder>0) {
						System.out.println("Each "+french.getitem()+ " has "+ french.getfat()+ "g of fat, "+ french.getcarbo()
								+ "g of carbs, and "+ french.getfiber()+ "g.");
						total=total+french.getprice()*num_holder;
						cho.newline();
						loop=true;	
					}
					
					

					}
			System.out.println("**************************************************");
			System.out.println("Your order comes to: "+currency.format (total));
			System.out.println("**************************************************");
			cho.newline();
			
			System.out.println("Do you want to run the programm again? Y(yes)/N(no)");
			System.out.print("Please enter your choice: ");
			looping = userinput.nextLine();
			if(looping.equalsIgnoreCase("Y")) {		
			}
			
			else if(looping.equalsIgnoreCase("N")){
					System.out.println("Thank you ");
					value = true;
				}
			else {
				System.out.print("Invalid Input!!! The program will be terminated. ");
				value = true;
			}
		}

		scan.close();
		userinput.close();
		
	}
}

