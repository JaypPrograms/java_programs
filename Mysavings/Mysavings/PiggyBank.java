package try3.hello.src.Mysavings.Mysavings;
import java.text.NumberFormat;
import java.util.Locale;
public class PiggyBank {
	
	
	private float total;
	 private int penny;
	 private int nickel;
	 private int dime;
	 private int quarter;
	
	public PiggyBank( float total) {	
		this.total = total;
	}
	
	public void setpenny (int setpenny) {
		penny+=setpenny;	
	}
	public  int getpenny() {
		return penny;		
	}

	public float val_penny(){
		return (penny/100f);
	}

	public void setnickel (int setnickel) {
		nickel+=setnickel;		
	}
	public  int getnickel() {
		return nickel;		
	}

	public float val_nickel(){
		return ((nickel*5)/100f);
	}

	public void setdime (int setdime) {
		dime+=setdime;		
	}
	public  int getdime() {
		return dime;		
	}

	public  float val_dime() {
		return ((dime*10)/100f);		
	}

	public void setquarter (int setquarter) {
		quarter+=setquarter;		
	}
	public  int getquarter() {
		return quarter;		
	}
	public  float val_quarter() {
		return ((quarter*25)/100f);		
	}

	public void witdraw_total () {
		System.out.println("withdaw complete");
		total=total-total;
		penny=penny-penny;
		nickel=nickel-nickel;
		dime=dime-dime;
		quarter=quarter-quarter;
	}
	public void settotal(){
		total=val_penny()+val_nickel()+val_dime()+val_quarter();
	}
	
	public float gettotal() {
		return total;		
	}

	void display(){
		Locale uslocale = new Locale( "en", "US");
		NumberFormat currency = NumberFormat.getCurrencyInstance(uslocale);
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t\t\tPiggy Bank ");
		System.out.println("------------------------------------------------------------");
		System.out.format("%10s %30s %15s","Coin", "Quantity", "Value\n");
		System.out.format("%5s %-11s %20s %16s %s","","Penny",getpenny(),val_penny(),"\n");
		System.out.format("%5s %-11s %20s %16s %s","","Nickel",getnickel(),val_nickel(),"\n");
		System.out.format("%5s %-11s %20s %16s %s","","Dime",getdime(),val_dime(),"\n");
		System.out.format("%5s %-11s %20s %16s %s","","Quarter",getquarter(),val_quarter(),"\n");
		System.out.println("");
		System.out.println("      Your current savings is:           "+currency.format(gettotal()));
		System.out.println("------------------------------------------------------------");
	}
}

