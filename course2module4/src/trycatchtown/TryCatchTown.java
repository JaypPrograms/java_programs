package course2module4.src.trycatchtown;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Java Course 2 Module 4
*
* @author Jayperson Babaran
* @Description: Town class that describes the demographics of small towns
* Created Date: 5/18/2022
* Modified Date: 5/18/2022
* @Modified By: Jayperson Babaran
*
*/

public class TryCatchTown {
    
    //instance variable
    private int numberOfAdults;
    private int numberOfChildren;
    
    public TryCatchTown(int adults, int children) //constructor method that will set the value of the variables
    {
        this.numberOfAdults=adults;
        this.numberOfChildren=children;
    }

    public void simulateBirth(int birth)//method with parameter that will update or add value to the variable numberOfChildren depends on what the user input or choose in the main method
    {
        this.numberOfChildren+=birth;
    }

    public void printStatistics()//method that will print the value of variable
    {
        System.out.println("Number of adults: "+ numberOfAdults);
        System.out.println("Number of children: "+ numberOfChildren);

    }

     static int trycatch(Scanner scan, String outprint)//class methods for try catch
    {  
        //local variables
        int number=0;
        boolean loop=false;
        
        while(!loop){//continues loop until "loop" become true
            try
            {
                System.out.print(outprint);
                number=scan.nextInt();
                loop=true;
            }
            catch(InputMismatchException e)//catch if the user input other data type than int
            {
                System.out.println("INVALID input!! Try again.");
                scan.nextLine();
               
            }
        }
        return number;
    }
    
}
