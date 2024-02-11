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

public class DriverPerson {  
	public static void main(String[] args) {
        
		Person person1 = new Person();//creating an object named person1
		person1.printFullName();//calling method name printFullname
		Person person2 = new Person("Matt", "Thebo");//creating an object named person2 with parameter
		person2.printFullName();
		person1.setFirst("Paul");//calling set method setfirstname to set the value of variable
		person1.setLast("John");
		person1.printFullName();

		System.out.println("Total number of people= " + Person.getNumOfPeople());//calling the method getNumOfPeople to determine how many object created

	}
}
