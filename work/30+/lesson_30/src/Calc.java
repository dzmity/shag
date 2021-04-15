public class Calc {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Нельзя делить на 0");
        }
        return a / b;
    }
}
