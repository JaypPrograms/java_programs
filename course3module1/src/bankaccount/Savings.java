package course3module1.src.bankaccount;

//import package that will be use in the program
import java.text.NumberFormat;
import java.util.Locale;

public class Savings extends BankAccount{
     //instance variable
    private final double intRate;
    

        public Savings(double balance, double intRate) {//contructor method for the this class
        super(balance);
        this.intRate=intRate;
    }

    public void addInterest(){//this method calculate the interest and then add it to balance
        setBalance(getBalance()+(getBalance()*this.intRate));
    }

    public void display() {//method that been override for the superclass, it will display the remaining balance
        Locale usa = new Locale("en", "US");//instatitiate a locale to be use in outprint for dollar sign
        final NumberFormat dollar= NumberFormat.getCurrencyInstance(usa);//getting the currency
        System.out.println("Savings account balance = "+ dollar.format(getBalance()));
    }
    
}
