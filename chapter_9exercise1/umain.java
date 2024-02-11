package try3.hello.src.chapter_9exercise1;
import java.text.NumberFormat;
import java.util.*;

public class umain {
    

    public static void main(String args[]){
        choices cho = new choices();
        Locale uslocale = new Locale( "en", "US");
        NumberFormat currency = NumberFormat.getCurrencyInstance(uslocale);

        Faculty employee1 = new Faculty("Rusell Sauli", 46000, "IT dept");
        Faculty employee2 = new Faculty("Mike lemuel Chan", 46000, "IT dept");

        Staff employee3 = new Staff("Joshua Nino Salimbao", 46000, "MIS");
        Staff employee4 = new Staff("Aubrey Rose Cordero", 46000, "Registrar");
        Staff employee5 = new Staff("Jayperson O. Babaran", 46000, "Accounting");

        cho.line2();
        System.out.format("%21s %32s %28s", "Name:","Salary", "Department\n");
        cho.asterisk();
        System.out.println("\t      *"+employee1.getName()+"\t\t\t"+currency.format(employee1.getSalary())+"\t\t"+employee1.getDepartment()+"    *");
        System.out.println("\t      *"+employee2.getName()+"\t\t\t"+currency.format(employee2.getSalary())+"\t\t"+employee2.getDepartment()+"    *");
        cho.asterisk();

        cho.line2();
        System.out.format("%21s %32s %28s", "Name:","Salary", "Job title\n");
        cho.asterisk();
        System.out.println("\t      *"+employee3.getName()+"\t\t"+currency.format(employee3.getSalary())+"\t\t"+employee3.getJobtitle()+"\t   *");
        System.out.println("\t      *"+employee4.getName()+"\t\t"+currency.format(employee4.getSalary())+"\t\t"+employee4.getJobtitle()+"  *");
        System.out.println("\t      *"+employee5.getName()+"\t\t"+currency.format(employee5.getSalary())+"\t\t"+employee5.getJobtitle()+" *");
        cho.asterisk();
    }
    
}
