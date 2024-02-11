package project2;

public class case3 {
	private String name;
	private int unitsold;
	private int unitprice;
	private int totalsale;
		
	public case3(String name, int unitsold, int unitprice, int totalsale){
			
			this.name=name;
			this.unitsold=unitsold;
			this.unitprice=unitprice;
			this.totalsale=totalsale;		
	}
	
	public String getname() {
		return name;
	}
	
	public int getunitsold(){
		return unitsold;
	}
	
	public int getunitprice() {
		return unitprice;
	}
	public int gettotalsale() {
		return totalsale;
	}
//	public void setunit_price (int unit_price) {
//		this.unit_price=unit_price;	
//	}
//	public void setunit_quantity (int unit_quantity) {
//		this.unit_quantity=unit_quantity;	
//	}
//	public void setsubtotal (int unitsold) {
//		this.unitsold=unitsold;
//	}
}
