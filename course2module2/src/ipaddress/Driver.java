package course2module2.src.ipaddress;

/**
* Java Course 2 Module 2
*
* @author Jayperson Babaran
* @Description: a main class of the program that stores an IP address as a dotted-decimal string and as four octet ints.
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class Driver {

	public static void main(String[] args) {
		
		IpAddress ip = new IpAddress("216.27.6.136");//creating an object with constructor
		
		//out print the method called in ip
		System.out.println(ip.getDottedDecimal());
		System.out.println(ip.getOctet(4));
		System.out.println(ip.getOctet(1));
		System.out.println(ip.getOctet(3));
		System.out.println(ip.getOctet(2));
	}

}