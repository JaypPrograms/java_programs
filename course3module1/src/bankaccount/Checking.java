package course3module1.src.bankaccount;

//import package that will be use in the program
import java.text.NumberFormat;
import java.util.Locale;

public class Checking extends BankAccount{
    
    
    public Checking(double balance) {//contructor method for the this class
        super(balance);
    }

    public void writeACheck(double number){// method that subtract the given amount from the current balance and then subtract an additional $1 as part of a service fee.
        setBalance(getBalance()-(number+1));
    }

    public void display(){//method that been override for the superclass, it will display the remaining balance
        Locale usa = new Locale("en", "US");//instatitiate a locale to be use in outprint for dollar sign
        final NumberFormat dollar= NumberFormat.getCurrencyInstance(usa);//getting the currency
        System.out.println("Checking account balance= "+ dollar.format(getBalance()));
    }
    
}
