package course3module1.src.savingsAccount;

/**
* Java Course 3 Module 1
*
* @author Jayperson Babaran
* @Description: SavingsAccount class that establishes two savings accounts with interest
* Created Date: 5/24/2022
* Modified Date: 5/24/2022
* @Modified By: Jayperson Babaran
*
*/

public class SavingsAccount {
    

    private static double annualInterestRate;//class variable
    private double balance;//instance variable
    private final int ACCOUNT_NUMBER;//instance constant

    public SavingsAccount( double balance, int ACCOUNT_NUMBER){//constructor method 
        this.balance=balance;
        this.ACCOUNT_NUMBER=ACCOUNT_NUMBER;
    }

    public void addMonthlyInterest(){//method that will add the interest to the balance
        this.balance+=(balance * annualInterestRate / 12);
    }

    public static void setAnnualInterestRate(double interest){//class method that will set the value of class variable
        SavingsAccount.annualInterestRate=interest;
    }

    public String toString(){//method that will return the value of the variables to be outprinted in the main
        return ACCOUNT_NUMBER + "      " + String.format("%.02f", balance);
    }

    public double getBalance(){//getter method to get the value of balance
        return balance;
    }
}
