package course3module1.src.employee;

public class Hourly extends Employee {
    //instance variable
    private double hourlyPay;
    private int hourWork;

    //load method that will set the value of the instance variable 
    public Hourly load( double hourlyPay, int hourWork, String name, String socialSecurityNumber, int birthMonth, int birthweek){
        super.load(name, socialSecurityNumber, birthMonth, birthweek);
        this.hourlyPay=hourlyPay;
        this.hourWork=hourWork;

        return this;
    }

    public double getEarnings(){//method that been override from the superclass, this method will compute the earnings of the employee
        int maxSalary=1000;
        double salary=(hourWork*hourlyPay)+getBonus();

        final int regularWorkHour=40;
        final double overtimePay=((hourlyPay/2)+hourlyPay);

        if(hourWork>regularWorkHour){
            salary+= ((hourWork-regularWorkHour)*(overtimePay));
        }

        if(salary>maxSalary){
            salary=maxSalary;
        }

        return salary;

    }

}
