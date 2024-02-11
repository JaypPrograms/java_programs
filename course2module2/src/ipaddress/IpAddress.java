package course2module2.src.ipaddress;

/**
* Java Course 2 Module 2
*
* @author Jayperson Babaran
* @Description: a class of the program that stores an IP address as a dotted-decimal string and as four octet ints.
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class IpAddress {

	//instance variable for IpAddress
    private String dottedDecimal;
	private int firstOctet, secondOctet, thirdOctet, fourthOctet;
	
	public IpAddress(String dottedDecimal) //constructor method that set the value of dottedDecimal and also a value on every octet
	{
		int index,code; //local variable to be use to set the value of each octet
		
		this.dottedDecimal=dottedDecimal; //set the value of dottedDecimal
		
		index=this.dottedDecimal.indexOf('.'); //checking the position of every dot in order to limit the how many character will converted to integar
		this.firstOctet=Integer.parseInt(this.dottedDecimal.substring(0,index));//converting String into integer
		
		code=index+1;//setting up the the value of int code to limit how long will be converted into integer in dottedDecimal
        index=this.dottedDecimal.indexOf('.', code);//checking the position of every dot with declaration where to start to check in order to limit the how many character will converted to integar
		this.secondOctet=Integer.parseInt(this.dottedDecimal.substring(code,index));//converting String into integer
		
		code=index+1;//setting up the the value of int code to limit how long will be converted into integer in dottedDecimal
        index=this.dottedDecimal.indexOf('.', code);//checking the position of every dot with declaration where to start to check in order to limit the how many character will converted to integar
		this.thirdOctet=Integer.parseInt(this.dottedDecimal.substring(code,index));//converting String into integer
		
		index++; //increment the index to use in converting integer in the nextline
		this.fourthOctet=Integer.parseInt(this.dottedDecimal.substring(index));//converting String into integer		
	}
	
	public String getDottedDecimal()//method that return the value of dottedDecimal 
	{
		return this.dottedDecimal;
	}
	
	public int getOctet(int number)//method with parameter that deterimine what variable to be return
	{
		switch(number)
		{
		case 1: 
			return firstOctet;

		case 2:
			return secondOctet;
		
		case 3:
			return thirdOctet;
			
		case 4:
			return fourthOctet;
		
		default:
			return 0;
		}
	}
}
