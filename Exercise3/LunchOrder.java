package Exercise3;
import java.util.*;
import java.text.DecimalFormat;

public class LunchOrder {
	static Scanner scan =new Scanner(System.in);
	static Scanner userinput =new Scanner(System.in);
	static final DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		String looping;
		boolean value= false;
		float num_holder;
//		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(new Food("hamburger",1.85f,9f,33f,1f));
		foods.add(new Food("salad",2.00f,1f,11f,5f));
		foods.add(new Food("french ",1.30f,11f,36f,4f));
		foods.add(new Food("soda",0.95f,0f,38f,0f));
		
		while(!value) {
			float total = 0;
			
			for(int x = 0; x<foods.size(); x++) {
				boolean loop = false;
				while(!loop) {
					num_holder = Choices.userinputvalidationfloat("Enter number of "+ foods.get(x).getitem()+":");
					if(num_holder>0) {
						System.out.println("Each "+foods.get(x).getitem()+ " has "+ foods.get(x).getfat()+ "g of fat, "+ foods.get(x).getcarbo()
								+ "g of carbs, and "+ foods.get(x).getfiber()+ "g.");
						total=total+foods.get(x).getprice()*num_holder;
						Choices.newline();
						loop=true;	
					}
					else {
						System.out.println("Invalid input!!! \nPlease enter a valid value.");
						Choices.newline();
					}
					}}
			System.out.println("Your order comes to: $"+ df.format(total));
			Choices.newline();
			
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
		
	}

}