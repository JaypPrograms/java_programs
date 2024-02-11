package try3.PhoneNumberDissector.src;
import java.util.Scanner; //import scanner in order to create a object scanner

/**
* @Programmer Jayperson Babaran
* @Description: this program that reads phone numbers, and for each phone number, it displays the phone number’s 
*               three components –country code, area code, and local number.
* Created Date: 05/13/2022
* Modified Date: 05/13/2022
* @Modified By: 05/13/2022
*/
public class PhoneNumberChecker {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);// creating an object scanner for user input
        String number="";
        int index,code;

        //start of while to continue looping or running the program until the user choose to close the program.
        while(!number.equalsIgnoreCase("q"))
        {
            System.out.println("Enter a phone number in the form cc-area-local,where cc = country code digits, area = area code digits,and local = local phone digits.");
            System.out.print("Or enter q to quit:");
            number=scan.nextLine();

            if(!number.equalsIgnoreCase("q")) //if the condition is true in this statement it will show all the code
            {
                index=number.indexOf('-');  //checking the dash to know where to start of counting of code number.
                System.out.print("\nCountry code = " + number.substring(0,index)+"\n\n"); //outprint of code number
                
                code=index+1;
                index=number.indexOf('-', code); //checking the dash to know where to start of counting of code number.
                System.out.print("Area code = " + number.substring(code,index)+"\n\n");//outprint of code numb

                index++;
                System.out.print("Local phone number = " + number.substring(index)+"\n\n");//outprint of code numb

            }
            else
            {
                System.out.println("Thank you.");
            }
        }
        scan.close();//closing the scanner.
    }
}
