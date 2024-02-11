package project2;

public class display2 {
	public static void choice(){
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t\t   Point of Sale menu ");
		System.out.println("\t[1]-Display Inventory");
		System.out.println("\t[2]-Add Product Quantity");
		System.out.println("\t[3]-Enter Sales Transaction");
		System.out.println("\t[4]-Display All Sales Transaction");
		System.out.println("------------------------------------------------------------");
	}
	public void transact(int a, int b, int c){
		
		System.out.println("Product: \t"+ array2.identifier.get(a).getname());
		System.out.println("price: \t\t" + array2.identifier.get(a).getprice()+"PHP");
		System.out.println("Quantity: \t" + b+"Pcs");
		System.out.println("---------------------");
		System.out.println("Total: \t\t" + c+"PHP");	
	}
}
