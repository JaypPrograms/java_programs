package try3.hello.src.chapter_9exercise2;

import java.util.Scanner;
 import java.text.NumberFormat;
 
 public class Bank {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        choices cho= new choices();
        boolean loop=false;
        int num_choice;
        // Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road","Mytown", "FL", "33445");
        PersonalAcct munozAccoun2 = new PersonalAcct(250, "jayp", "babaran", "mammbog 3","Bacoor", "Cavite", "4102");
        BusinessAcct munozAccoun3 = new BusinessAcct(550, "Mayk", "Chan", "Legian","Imus", "Cavite", "4103");
        double data;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        while(!loop){
            cho.newline();
            System.out.println("Please choose what account you want to transac.");
            System.out.println("[1]Personal Account");
            System.out.println("[2]Business Account");
            num_choice= cho.userinputvalidation("Enter Account: ");

            switch(num_choice){

                case(1):
                System.out.println(munozAccoun2);
                System.out.print("Enter deposit amount: ");
                data = input.nextDouble();
                munozAccoun2.deposit(data);
                System.out.println("Balance is: " + money.format(munozAccoun2.getBalance()));
                System.out.print("Enter withdrawal amount: ");
                data = input.nextDouble();
                munozAccoun2.withdrawal(data);
                if(munozAccoun2.getBalance()<100) munozAccoun2.charge_paccount(2);
                System.out.println("Balance is: " + money.format(munozAccoun2.getBalance()));
                    break;

                case(2):
                System.out.println(munozAccoun3);
            
                System.out.print("Enter deposit amount: ");
                data = input.nextDouble();
                munozAccoun3.deposit(data);
                System.out.println("Balance is: " + money.format(munozAccoun3.getBalance()));
                System.out.print("Enter withdrawal amount: ");
                data = input.nextDouble();
                munozAccoun3.withdrawal(data);
                if(munozAccoun2.getBalance()<500) munozAccoun3.charge_pbusiness(10);
                System.out.println("Balance is: " + money.format(munozAccoun3.getBalance()));
                    break;

            }
            loop=cho.looping("Do you want to do another transaction?");


            }
        }}