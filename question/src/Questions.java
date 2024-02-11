

public class Questions {

    private final int number;
    private final String question;
    private final String ChoiceA;
    private final String ChoiceB;
    private final String ChoiceC;

    public Questions(int number,String question, String ChoiceA,String ChoiceB,String ChoiceC){
        this.number=number;
        this.question=question;
        this.ChoiceA=ChoiceA;
        this.ChoiceB=ChoiceB;
        this.ChoiceC=ChoiceC;
    }

    public int getNumber(){
        return this.number;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getChoiceA(){
        return this.ChoiceA;
    }

    public String getChoiceB(){
        return this.ChoiceB;
    }

    public String getChoiceC(){
        return this.ChoiceC;
    }
}
