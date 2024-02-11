package Activity_1_Package;
import java.util.Scanner;
import java.text.NumberFormat; //import number format in order to get percentage instance

public class StockChangeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		NumberFormat decimal = NumberFormat.getPercentInstance();//setting up how many decimal will be seen in the output
		decimal.setMinimumFractionDigits(2);
		
		String StockSymble;
		float Day1, Day2;
		float Percentage;
		
		System.out.print("Enter the stock symbol: ");
		StockSymble=scan.next();
		System.out.print("Enter AAPL's day 1 value: ");
		Day1 =scan.nextFloat();
		System.out.print("Enter AAPL's day 2 value:");
		Day2 =scan.nextFloat();
		
		Percentage=((Day2-Day1)/Day1);
		
		System.out.println(StockSymble +" has change "+ decimal.format(Percentage)+" in one day.");
		
		scan.close();

	}

}
