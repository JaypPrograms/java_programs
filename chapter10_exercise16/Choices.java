package try3.hello.src.chapter10_exercise16_copy;
import java.util.*;

public class Choices {

    Scanner input = new Scanner(System.in);

    int userinputvalidation(String print){
		
		System.out.print(print);
		if(!input.hasNextInt()) {
			newline();
			System.out.println("invalid input");
			input.next();
			boolean looping =false;
			while(!looping) {
				System.out.println("You must input a whole number");
				System.out.print("Enter a number: ");
				if(!input.hasNextInt()) {
					input.next();
					newline();
					System.out.println("invalid input");
					newline();
				}
				else {
					looping=true;	
				}
		}}

				
			return input.nextInt();	
		}
    void user_choices(){
            System.out.println(" ==============================================");   
            System.out.println("|\t[1]/Add item.                         |");
            System.out.println("|\t[2]/Discontinuing an Item.            |");
            System.out.println("|\t[3]/Display all stock.                |");
            System.out.println("|\t[4]/Copy the object into file.        |");
            System.out.println("|\t[5]Close the program.                 |");
            System.out.println(" ==============================================");  
    
           }

    void newline() {
        System.out.println("");
        System.out.println();
        }

    String inputs(String sout){
        String inputed;
        System.out.print(sout);
        inputed=input.next();

        return inputed;
    }

    public boolean looping(String display){

        System.out.println("");
			System.out.println(display);
			System.out.print("Please enter your choice: ");
			String loop = input.next();
        if(loop.equalsIgnoreCase("Y")) {	
            newline();
            return false;	
        }
        
        else if(loop.equalsIgnoreCase("N")){
                System.out.println("Thank you ");
                newline();
                return true;
            }
        else {
            System.out.print("Invalid Input!!! The process will be terminated! ");
            newline();
            return true;
            
        }

        
}
    public void scan(){
        System.out.println("Please press enter to continue:");
        input.nextLine();
        input.nextLine();
    }
    
}
