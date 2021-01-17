import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String ch = "";
        double a = 0;
        double b = 0;
        int s = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете: \n" + "1.Сложить/вычитать/умножать/делить.\n" + "2.Возведение в квадрат.\n" +
                "3.Проверить на отрицательность.\n" + "4.Проверить на отрицательност набор чисел - числа уже введены.\n" +
                "5.Проверка простого числа.");
        s = in.nextInt();

        switch (s) {
            case (1):
                a = in.nextDouble();
                ch = in.next();
                switch (ch) {
                    case ("+"):
                        b = in.nextDouble();
                        place(a, b);
                        break;
                    case ("-"):
                        b = in.nextDouble();
                        minus(a, b);
                        break;
                    case ("*"):
                        b = in.nextDouble();
                        multiply(a, b);
                        break;
                    case ("/"):
                        b = in.nextDouble();
                        divide(a, b);
                        break;
                }
                break;
            case (2):
                ch = in.next();
                switch (ch) {
                    case ("^"):
                        b = in.nextDouble();
                        root(b);
                        break;
                }
                break;
            case (3):
                a = in.nextDouble();
                negative(a);
                break;
            case (4):
                negativeNumbers(-2, -5, -6, -4);
                negativeNumbers(1, 54, 5, 7, 9);
                negativeNumbers(-1, 2, -3, 5, -6);
                break;
            case (5):
                a = in.nextDouble();
                primeNumber(a);
                break;
        }
    }

    public static double place(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static double minus(double a, double b) {
        double sum = a - b;
        System.out.println(sum);
        return sum;
    }

    public static double multiply(double a, double b) {
        double sum = a * b;
        System.out.println(sum);
        return sum;
    }

    public static double divide(double a, double b) {
        double sum = a / b;
        System.out.println(sum);
        return sum;
    }

    public static double root(double b) {
        System.out.println(Math.sqrt(b));
        return b;
    }

    public static boolean negative(double b) {
        boolean a = false;
        if (b > 0) {
            a = true;
        }
        System.out.println(a);
        return a;
    }

    public static void negativeNumbers(double... a) {
        boolean s = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                s = false;
                break;
            }
        }
        System.out.println(s);
    }

    public static void primeNumber(double a) {
        double b;
        boolean is = true;

        for (int i = 2; i <= a / 2; i++) {
            b = a % i;
            if (b == 0) {
                is = false;
            }
        }
        System.out.println(is);
    }
}