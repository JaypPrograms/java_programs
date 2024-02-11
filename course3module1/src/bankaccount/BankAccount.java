package course3module1.src.bankaccount;

public abstract class BankAccount {
    //instance variable
    private double balance;

    public BankAccount(double balance){ //constructor method
        final int zero = 0;//local variable use in if condition

        if(balance<zero){//if the user input negative number it will true here and will make the value of balance 0
            balance=zero;
        }
        else{//else it will set the value
         this.balance=balance;
        }
    }

    public void deposit(double balance){//method that add the deposit value
        this.balance+=balance;
    }

    public void withdraw(double withdraw){//method that will deduc balance depends on how much the user withdraw
        final int zero = 0;
        this.balance-=withdraw;
        if(this.balance<=zero){
            this.balance=zero;
        }

    }

    public void setBalance(double balance){//setter method that will set the value of balance
        this.balance=balance;
    }

    public double getBalance(){//getter method to get the value of balance
        return this.balance;
    }

    abstract void display();//abstract method that will be override in other classes
   
}

