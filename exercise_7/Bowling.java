package try3.hello.src.exercise_7_copy;
import java.util.*;

public class Bowling { 
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 	game newgame = new game();
		choices cho = new choices();
		boolean loop=false;
		while(!loop){
			int num_player, num_choice;
			cho.newline();
			num_choice=cho.choice();
			switch(num_choice){
				case 1:
                cho.clearConsole();
				num_player = cho.userinputvalidation("Please enter the number of player (maximum of 6 players): ");
				if(num_player>0 && num_player<7){
					cho.clearConsole();
					newgame.start(num_player);
					newgame.finalandreset(num_player);
	
				} else{
				 System.out.format( "%s","Invalid input!!! you must enter number between 1 to 6.\n");
				 cho.enter();
				scan.nextLine();
				}
				cho.clearConsole();
				break;

				case 0:
					System.out.format("%82s","Thank you\n");
					loop=true;
				break;

				default:
					System.out.format( "%127s %71s","Invalid input!!! you must enter number between 1 to 6.\n"," ");
					cho.enter();
					scan.nextLine();
					cho.clearConsole();
			}
			
}
	scan.close();
}


}
