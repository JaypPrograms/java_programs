package try3.plantGermanation;
import java.util.Scanner; //import scanner in order to create a object scanner


/**
* Java Course 2 Module 1
*
* @author Jayperson Babaran
* @Description: A main class of the program that out print the plant date, germinate date and intial height.
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class MapleTreeDriver
{   
    Scanner scan = new Scanner(System.in); // creating an object scanner for user input
   
    //declaration of variables
    private String plantDate;
    private String heightDate;
    private double height;

    public void plant() //method for user input and setting up the value of plantDate
    {
        System.out.print("Enter plant date (dd/mm/yyyy): ");
        plantDate= scan.nextLine();  
    }

    public void germinate()//method for user input and setting up the value of heightDate and height
    {
        System.out.print("Enter germination date (dd/mm/yyyy): ");
        heightDate=scan.nextLine();

        System.out.print("Enter observed height in meters: ");
        height =scan.nextDouble();
    }

    public void dumpData()// method to out print the value of every variables
    {
        System.out.println("");
        System.out.println("Plant date = "+ this.plantDate);
        System.out.println("Germinate date = "+ this.heightDate);
        System.out.println("Initial height = "+ this.height+ " meters");
    }
}
