package try3.hello.src.chapter10_exercise8;

import java.util.Scanner;

public class choices {
     Scanner scan = new Scanner(System.in);
     
    public  void check(String input){
       word arrayword = new word();

       input=input.replace(" ", "");
       char[] palindrome;
       palindrome= new char[input.length()];
       
       input.toCharArray();

        for (int index=0; index<input.length();index++) {
            palindrome[index]=input.charAt(index);           
        }
        arrayword.setPalindrome(palindrome);
        char [] check=arrayword.getPalindrome();

            for(int index=0;index<check.length;index++){

                if(check[index]==(check[check.length-(index+1)])){
    
                    if((index+1)==check.length){
                        space();
                        System.out.println("The word "+input+" is Palindrome");
                        space();
    
                    }
                }
                else{
                    space();
                    System.out.println("The word "+input+" is not Palindrome");
                    space();
    
                    break;
                }
    
            }
    }

    public void space(){
        System.out.println("");
    }

    public boolean looping(){

        String loop;
        System.out.println("");
		System.out.println("Do you want to run the programm again? Y(yes)/N(no)");
		System.out.print("Please enter your choice: ");
		loop = scan.nextLine();
        if(loop.equalsIgnoreCase("Y")) {	
            return false;	
        }
        
        else if(loop.equalsIgnoreCase("N")){
                System.out.println("Thank you ");
                return true;
            }
        else {
            System.out.print("Invalid Input!!! The program will be terminated. ");
            return true;
        }
}
    
}
