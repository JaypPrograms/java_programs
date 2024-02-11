package try3.hello.src.chapter10_exercise12_copy;
import java.util.*;
import java.io.*;
public class CourseGrades {

    
    
    public static void main(String args[])   throws IOException    {

        
        
        Scanner scan = new Scanner(System.in);
        choices cho= new choices();
        boolean loop =false;
        String[] subject = {"English ", "Math    ", "Science ", "Filipino", "PE      "};
        GradeBook allstudent = new GradeBook();
        int name_num, num_holder, num_choice, subject_num;

        allstudent.setarray();
        
        for(int x=0; x<12; x++){
            System.out.print("Enter the name of student "+(x+1)+": ");
            String name=scan.next();
            allstudent.setname(x, name);

            for(int y=0; y<5; y++){
                num_holder=cho.userinputvalidation("Please input grade in subject "+subject[y]+": ");
                allstudent.setgrades(x,y, num_holder);
            }
            cho.newline();
        }

        File stuFile = new File("student.dat");
        Student stu = new Student(allstudent.getname(), allstudent.getgrades(),subject);
        


        while(!loop){
        cho.grade_choices();
        num_choice=cho.userinputvalidation("please enter your choice: ");
        cho.newline();
       
            switch(num_choice){
                case 1:
                    allstudent.getGrades(subject);
                    cho.scan2();
                    break;
                case 2:
                    allstudent.showgrades(subject.length);
                    cho.scan2();
                    break;
                case 3:
                    for(int x=0; x<allstudent.namelenght(); x++){
                        System.out.println("["+(x+1)+"]"+allstudent.getnames(x)+" ");
                    }
                    name_num=cho.userinputvalidation("please enter the number of the student: ");

                    if(name_num>0 && name_num<=allstudent.stud_number()) System.out.println(allstudent.getnames(name_num-1)+" has a average grade of: "+ allstudent.getstudentAvg(name_num, subject.length));
                    cho.scan2();

                    break;
                case 4:
                    for(int x=0; x<allstudent.namelenght(); x++){
                        System.out.println("["+(x+1)+"]"+allstudent.getnames(x)+" ");
                    }
                    name_num=cho.userinputvalidation("please enter the number of the student: ");
                    if(name_num>0 && name_num<=allstudent.stud_number()){
                        for(int x=0; x<subject.length; x++){
                            System.out.println("["+(x+1)+"]"+subject[x]+"   ");
                        }
                        subject_num=cho.userinputvalidation("please enter the subject number: ");
                        if(subject_num>0 && subject_num<=subject.length) System.out.println(allstudent.getnames(name_num-1)+" grade in "+ subject[subject_num-1]+ " is: "+allstudent.testAvg(name_num, subject_num));
                        else System.out.println("invalid input!!!!!!");
                    }
                        else System.out.println("invalid input!!!!!!");
                        cho.scan2();
                    break;
                    

                case 5:
                    
                try {
                    /* write objects */
                   
                    FileOutputStream out = new FileOutputStream(stuFile);
                    ObjectOutputStream writeStu = new ObjectOutputStream(out);
                    writeStu.writeObject(stu);
                    writeStu.close();
                    System.out.println("Data written to file.");
                    
                    // /* read objects */
                    FileInputStream in = new FileInputStream(stuFile);
                    
                    ObjectInputStream readStu = new ObjectInputStream(in);
                    Student stu1 = (Student)readStu.readObject();
                    readStu.close();
                    
                    System.out.println(stu1);
                    
                    } catch (FileNotFoundException e) {
                    System.out.println("File could not be found.");
                    System.err.println("FileNotFoundException: " 
                    + e.getMessage());
                    } catch (IOException e) {
                    System.out.println("Problem with input/output.");

                    
                    System.err.println("IOException: " + e.getMessage());
                    } 
                    catch (ClassNotFoundException e) {
                    System.out.println("Class could not be used to cast object.");
                    System.err.println("ClassNotFoundException: " 
                    + e.getMessage());
                    }
                    cho.scan2();
                    break;
                
                case 6:
                    System.out.println("Thank you!!!!");
                    loop=true;

                    break;

                default:
                    System.out.println("Invalid input!!!!");
                    break;
                }

            }
            scan.close();
        }

    
}
    
