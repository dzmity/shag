package Dz;

public class Calculator {
    public static double summ(double arg1, double arg2) {
        return arg1 + arg2;
    }

    public static double subtraction(double arg1, double arg2) {
        return arg1 - arg2;

    }

    public static double multiplication(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static double division(double arg1, double arg2) {
        return arg1 / arg2;
    }

    public static double root(double arg1) {
        return Math.sqrt(arg1);
    }

    public static boolean positiveNumber(int arg1) {
        if (arg1 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean summa(int... arg) {

        for (int i = 0; i < arg.length; i++) {
            if (arg[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSimplyNumber(int arg) {

            if (arg > 0 && arg % 1 == 0 && arg % arg == 0) {
                return true;
            } else {
                return false;
            }
        }



    public static void main(String[] args) {

        System.out.println(Calculator.summ(1, 2));
        System.out.println(Calculator.subtraction(4, 2));
        System.out.println(Calculator.multiplication(3, 2));
        System.out.println(Calculator.division(4,2));
        System.out.println(Calculator.root( 9));
        System.out.println(Calculator.positiveNumber(1));
        System.out.println(Calculator.summa(4,7,8));
        System.out.println(checkSimplyNumber(-45));

    }
}