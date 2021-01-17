public class MathUtil {

    private static int sum = 0;
    private static String a = "";

    public static void printAllValuesFromDiapason(int a1, int a2) {
        if (a1 == a2) {
            return;
        }

        if (a1 > a2) {
            for (int i = a2 + 1; i < a1; i++) {
                printEven(i);
            }
        } else {
            for (int i = a1 + 1; i < a2; i ++) {
                printEven(i);
            }
        }
    }

    public static int sum(int[] mass) {
        int sum = 0;

        for (int value : mass) {
            String a = "sfasd";
            sum += value;

        }
        System.out.println(a);
        return sum;
    }

    //5!  = 1 * 2 * 3 * 4 * 5
    public static long factorial(int a) {
        long result = 1;
        if (a == 1 || a == 0) {
            return result;
        }
        result = a * factorial(a - 1);
        return result;
    }

    private static void printEven(int i) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
}
