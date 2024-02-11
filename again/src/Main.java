import java.util.function.Function;
public class Main {

    public static void main(String[] args) {
        FunctionalProgramming student = new FunctionalProgramming("jayp", "babaran", "sd");


        Function<FunctionalProgramming, boolean> f = p ->{return  p.getFullName().equals("jayp babaran") ? true: false;};

        System.out.println(student.getFullName());
        System.out.println(f.apply(student ));

    }
}



