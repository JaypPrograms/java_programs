import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       
        ProgramMethods method= new ProgramMethods();
        method.addQuestion();
        String[][] answers=new String[method.getQuestion().size()][2];
        int[] count=new int[3];

        Random rand= new Random();
        int arrayNum=0; 
        for(int index= method.getQuestion().size();index>0; index--){
            int ranNum=rand.nextInt(index);
            String answer;

            System.out.println("\n"+method.getQuestion().get(ranNum).getQuestion()+"\n\t"+
            method.getQuestion().get(ranNum).getChoiceA()+
            "\n\t"+method.getQuestion().get(ranNum).getChoiceB()+
            "\n\t"+method.getQuestion().get(ranNum).getChoiceC());

            answer=method.stringInput("Answer:");
            answers[arrayNum][0]=Integer.toString( method.getQuestion().get(ranNum).getNumber());
            answers[arrayNum][1]=answer;
            
             method.removeElement(ranNum);
             arrayNum++;

             if(answer.equalsIgnoreCase("A"))count[0]++;
             
             else if(answer.equalsIgnoreCase("B")) count[1]++;
             
             else count[2]++;
             
        }
        for(int index=0; index<answers.length; index++){
            System.out.println(answers[index][0]+"       "+answers[index][1]);
        }

        int higher=0;       
        for(int index=0; index<count.length; index++){
            if(higher<count[index]){
                higher=count[index];
            }
        }

        if(higher==count[0] && higher>count[1] && higher>count[2]){
            System.out.println("\n"+ method.getResult2()+"\n");
        }

        else if(higher==count[1] && higher>count[0] && higher>count[2]){
            System.out.println("\n"+ method.getResult3()+"\n");
        }

        else if(higher==count[2] && higher>count[0] && higher>count[1]){
            System.out.println("\n"+ method.getResult1()+"\n");
        }

        else if(higher==count[0] && higher==count[1]){
            System.out.println("\n"+ method.getResult3()+"\n");
        }

        else if(higher==count[0] && higher==count[2]){
            System.out.println("\n"+ method.getResult2()+"\n");
        }

        else if(higher==count[1] && higher==count[2]){
            System.out.println("\n"+ method.getResult1()+"\n");
        }  

    }
}
