package try3.hello.src.chapter10_exercise8;
import java.util.*;

public class Palindrome {

     
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        choices cho = new choices();
        boolean loop=false;

        while(!loop) {   
            String word;
            cho.space();
            System.out.print("Enter the word: ");
            word=scan.nextLine();
            cho.check(word);

            loop=cho.looping();   
    
    
     }
     scan.close();
    }
        
    }
    

