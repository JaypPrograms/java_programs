package project2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class main2 {
	static ArrayList<case3> receipt = new ArrayList<case3>();
	static ArrayList<Integer> receipt_number = new ArrayList<Integer>();
	static ArrayList<ArrayList<case3>> allreceipt = new ArrayList<ArrayList<case3>>();
	static HashMap<Integer, ArrayList<case3> > receipthash = new HashMap<Integer, ArrayList<case3>>();
	static Scanner input = new Scanner(System.in);
	static Scanner userinput = new Scanner(System.in);
	static array2 arr = new array2();
	static display2 dis = new display2();
	public static void main(String[] args) {
		
		int num_choice,num_prod, num_stock, num_holder, order_number=0;
		String looping;
		boolean loop =false;
		boolean third =false;
		arr.try1();
		while(!loop) {
			display2.choice();
			num_choice = uservalidation.userinput("Please enter your choice: ");
			switch(num_choice) {
			case 1:
				arr.display();
				break;	
			case 2:
				num_prod = uservalidation.userinput("Please enter the product you want to add: "); 
					if(num_prod>=1 && num_prod<=4){
						num_prod-=1;
						num_stock = uservalidation.userinput("Please enter how many stock you want to add: ");
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
				int id =uservalidation.random();
//				ArrayList<case3> rec = new ArrayList<case3>();
				while(!third) {
				num_prod = uservalidation.userinput("Please enter the product you want to sale: ");
				if(num_prod>=1 && num_prod<=4){
					num_prod-=1;
					num_holder = uservalidation.userinput("Please enter how many item you want to sell: ");
						if(num_holder<=arr.prods.get(num_prod).getquantity() && num_holder >0) {
							
							String name=array2.identifier.get(num_prod).getname();
							int price = array2.identifier.get(num_prod).getprice();
							int subtotal = price*num_holder;	
							
							receipt.add(new case3(name, num_holder ,price ,subtotal));
							

							
						}
						else System.out.println("Invalid Input!!! "); 	
				}else System.out.println("Invalid Input!!! You must choose number in the choices. ");
				allreceipt.add(receipt);
				
				System.out.println("Do you want to buy another product? Y(yes)/N(no)");
				System.out.print("Please enter your choice: ");
				looping = userinput.nextLine();
				if(looping.equalsIgnoreCase("Y")) {		
				}
				
				else if(looping.equalsIgnoreCase("N")){
						System.out.println("Thank you ");
						third = true;
					}
				else {
					System.out.print("Invalid Input!!! The program will be terminated. ");
					third = true;
				}
				}
				
				receipthash.put(id, allreceipt.get(order_number));
				receipt_number.add(id);
				order_number++;
				
				
//				receipthash.put(123, receipt);
//				rec=receipthash.get(123);
//				System.out.println("name       unitsold      unitprice      totalsale");
//				for(int x=0; x<rec.size(); x++) {
//					System.out.println(rec.get(x).getname()+"   "+ rec.get(x).getunitsold()+"   "+rec.get(x).getunitprice()+"   "+rec.get(x).gettotalsale());
//				}
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

		}

	

}
