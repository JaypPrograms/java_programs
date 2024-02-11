package course2module1.automobile;

/**
* Java Course 2 Module 1
*
* @author Jayperson Babaran
* @Description: A class of the program that can asks the user how many automobiles are to be described
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class Automobile {
    
    //instance variable for Automobile
    private String make;
    private String color;

    public void setMake(String make)//method that set the value of make
    {
        this.make=make;
    }

    public void setColor(String color)//method that set the value of color
    {
        this.color=color;
    }

    public Automobile printMake()//method that print out the value of make
    {
        System.out.println(make);
        return this; //return type that return the method
    }

    public Automobile printColor()//method that print out the value of color
    {
        System.out.print(color+" ");
        return this; //return type that return the method
    }
}
