package course3module1.src.employee;

//import package that will be use in the program
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Employee {

    //instance variable
    private String name, socialSecurityNumber;
    private int birthMonth, birthweek;
    
    //load method that will set the value of the instance variable 
    public Employee load(String name, String socialSecurityNumber, int birthMonth, int birthweek) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthMonth = birthMonth;
        this.birthweek = birthweek;

        return this;
    }

    public String toString() {//method that will outprint the earnings and also some of the instance variable
        
        return String.format("%s%-25s %s %s", "\n", "Employee:", name, "\n")
             + String.format("%-25s %s %s", "Social Security Sumber: ", socialSecurityNumber, "\n")
             + String.format("%-25s %s %s", "Paycheck: ", getEarnings(), "\n");

    }

    public int getBonus(){//method that will check and compute if the user is eligible for bonus or not the add to their earnings and return it
        int bonus=0, additional=1, bonusValue=100;

        Calendar calendar=Calendar.getInstance();
        int month =calendar.get(Calendar.MONTH)+additional;
        int week =calendar.get(Calendar.WEEK_OF_MONTH);

        if(this.birthMonth==month && this.birthweek==week){
            bonus+=bonusValue;           
        }
        return bonus;
    }

    abstract double getEarnings();//this method will be override in other class

    static int trycatchint(Scanner scan, String outprint)//class methods for try catch
    {  
        //local variables
        int number=0;
        boolean loop=false;
        
        while(!loop){//continues loop until "loop" become true
            try{
                System.out.print(outprint);
                number=scan.nextInt();
                loop=true;
            }catch(InputMismatchException e){//catch if the user input other data type than int
                System.out.println("INVALID input!! Try again.");
                scan.nextLine();
            }
        }
        return number;
    }

    static double trycatchdouble(Scanner scan, String outprint)//class methods for try catch
    {  
        //local variables
        double number=0;
        boolean loop=false;
        
        while(!loop){//continues loop until "loop" become true
            try{
                System.out.print(outprint);
                number=scan.nextDouble();
                loop=true;
            }catch(InputMismatchException e){//catch if the user input other data type than int
                System.out.println("INVALID input!! Try again.");
                scan.nextLine();
            }
        }
        return number;
    }

    

}
