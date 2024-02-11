package course3module1.src.savingsAccount;

 /**
* Java Course 3 Module 1
*
* @author Jayperson Babaran
* @Description:  class of the program that establishes two savings accounts with interest
* Created Date: 5/24/2022
* Modified Date: 5/24/2022
* @Modified By: Jayperson Babaran
*
*/

public class SavingsAccountDriver {
    public static void main(String [] args){
        
        //local variable to be use in the program
        double interest=0.05;
        int month=12;

        SavingsAccount.setAnnualInterestRate(interest);//adding a value to class variable\

        //creating on objects
        SavingsAccount saver1=new SavingsAccount(2000, 10002);
        SavingsAccount saver2=new SavingsAccount(3000,10003 );
        System.out.println("\nMonthly balances for one year with "+interest +" annual interest:");
        System.out.format("%-8s %-12s %-10s %-12s %s ","\nMonth","Account #","Balance","Account #","Balance\n");
        
        System.out.format("%s %-8s %-23s %-14s %s","",0,saver1, saver2 ,"\n");//outprint the value before first month

        //for loop to out print the balance with interest for every month
        for(int index=1; index<=month; index++){

            //adding the interest
            saver1.addMonthlyInterest();
            saver2.addMonthlyInterest();

            System.out.format("%s %-8s %-23s %-14s %s"," ",index,saver1, saver2 ,"\n");//outprint
        }
        //outprint the balance of 2 object
        System.out.println("\nFinal balance of both accounts combined: "+String.format("%.02f", saver1.getBalance()+saver2.getBalance()));
        System.out.println();
    }
    
}
