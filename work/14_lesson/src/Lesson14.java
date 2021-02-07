public class Lesson14 {

    public static void main(String[] args) throws Exception {
        double result = 0;
//        BuggedCalculator.makeRuntimeException();
//        BuggedCalculator.division(1, 0);

//        BuggedCalculator.makeException();
        try {
//            BuggedCalculator.makeException();
            result = BuggedCalculator.division(1, 0);
//            result = BuggedCalculator.division(2, 1);
        } catch (ArithmeticException e) {
            throw new MyCustomnException("Эксепшн из кетча", e);
//            result = 1;
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new RuntimeException("Эксепшн из кетча");
//            throw new MyCustomnException("Эксепшн из кетча");
//            throw new MyCustomnException(e);


        } finally {
            System.out.println(result);
//            throw new RuntimeException("Я эксепшн из файнали");
        }
//        System.out.println("Konec");

        BuggedCalculator calculator = new BuggedCalculator();
        BuggedCalculator calculator2 = new BuggedCalculator2();
        calculator.makeNotStaticException();

    }

}
