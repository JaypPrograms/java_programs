import java.util.ArrayList;
import java.util.Scanner;

public class ProgramMethods {

    private ArrayList<Questions> questions = new ArrayList<Questions>();
    Scanner scan= new Scanner(System.in);

    public void addQuestion() {

        questions.add(new Questions(1,
                "You went to a party last night and when you arrived to school the next day, everybody is talking about something you didn’t do. What will you do?",
                "A. Avoid everything and go with your friends",
                "B. Go and talk with the person that started the rumors",
                "C. Go and talk with the teacher"));

        questions.add(new Questions(2,
                "What quality do you excel the most?",
                "A. Empathy",
                "B. Curiosity",
                "C. Perseverance"));
        questions.add(new Questions(3,
                "You are walking down the street when you see an old lady trying to cross, what will you do?",
                "A. Go and help her",
                "B. Go for a policeman and ask him to help",
                "C. Keep walking ahead"));

        questions.add(new Questions(4,
                "You had a very difficult day at school, you will maintain a ____ attitude",
                "A. Depends on the situation",
                "B. Positive",
                "C. Negative"));
        questions.add(new Questions(5,
                "You are at a party and a friend of yours comes over and offers you a drink, what do you do?",
                "A. Say no thanks",
                "B. Drink it until it is finished",
                "C. Ignore him and get angry at him"));

        questions.add(new Questions(6,
                "You just started in a new school, you will...",
                "A. Go and talk with the person next to you",
                "B. Wait until someone comes over you",
                "C. Not talk to anyone"));

        questions.add(new Questions(7,
                "In a typical Friday, you would like to..",
                "A. Go out with your close friends to eat",
                "B. Go to a social club and meet more people",
                "C. Invite one of your friends to your house"));

        questions.add(new Questions(8,
                "Your relationship with your parents is..",
                "A. I like both equally",
                "B. I like both equally",
                "C. I like my Mom the most"));
    }

    public ArrayList<Questions> getQuestion(){
        return questions;
    }

    public void removeElement(int number){
        questions.remove(number);
    }

    public String getResult1(){
        return "Self-Management You manage yourself well; You take responsibility for your own behavior and well-being.";
    }

    public String getResult2(){
        return "Empathy You are emphatic. You see yourself in someone else’s situation before doing rash decisions. You tend to listen to other’s voices.";
    }

    public String getResult3(){
        return "Self-Awareness You are conscious of your own character, feelings, motives, and desires. The process can be painful but it leads to greater self-awareness.";
    }

    public String stringInput(String outprint) {
        String result="";
        boolean isLoop=false;
        while(!isLoop){
            System.out.print(outprint);
            result = scan.nextLine();
            if (result.equalsIgnoreCase("A")|| result.equalsIgnoreCase("B")||result.equalsIgnoreCase("C")) {
                isLoop=true;
            }
            else{
                System.out.println("invalid input!");
            }
        }
        
        return result;
    }
}
