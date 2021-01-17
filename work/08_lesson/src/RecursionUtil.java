public class RecursionUtil {

    public static void doSomething() {
        System.out.println("123");
        doSomething();
    }

    public static void doSomethingWhile() {
        while (true) {
            System.out.println("123");
        }
    }

}
