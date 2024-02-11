package try3.hello.src.chapter_9exercise1;

public class Faculty extends UEmployee{

    private String department;

    public Faculty(String name, float salary, String department) {
        super(name, salary);
        this.department=department;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
