import java.rmi.AccessException;

public class BuggedCalculator2 extends BuggedCalculator {


    @Override
    public void makeNotStaticException() throws AccessException {
        System.out.println("Я в классе BuggedCalculator2");
//        throw new Exception();
        throw new AccessException("Я в классе BuggedCalculator2");

    }
}
