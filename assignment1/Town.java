package course2module1.assignment1;

/**
* Java Course 2 Module 1
*
* @author Jayperson Babaran
* @Description: Town class that describes the demographics of small towns
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class Town{

    //instance variable
    private int numberOfAdults;
    private int numberOfChildren;
    
    public Town(int adults, int children) //constructor method that will set the value of the variables
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
        System.out.println("\nNumber of adults: "+ numberOfAdults);
        System.out.println("Number of children: "+ numberOfChildren);

    }
}

