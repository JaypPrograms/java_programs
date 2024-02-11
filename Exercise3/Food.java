package Exercise3;

public class Food {
	
	private String item;
	private float price;
	private float fat;
	private float carbo;
	private float fiber;
	
	public Food(String item, float price, float fat, float carbo, float fiber ) {
		 
		this.item=item;
		this.price=price;
		this.fat=fat;
		this.carbo=carbo;
		this.fiber=fiber;		
	}
	
	public String getitem() {
		return item;
	}
	public float getprice() {
		return price;
	}
	public float getfat() {
		return fat;
	}
	public float getcarbo() {
		return carbo;
	}
	public float getfiber() {
		return fiber;
	}
}
