package pos2;
import java.util.*;

public class array {
	
	 ArrayList<product> prods = new ArrayList<product>();
	
	
	public void try1(){	

		product prod1 = new product("pen     ", 5,10,0,0);
		product prod2 = new product("pencil  ", 2,20,0,0);
		product prod3 = new product("Notebook", 8,10,0,0);
		product prod4 = new product("eraser  ", 2,30,0,0);
		
		identifier.put(0, prod1);
		identifier.put(1, prod2);
		identifier.put(2, prod3);
		identifier.put(3, prod4);
		
		prods.add(prod1);
		prods.add(prod2);
		prods.add(prod3);
		prods.add(prod4);
	
	}

	public void display(){
			System.out.println("");
			System.out.println(" Name \t\t\tPrice \t\tQuantity");
			System.out.println(" ------------------------------------------------------------");
			for(int x=0; x< identifier.size(); x++ ) {
				System.out.println(" "+identifier.get(x).getname()+"\t\t "+identifier.get(x).getprice()+"\t\t  "+identifier.get(x).getquantity());
		}
			System.out.println(" ------------------------------------------------------------");
	}
	
	public void display4(){
		System.out.println("");
		System.out.println(" Name \t\t   Quantity sold \t   Total Sales");
		System.out.println(" ------------------------------------------------------------");
		for(int x=0; x< identifier.size(); x++ ) {
			System.out.println(" "+identifier.get(x).getname()+"\t\t "+identifier.get(x).getsold()+"\t\t\t"+identifier.get(x).getsales());
	}
		System.out.println(" ------------------------------------------------------------");
}
	
	
	
}
