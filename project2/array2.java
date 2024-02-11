package project2;

import java.util.ArrayList;
import java.util.HashMap;



public class array2 {
	 ArrayList<product2> prods = new ArrayList<product2>();
	 static HashMap<Integer, product2> identifier = new HashMap<Integer, product2>();
	
	public void try1(){	

		product2 prod1 = new product2("pen     ", 5,10,0,0);
		product2 prod2 = new product2("pencil  ", 2,20,0,0);
		product2 prod3 = new product2("Notebook", 8,10,0,0);
		product2 prod4 = new product2("eraser  ", 2,30,0,0);
		
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
			System.out.println(" Name \t\t\tPrice \t\t Quantity");
			System.out.println(" ------------------------------------------------------------");
			for(int x=0; x< identifier.size(); x++ ) {
				prods.get(x).getname();
				System.out.println(" "+identifier.get(x).getname()+"\t\t"+identifier.get(x).getprice()+" PHP\t\t  "+identifier.get(x).getquantity()+" Pcs");
		}
			System.out.println(" ------------------------------------------------------------");
	}
	
	public void display4(){
		System.out.println("");
		System.out.println(" Name \t\t   Quantity sold \t   Total Sales");
		System.out.println(" ------------------------------------------------------------");
		for(int x=0; x< identifier.size(); x++ ) {
			System.out.println(" "+identifier.get(x).getname()+"\t\t "+identifier.get(x).getsold()+" Pcs\t\t\t"+identifier.get(x).getsales()+" PHP");
	}
		System.out.println(" ------------------------------------------------------------");
}
}
