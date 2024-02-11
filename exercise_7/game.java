package try3.hello.src.exercise_7_copy;
import java.util.*;

public class game {
    players_number play = new players_number();
    Scanner scan = new Scanner(System.in);
    choices cho = new choices();

    public void start(int turn){    
        Random random = new Random();
        int number =166;  
        for(int x=0; x<10; x++) {       
			for(int z=0; z<turn; z++) {
                int strike =20,ran=11, pin = 10, sco1=0, sco2=0;
                System.out.format("%135s %s",cho.line(),"\n");
                System.out.format("%71s %30s %2s %30s" ,"*","Frame" ,(x+1),"*\n");
                System.out.format("%81s %s",cho.asterisknewline(),"\n");
                System.out.format("%71s %20s %s %s %36s","*", "Player",(z+1), "turn" ,"*\n");
                switch(z){
                    case(0):
                        for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.format("%71s %20s %s %-1s %2s %16s","*","Attemp",((y+1)+","),"total pin strike is:" ,down,"*\n");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player1.setPlay1_sco(strike);
                            System.out.format("%71s %23s %39s","*","STRIKE!!!","*");
                            System.out.println("");
                            if(y==0) sco1=down;
                            else if(y==1) sco2=down; 
                            break;		
                            }
                        else strike=15;
                        
                        if(y==0) sco1=down;
                        else if(y==1) sco2=down; 
                        }

                        if(pin>0) {
                            play.player1.setPlay1_sco(10-pin);
                            strike=10-pin;
                        }
                        play.player1.setname(sco1, sco2);
                        System.out.format("%71s %20s %s %s %2s %30s","*","Player",(z+1) ,"scored:",strike,"*\n");
                        System.out.format("%81s %s",cho.asterisknewline(),"\n");
                        System.out.format("%135s %s",cho.line(),"\n");
                    break;

                    case(1):                     
                    for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.format("%71s %20s %s %-1s %2s %16s","*","Attemp",((y+1)+","),"total pin strike is:" ,down,"*\n");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player2.setPlay1_sco(strike);
                            System.out.format("%71s %23s %39s","*","STRIKE!!!","*");
                            System.out.println("");
                            if(y==0) sco1=down;
                            else if(y==1) sco2=down; 
                            break;		
                            }
                        else strike=15;
                        
                        if(y==0) sco1=down;
                        else if(y==1) sco2=down; 
                        }

                        if(pin>0) {
                            play.player2.setPlay1_sco(10-pin);
                            strike=10-pin;
                        }
                        play.player2.setname(sco1, sco2);
                        System.out.format("%71s %20s %s %s %2s %30s","*","Player",(z+1) ,"scored:",strike,"*\n");
                        System.out.format("%81s %s",cho.asterisknewline(),"\n");
                        System.out.format("%135s %s",cho.line(),"\n");
                    break;

                    case(2):
                    for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.format("%71s %20s %s %-1s %2s %16s","*","Attemp",((y+1)+","),"total pin strike is:" ,down,"*\n");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player3.setPlay1_sco(strike);
                            System.out.format("%71s %23s %39s","*","STRIKE!!!","*");
                            System.out.println("");
                            if(y==0) sco1=down;
                            else if(y==1) sco2=down; 
                            break;		
                            }
                        else strike=15;
                        
                        if(y==0) sco1=down;
                        else if(y==1) sco2=down; 
                        }

                        if(pin>0) {
                            play.player3.setPlay1_sco(10-pin);
                            strike=10-pin;
                        }
                        play.player3.setname(sco1, sco2);
                        System.out.format("%71s %20s %s %s %2s %30s","*","Player",(z+1) ,"scored:",strike,"*\n");
                        System.out.format("%81s %s",cho.asterisknewline(),"\n");
                        System.out.format("%135s %s",cho.line(),"\n");
                    break;

                    case(3):
                    for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.format("%71s %20s %s %-1s %2s %16s","*","Attemp",((y+1)+","),"total pin strike is:" ,down,"*\n");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player4.setPlay1_sco(strike);
                            System.out.format("%71s %23s %39s","*","STRIKE!!!","*");
                            System.out.println("");
                            if(y==0) sco1=down;
                            else if(y==1) sco2=down; 
                            break;		
                            }
                        else strike=15;
                        
                        if(y==0) sco1=down;
                        else if(y==1) sco2=down; 
                        }

                        if(pin>0) {
                            play.player4.setPlay1_sco(10-pin);
                            strike=10-pin;
                        }
                        play.player4.setname(sco1, sco2);
                        System.out.format("%71s %20s %s %s %2s %30s","*","Player",(z+1) ,"scored:",strike,"*\n");
                        System.out.format("%81s %s",cho.asterisknewline(),"\n");
                        System.out.format("%135s %s",cho.line(),"\n");
                break;

                    case(4):
                    for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.format("%71s %20s %s %-1s %2s %16s","*","Attemp",((y+1)+","),"total pin strike is:" ,down,"*\n");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player5.setPlay1_sco(strike);
                            System.out.format("%71s %23s %39s","*","STRIKE!!!","*");
                            System.out.println("");
                            if(y==0) sco1=down;
                            else if(y==1) sco2=down; 
                            break;		
                            }
                        else strike=15;
                        
                        if(y==0) sco1=down;
                        else if(y==1) sco2=down; 
                        }

                        if(pin>0) {
                            play.player5.setPlay1_sco(10-pin);
                            strike=10-pin;
                        }
                        play.player5.setname(sco1, sco2);
                        System.out.format("%71s %20s %s %s %2s %30s","*","Player",(z+1) ,"scored:",strike,"*\n");
                        System.out.format("%81s %s",cho.asterisknewline(),"\n");
                        System.out.format("%135s %s",cho.line(),"\n");
                    break;

                    case(5):
                    for(int y=0; y<2; y++) {
                        int down = 0 + random.nextInt(ran);
                        System.out.format("%71s %20s %s %-1s %2s %16s","*","Attemp",((y+1)+","),"total pin strike is:" ,down,"*\n");
                        ran=ran-down;
                        pin=pin-down;
                        if(pin<=0) {
                            play.player6.setPlay1_sco(strike);
                            System.out.format("%71s %23s %39s","*","STRIKE!!!","*");
                            System.out.println("");
                            if(y==0) sco1=down;
                            else if(y==1) sco2=down; 
                            break;		
                            }
                        else strike=15;
                        
                        if(y==0) sco1=down;
                        else if(y==1) sco2=down; 
                        }

                        if(pin>0) {
                            play.player6.setPlay1_sco(10-pin);
                            strike=10-pin;
                        }
                        play.player6.setname(sco1, sco2);
                        System.out.format("%71s %20s %s %s %2s %30s","*","Player",(z+1) ,"scored:",strike,"*\n");
                        System.out.format("%81s %s",cho.asterisknewline(),"\n");
                        System.out.format("%135s %s",cho.line(),"\n");
                    break;
		        }
                    System.out.println("");
                    for(int c=0; c<97; c++) System.out.print("=");
                    System.out.print("Total Frame");
                    for(int c=0; c<49; c++) System.out.print("==");
                    System.out.println("");

                    System.out.print("Player name     |");
                    for(int a =1; a<11; a++) System.out.format("%10s %2s %4s","Frame",a,"|");
                    System.out.format("%7s %3s","Total", "|\n");
                    for(int b=0; b<103; b++) System.out.print("==");
                    System.out.println("");

                    for(int i=0; i<turn; i++){
                        
                        int ber;
                        ber =play.player1.getname().length();
                        switch(i){
                            case 0:
                            System.out.format("%s %"+(number)+"s %5s",play.player1.getname(),play.player1.getPlay1_sco(),"|\n");
                            break;

                            case 1:
                                if(play.player2.getname().length()<ber){
                            System.out.format("%s",play.player2.getname());
                            System.out.format("%"+(number+19)+"s %5s",play.player2.getPlay1_sco(),"|\n");
                            
                                }
                                else{
                                    System.out.format("%s %"+number+"s %5s",play.player2.getname(),play.player2.getPlay1_sco(),"|\n");
                                }              
                            break;

                            case 2:
                            if(play.player3.getname().length()<ber){
                                System.out.format("%s",play.player3.getname());
                                System.out.format("%"+(number+19)+"s %5s",play.player3.getPlay1_sco(),"|\n"); 
                                    }
                                    else{
                                        System.out.format("%s %"+number+"s %5s",play.player3.getname(),play.player3.getPlay1_sco(),"|\n");
                                    }  
                            break;

                            case 3:
                            if(play.player4.getname().length()<ber){
                                System.out.format("%s",play.player4.getname());
                                System.out.format("%"+(number+19)+"s %5s",play.player4.getPlay1_sco(),"|\n"); 
                                    }
                                    else{
                                        System.out.format("%s %"+number+"s %5s",play.player4.getname(),play.player4.getPlay1_sco(),"|\n");
                                    }   
                            break;

                            case 4:
                            if(play.player5.getname().length()<ber){
                                System.out.format("%s",play.player5.getname());
                                System.out.format("%"+(number+19)+"s %5s",play.player5.getPlay1_sco(),"|\n");
                                    }
                                    else{
                                        System.out.format("%s %"+number+"s %5s",play.player5.getname(),play.player5.getPlay1_sco(),"|\n");
                                    }   
                            break;

                            case 5:
                            if(play.player6.getname().length()<ber){
                                System.out.format("%s",play.player6.getname());
                                System.out.format("%"+(number+19)+"s %5s",play.player6.getPlay1_sco(),"|\n");

                                    }
                                    else{
                                        System.out.format("%s %"+number+"s %5s",play.player6.getname(),play.player6.getPlay1_sco(),"|\n");
                                    }   
                            break;

                            
                            default:
                            System.out.println("");
                            break;


                        }
                        for(int b=0; b<103; b++) System.out.print("==");
                        System.out.println("");
                    }
                    System.out.println("");
                    cho.enter();
                    scan.nextLine();
                      
            }
            cho.clearConsole();          
            number=number-18;
            } 
            
        }
        public void finalandreset(int players){

            System.out.println("");
            System.out.format("%135s %s",cho.line(),"\n");
            System.out.format("%71s %33s %30s","*","Final score:","*\n");
            for(int x=0; x<players; x++){
                int holder=0;
                if(x==0) holder=play.player1.getPlay1_sco();
                else if (x==1)holder=play.player2.getPlay1_sco();
                else if (x==2)holder=play.player3.getPlay1_sco();
                else if (x==3)holder=play.player4.getPlay1_sco();
                else if (x==4)holder=play.player5.getPlay1_sco();
                else if (x==5)holder=play.player6.getPlay1_sco();
                System.out.format("%71s %20s %s %s %3s %21s","*","Player",(x+1),"final score is:",holder,"*\n");
            }
            System.out.format("%135s %s",cho.line(),"\n");

            System.out.println("");
            for(int c=0; c<97; c++) System.out.print("=");
            System.out.print("Final Score");
            for(int c=0; c<49; c++) System.out.print("==");
            System.out.println("");

            System.out.print("Player name     |");
            for(int a =1; a<11; a++) System.out.format("%10s %2s %4s","Frame",a,"|");
            System.out.format("%7s %3s","Total", "|\n");
            for(int b=0; b<103; b++) System.out.print("==");
                System.out.println("");

            for(int i=0; i<players; i++){
                
                switch(i){
                    case 0:
                    System.out.format("%s %4s %5s",play.player1.getname(),play.player1.getPlay1_sco(),"|\n");

                    break;

                    case 1:
                    System.out.format("%s %4s %5s",play.player2.getname(),play.player2.getPlay1_sco(),"|\n");             
                    break;

                    case 2:
                    System.out.format("%s %4s %5s",play.player3.getname(),play.player3.getPlay1_sco(),"|\n");
                    break;

                    case 3:
                    System.out.format("%s %4s %5s",play.player4.getname(),play.player4.getPlay1_sco(),"|\n");
                    break;

                    case 4:
                    System.out.format("%s %4s %5s",play.player5.getname(),play.player5.getPlay1_sco(),"|\n");  
                    break;

                    case 5:
                    System.out.format("%s %4s %5s",play.player6.getname(),play.player6.getPlay1_sco(),"|\n");  
                    break;

                    
                    default:
                    System.out.println("");
                    break;


                }
                for(int b=0; b<103; b++) System.out.print("==");
                System.out.println("");
            }
            System.out.println("");
            cho.enter();
            scan.nextLine();



            play.player1.reset_sco();
            play.player2.reset_sco();
            play.player3.reset_sco();
            play.player4.reset_sco();
            play.player5.reset_sco();
            play.player6.reset_sco();

            play.player1.resetname(1);
            play.player2.resetname(2);
            play.player3.resetname(3);
            play.player4.resetname(4);
            play.player5.resetname(5);
            play.player6.resetname(6);

        }





}
