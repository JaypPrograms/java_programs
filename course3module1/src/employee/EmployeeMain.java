package course3module1.src.employee;

//import package that will be use in the program
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        //local variable that will hold and use in the program
        int employees,choice, birthMonth,birthWeek, hourlyNumber=0, salariedNumber=0, withCommissionNumber=0;
        String name, socialSecurityNumber;

        employees=Employee.trycatchint(scan, "Number of employees: ");//promt the user to input how many employee with try catch

        //instatation of employee in array
        Hourly[] hourlyEmployee = new Hourly[employees];
        Salaried[] salariedEmployee = new Salaried[employees];
        SalariedPlusCommission[] salariedPlusCommissionEmployee = new SalariedPlusCommission[employees];

        for(int index=0; index<employees; index++){//loop for the user input to input a value to local variable that will be use to be a parameter in the instantation
            System.out.println("Type Hourly(1), Salaried(2), Salaried plus commission(3)");
            choice=Employee.trycatchint(scan,"Enter 1, 2, or 3 ==> "); //promt the user to input what type of employee is he/her inputing with try catch

            if(choice >0 && choice<4){//condition that will check if the user inputed a correct number 
                scan.nextLine();
                System.out.print("Name ==>");
                name=scan.nextLine();//user input for the name of employee
                System.out.print("Social security number ==>");
                socialSecurityNumber=scan.nextLine();//user input for the SSS number
                birthMonth=Employee.trycatchint(scan,"Birthday month (1-12) ==>");//user input for birthmonth with try catch
                birthWeek=Employee.trycatchint(scan,"Birthday week (1-4) ==>");//user input for birthWeek with try catch

                //if else condition that determine what type of employee is inputing
                if(choice==1){
                    //local variable
                    int hourWork;
                    double hourPay;
                   
                    hourPay=Employee.trycatchdouble(scan,"Hourly pay ==>");//user input for hourpay with try catch
                    hourWork=Employee.trycatchint(scan,"Hours worked this past week ==>");//user input for hourWork with try catch
                    System.out.println("");

                    //create a new a object and instatiated
                    hourlyEmployee[hourlyNumber]=new Hourly();
                    hourlyEmployee[hourlyNumber].load(hourPay, hourWork, name, socialSecurityNumber, birthMonth, birthWeek);
                    hourlyNumber++;//increment to determine how many hourly employee created
                }

                else if(choice==2){
                    //local variable
                    double salary;
                    salary=Employee.trycatchdouble(scan,"Salary ==>");//user input with try catch
                    
                    //create a new a object and instatiated
                    salariedEmployee[salariedNumber]= new Salaried();
                    salariedEmployee[salariedNumber].load(salary, name, socialSecurityNumber, birthMonth, birthWeek);
                    salariedNumber++;//increment to determine how many salariedEmployee created
                }

                else if(choice==3){
                    //local variable
                    double sales, rate, pay;
                    //user inputs with try catch
                    pay=Employee.trycatchdouble(scan,"Salary ==>");
                    sales=Employee.trycatchdouble(scan,"Sales for this past week ==> ");
                    rate=Employee.trycatchdouble(scan,"Sales commission rate (fraction paid to employee) ==>");

                    //create a new a object and instatiated
                    salariedPlusCommissionEmployee[withCommissionNumber]=new SalariedPlusCommission();
                    salariedPlusCommissionEmployee[withCommissionNumber].load(sales,rate,pay, name, socialSecurityNumber, birthMonth, birthWeek);
                    withCommissionNumber++;//increment to determine how many salariedPlusCommissionEmployee created
                }
            }
        }
        //for loops to outprint the employees
        for(int index=0; index<hourlyNumber; index++){
            System.out.println(hourlyEmployee[index].toString());
        }

        for(int index=0; index<salariedNumber; index++){
            System.out.println(salariedEmployee[index].toString());
        }

        for(int index=0; index<withCommissionNumber; index++){
            System.out.println(salariedPlusCommissionEmployee[index].toString());      
        }
        scan.close();
    }  
}
