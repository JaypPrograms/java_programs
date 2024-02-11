package try3.hello.src.chapter_9exercise1;

public class Staff extends UEmployee {

    private String jobtitle;

    public Staff(String name, float salary, String jobtitle) {
        super(name, salary);
        this.jobtitle=jobtitle;

    }
   
    public String getJobtitle() {
        return jobtitle;
    }

    
    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

}
