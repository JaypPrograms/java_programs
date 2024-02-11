package course2module1.assignment1;
import java.util.Scanner;//import scanner in order to create a object scanner

/**
* Java Course 2 Module 1
*
* @author Jayperson Babaran
* @Description: MainTown class that describes the demographics of small towns
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class MainTown
 {
    public static void main(String []args)
    {   
        Scanner scan = new Scanner(System.in);// creating an object scanner for user input

        //declaring variables to be use in the program
        int adult, children; 
        String choice=" "; 

        System.out.print("Please enter the number of adult: ");
        adult=scan.nextInt();//user input of value of adult that will be set to the variable in the class Mappletree

        System.out.print("Please enter the number of Children: ");
        children=scan.nextInt();//user input of value of children that will be set to the variable in the class Mappletree

        Town newHome = new Town(adult, children); //creating a new object name newHome with constructor with the value inputed by the user which is adult and children

        while(!choice.equalsIgnoreCase("q")){//Start of while loop that will continue looping until the user input a choice that will stop the program
            
            //output of choices
            System.out.println("[1]Show vital Statistic.");
            System.out.println("[2]Birth of one child.");
            System.out.println("[3]Birth of a pair of twins");
            System.out.println("[Q]To quit\n");
            System.out.print("Enter your choice: ");
            choice=scan.next();//user input of the user choose in choices

            switch(choice) //start of switch case
            {
                case "1"://if the user inputed of choose 1 in will call method printStatistic that will print the value of the Attributes in the object newHome
                    newHome.printStatistics();
                    break;
                
                case "2"://if the user inputed of choose 2 it will call the method simulatebirth that will add 1 children in the attribute children in the object newHome
                    newHome.simulateBirth(1);
                    break;
                
                case "3"://if the user inputed of choose 3 it will call the method simulatebirth that will add 1 children in the attribute children in the object newHome
                    newHome.simulateBirth(2);
                    break;
                
                case "q": case "Q"://if the user choose q or Q it will terminate the while loop and print Thank you.
                    System.out.println("Thank you");
                    break;

                default://else if the user inputed a value that is not in the choices it will go here.
                    System.out.println("Invalid input!!!");
            } 
            if(!choice.equalsIgnoreCase("q"))
            {
                System.out.println("");
                System.out.println("Please press enter to continue:"); 
                scan.nextLine(); scan.nextLine(); //this will make the program temporary stop until the user press enter
            }
            
        }
        scan.close(); //closing the scanner
    }
}
