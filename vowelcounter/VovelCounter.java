package course2module3.src.vowelcounter;

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

public class VovelCounter {
    private int[][] vowelCounts = new int[5][2];//instance variable

    public void processLine(String name)//method that will check every vowels in the word inputed by the user in the main class
    {
        String vowels []= {"A","E","I","O","U"};//local variable that will be use in checking the vowels
        
        for(int x=0; x<name.length(); x++)//loop for the lenght of the word inputed by the user
        {
            String letter= Character.toString(name.charAt(x)); //creating a variable named letter that will assign a value 
			for(int index=0; index<vowels.length; index++)//for loop for the vowels
        	{
        		if(letter.equalsIgnoreCase(vowels[index]))//checking the letter if vowel or not
        		{
        			if(Character.isLowerCase(name.charAt(x)))//checking if the letter if lowercase
        			{
        				vowelCounts[index][0]++;//increment
        			}
        			else
        			{
        				vowelCounts[index][1]++;//increment
        			}
        		}
        	}
        }

    }

    public void printSummary() //method that will print the counted vowel
    {
    	String vowels []= {"A","E","I","O","U"};//local variable that will be use in checking the vowels
    	for(int x=0; x<vowels.length; x++)//loop to print the value of array
    	{
    			System.out.format("%s %2s %s %2s %s %2s %s",vowels[x],vowelCounts[x][0],
    			" lowercase, ", vowelCounts[x][1], " uppercase, ", (vowelCounts[x][1]+vowelCounts[x][0]), " total\n");
    	}

    }
}
