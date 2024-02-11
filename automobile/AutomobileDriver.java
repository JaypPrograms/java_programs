package course2module1.automobile;
import java.util.Scanner; //import scanner in order to create a object scanner

/**
* Java Course 2 Module 1
*
* @author Jayperson Babaran
* @Description: A main class of the program that can asks the user how many automobiles are to be described
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class AutomobileDriver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // creating an object scanner for user input
        int choice;
        String make="", color="" ,stringchoice; //variables to be use in the program 

        Automobile auto =new Automobile(); //creating an object named auto

        System.out.print("How many cars do you want to consider?: ");
        choice=scan.nextInt(); //user input to determine the how many cars the user want to determine

        for(int x=0; x<choice; x++) //start of for loop for the number of cars to be determine
        {
            boolean loop=false; //boolean for the while loop to continue the user input in the while until the user input a valid choice
            while(!loop)// start of while loop
            {
                System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p):");
                stringchoice=scan.next();//user input for the make the user choice

                /*Start of if else statement to determine what make will be set to the class automobile
                  also setting up a value to variable make to be set to the instance variable in the class automobile if the user input meet the condition
                  also if the user input meet the condition of one of the if else it will break the while else it will continue looping
                */
                if(stringchoice.equalsIgnoreCase("b"))
                {
                    make="Buick";
                    break; 
                }
                else if(stringchoice.equalsIgnoreCase("c"))
                {
                    make="Chevrolet";
                    break; 
                }
                else if(stringchoice.equalsIgnoreCase("p"))
                {
                    make="Pontiac";
                    break; 
                }
                else
                {
                    System.out.println("The only valid selections are 'b', 'c', or 'p'");    
                }
                }
                auto.setMake(make);//calling the set method setmake to assign a value to the variable make in the class automobile
            
            while(!loop)// start of while loop
            {
                System.out.print("Select blue, green, or red (b,g,r):");
                stringchoice=scan.next();//user input for the color the user choice

                /*Start of if else statement to determine what make will be set to the class automobile
                  also setting up a value to variable make to be set to the instance variable in the class automobile if the user input meet the condition
                  also if the user input meet the condition of one of the if else it will break the while else it will continue looping
                */
                if(stringchoice.equalsIgnoreCase("b"))
                {
                    color="Blue";
                    break; 
                }
                else if(stringchoice.equalsIgnoreCase("g"))
                {
                    color="Green";
                    break; 
                }
                else if(stringchoice.equalsIgnoreCase("r"))
                {
                    color="Red";
                    break; 
                }
                else
                {
                    System.out.println("The only valid selections are 'b', 'g', or 'r'");
                }
            }
            auto.setColor(color);//calling the set method setmake to assign a value to the variable make in the class automobile

            auto.printColor().printMake();//calling both method in one line to chain two printing method that pring color and make   
        }
        scan.close(); //closing the scanner
    }
}

