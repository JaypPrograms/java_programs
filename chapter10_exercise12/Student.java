package try3.hello.src.chapter10_exercise12_copy;

import java.io.*;
public class Student implements Serializable {
 private String stuName[];
 private int[][] stuGrade;
 private String subject[];
 

 public Student(String[] name, int[][] is, String subject[]) {
 stuName = name;
 stuGrade = is;
 this.subject=subject;

 }
 public String toString() {
 String stuString="";
 for(int x=0; x<12; x++){
    stuString+="Name:          "+stuName[x]+"\n";
     for(int y=0; y<5; y++){
        stuString += subject[y]+"       " + stuGrade[x][y]+"\n";
 }  stuString+="\n"; }
 return(stuString);
 }

}
