package try3.hello.src.chapter10_exercise12_copy;
import java.io.*;
public class GradeBook implements Serializable{

    choices cho = new choices();
    private String name[];
    private int grades[][];

  

    public int stud_number(){
        return name.length;
    }

    public void setname(int number, String names){      
        name[number]=names;
    }

    public void setgrades(int x, int y, int grade){
        grades[x][y]=grade;

    }

    public void setarray(){      
        name= new String[12];
        grades=new int[12][5];
    }

    public void getGrades(String []subject) {
        System.out.println("\t   ==================================================Student Grades==================================================");
        System.out.format("%20s %21s %21s %21s %21s %20s %-1s"," Name",subject[0],subject[1],subject[2],subject[3],subject[4],"");
        System.out.println();
        for(int x=0; x<name.length; x++){
            System.out.format("%20s", name[x]);
            for(int y=0; y<5; y++){
                System.out.format("%20s", grades[x][y]);
            }

            cho.newline();
        }
        System.out.println("\t   ==================================================================================================================");
    }

    public void showgrades(int sub_number){
        System.out.println("\t   ======================Student Average======================");
        System.out.println("\t          Name                                    Average");
        for(int x=0; x<name.length; x++){
            float grade_holder=0f;
            System.out.format("%22s",name[x]);
            for(int y=0; y<5; y++){
                grade_holder=grade_holder+grades[x][y];
            }
            System.out.format("%41s",grade_holder/sub_number);
            cho.newline();
        }
        System.out.println("\t   ===========================================================");
    }

    public float getstudentAvg(int num_choice, int sub_number){
        float average=0f;
        average=((grades[num_choice-1][0]+grades[num_choice-1][1]+grades[num_choice-1][2]+grades[num_choice-1][3]+grades[num_choice-1][4])/sub_number);
        return average;
    } 

    public float testAvg(int num_testAvg, int student){
        float testavg=0f;
        testavg=grades[num_testAvg-1][student-1];
        return testavg;

    }

    public String getnames(int x){
        return name[x];
    }

    public int namelenght(){
        return name.length;
    }

    public String toString() {
        String stuString;
        
        stuString = name[0] + " grade: " + grades[0][0];
        return(stuString);
        }

    public int[][] getgrades(){
        return grades;
    }

    public String[] getname(){
        return name;
    }

    public String name(){
        return name[0];
    }

}
