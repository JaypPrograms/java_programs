package try3.module3.src;
import java.util.Scanner; //import scanner in order to create a object scanner

/**
* @Programmer Jayperson Babaran
* @Description: this program checks the properness of a given variable name.
* Created Date: 05/13/2022
* Modified Date: 05/20/2022
* @Modified By: Jayperson Babaran
*/

public class NameChecker {

    public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);// creating an object scanner for user input
 
    String name=""; 

    //start of while to continue looping or running the program until the user choose to close the program.
    while(!name.equalsIgnoreCase("q"))
    {
    String result="Good";
    System.out.print("Enter a variable name (q to quit): "); 
    name=scan.nextLine(); 
    
    /*Start of checking if the user input uppercase, lowercase or invalid input 
    *also checking if the user input special character or not in the remaining letter after checking the first letter 
    */
    if(Character.isLowerCase(name.charAt(0)))
    {
        for(int index=1; index<name.length(); index++)
        {
            if(!Character.toString(name.charAt(index)).matches("^[a-zA-Z0-9$_]*$"))
            {   
                result= "Illegal.";  
                break; // this will make the looping stop
            }
            else if(Character.toString(name.charAt(index)).matches("^[$_]*$")) 
            {
                result= "Legal, but uses poor style.";
            }
        }
    }
    //this condition is just a little appreciation to the user and saying thank you if the user input q
    else if(name.equalsIgnoreCase("q"))
    {
        System.out.println("Thank you");
    }
    //if the first letter is uppercase or other 2 character it will true in is else if statement
    else if((Character.isUpperCase(name.charAt(0)))|| (name.charAt(0)=='$')|| (name.charAt(0)=='_'))
    {
        for(int index=1; index<name.length(); index++)
        {
            if(!Character.toString(name.charAt(index)).matches("^[a-zA-Z0-9$_]*$"))
            {
                result= "Illegal.";
                break;
            }
            else if(name.length()==(index+1))
            {
                result= "Legal, but uses poor style.";
            }
        }
    }

    else //if the user input special character in first letter it will continue in this else statement
    {
        result= "Illegal";
    }

    System.out.println(result);//this part will output the result of the user inputted
    System.out.println(" ");
}
    scan.close();// closing the scanner
}

}
