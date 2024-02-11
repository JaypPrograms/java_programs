package pos2 ;
import java.util.*;


public class main1 {
	static Scanner input = new Scanner(System.in);
	static Scanner userinput = new Scanner(System.in);
	static array arr = new array();
	static display dis = new display();
	public static void main(String[] args) {
		
		int num_choice,num_prod, num_stock, num_holder;
		String looping;
		boolean loop =false;
		arr.try1();
		while(!loop) {
			display.choice();
			num_choice = inputvalidation.userinputvalidation("Please enter your choice: ");
			switch(num_choice) {
			case 1:
				arr.display();
				break;	
			case 2:
				num_prod = inputvalidation.userinputvalidation("Please enter the product you want to add: "); 
					if(num_prod>=1 && num_prod<=4){
						num_prod-=1;
						num_stock = inputvalidation.userinputvalidation("Please enter how many stock you want to add: ");
						if(num_stock>0) {
							arr.prods.get(num_prod).setquantity(num_stock+arr.prods.get(num_prod).getquantity());
							System.out.println(" "+arr.prods.get(num_prod).getname()+"\t\t "+arr.prods.get(num_prod).getprice()+"\t\t  "+arr.prods.get(num_prod).getquantity());
							System.out.println("Added!!! "); 	
						}
						else System.out.println("Invalid Input!!! "); 							
					}				
					else System.out.println("Invalid Input!!! You enter a wrong number ");
					break;
			case 3:	
				num_prod = inputvalidation.userinputvalidation("Please enter the product you want to sale: ");
				if(num_prod>=1 && num_prod<=4){
					num_prod-=1;
					num_holder = inputvalidation.userinputvalidation("Please enter how many item you want to sell: ");
						if(num_holder<=arr.prods.get(num_prod).getquantity() && num_holder >0) {
							int sales;
							sales = arr.prods.get(num_prod).getprice()*num_holder;
							arr.prods.get(num_prod).setsales(sales+arr.prods.get(num_prod).getsales());
							arr.prods.get(num_prod).setsold(num_holder+arr.prods.get(num_prod).getsold());
							arr.prods.get(num_prod).setquantity(arr.prods.get(num_prod).getquantity()-num_holder);
							
							dis.transact(num_prod, num_holder, sales);
						}
						else System.out.println("Invalid Input!!! "); 	
				}
				else System.out.println("Invalid Input!!! "); 
				break;
			case 4:
				arr.display4();
				break;	
			default:
				System.out.println("Invalid Input!!! \nYou entered a string or invalid number. ");
			}
			
			System.out.println("Do you want to run the programm again? Y(yes)/N(no)");
			System.out.print("Please enter your choice: ");
			looping = userinput.nextLine();
			if(looping.equalsIgnoreCase("Y")) {		
			}
			
			else if(looping.equalsIgnoreCase("N")){
					System.out.println("Thank you ");
					loop = true;
				}
			else {
				System.out.print("Invalid Input!!! The program will be terminated. ");
				loop = true;
			}
		}

		}}

