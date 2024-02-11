package project2;

public class product2 {

	private String name;
	private int price;
	private int quantity;
	private int sold;
	private int sales;
	
	public product2(String name, int price, int quantity, int sold, int sales){
		
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.sold=sold;
		this.sales=sales;		
	}
	
	public String getname() {
		return name;
	}
	public int getprice() {
		return price;
	}
	public int getquantity() {
		return quantity;
	}
	public int getsold() {
		return sold;
	}
	public int getsales() {
		return sales;
	}
	public void setquantity (int quantity) {
		this.quantity=quantity;	
	}
	public void setsold (int sold) {
		this.sold=sold;	
	}
	public void setsales (int sales) {
		this.sales=sales;
	}
	}
