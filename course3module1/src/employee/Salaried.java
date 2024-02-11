package course3module1.src.employee;

public class Salaried extends Employee{

    //instance variable
    private double weeklySalary;

    //load method that will set the value of the instance variable 
    public Salaried load(double weeklySalary, String name, String socialSecurityNumber, int birthMonth, int birthweek) {
        super.load(name, socialSecurityNumber, birthMonth, birthweek);
        this.weeklySalary=weeklySalary;

        return this;
    }
    
    public double getEarnings(){//method that been override from the superclass, this method will compute the earnings of the employee
        int maxSalary=1000;

        double salary=weeklySalary+getBonus();

        if(salary>maxSalary){
            salary=maxSalary;
        }
        
        return salary;
    }
}
