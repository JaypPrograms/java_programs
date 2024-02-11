package course2module2.src.person;
/**
* Java Course 2 Module 2
*
* @author Jayperson Babaran
* @Description: A class of the program that simulates the creation and display of Person objects. 
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class Person {

    //instance variable for Person
    private String first, last;
	private static int numOfPeople;//class variable the increment everytime object is created
	
	public Person() //constructor method without parameter but set a value to a variable
	{
		this.first="John";
		this.last="Doe";
		numOfPeople++;//increment every time object created
	}
	
	public Person(String first, String last) //constructor method with parameter that set a value to a variable
	{
		this.first=first;
		this.last=last;
		numOfPeople++;
	}
	
	public void setFirst(String first)//setter method to set a value to the variable
    {
		this.first=first;
	}
	
	public void setLast(String last)//setter method to set a value to the variable
    {
		this.last=last;
	}
	
	public static int getNumOfPeople() //getter method to get the value of the variable
    {
		return numOfPeople;
	}
	
	public void printFullName()//method that print the first and last
	{
		System.out.println(first +" "+ last);
	}
}
