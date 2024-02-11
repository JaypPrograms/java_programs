package course2module3.src.vowelcounter;
import java.util.Scanner;

/**
* Java Course 2 Module 3
*
* @author Jayperson Babaran
* @Description: A program that counts the number of occurrences of lowercase and uppercase vowels in entered lines of text.
* Created Date: 5/18/2022
* Modified Date: 5/18/2022
* @Modified By: Jayperson Babaran
*
*/

public class VowelCounterDriver {
    
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        VovelCounter countVowel= new VovelCounter();//creating a new object name countVowel
        String input=" ";

        while(!input.isEmpty())//Start of while loop that will continue looping until the user press enter
        {   
        input=" "; 
        System.out.print("Enter a line of characters (press enter by itself to quit):");
        input=scan.nextLine();

        countVowel.processLine(input);//calling the method processLine to check the vowel of the user input
        }

        countVowel.printSummary();//method to print how many vowel counted for "a" to "u"
        
        scan.close();

    }
    
}
