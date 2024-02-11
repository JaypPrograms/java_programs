package course3module1.src.employee;

public class SalariedPlusCommission extends Employee{

    //instance variable
    private double sales, commission, pay;

    //load method that will set the value of the instance variable 
    public SalariedPlusCommission load(double sales, double commission,double pay, String name, String socialSecurityNumber, int birthMonth, int birthweek) {
        super.load(name, socialSecurityNumber, birthMonth, birthweek);
        this.sales=sales;
        this.commission=commission;
        this.pay=pay;

        return this;
    }

    public double getEarnings(){//method that been override from the superclass, this method will compute the earnings of the employee
        int maxSalary=1000;
        double salary=pay+(sales*commission);
        salary+=getBonus();

        if(salary>maxSalary){
            salary=maxSalary;
        }

        return salary;
    }
    
}
