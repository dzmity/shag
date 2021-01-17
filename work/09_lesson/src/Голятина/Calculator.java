import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        ArrayList<Integer> numbersList = new ArrayList<>();

        System.out.printf("Результат сложения %s + %s = %.7s\n", 5.4, 6.3, addition(5.4, 6.3));
        System.out.printf("Результат вычитания %s - %s = %.7s\n", 25.4, 6.43, subtraction(25.4, 6.43));
        System.out.printf("Результат умножения %s * %s = %.7s\n", 65.4, 16.33, multiplication(65.4, 16.33));
        System.out.printf("Результат деления %s / %s = %.7s\n", 765.4, 6.113, division(765.4, 6.113));

        System.out.printf("Квадратный корень из %s = %.8s\n", 1765, squareRoot(1765));

        System.out.printf("Целое число %s отрицательное? %s ", -1765, isNegativeNumber(-1765));
        System.out.printf("Целое число %s отрицательное? %s\n", 765, isNegativeNumber(765));

        System.out.println("Ввод целых чисел для проверки на отрицательность. По окончании введите любой символ.");
        while (scanner.hasNextInt()) {
            numbersList.add(i, scanner.nextInt());
            i++;
        }
        System.out.printf("Есть ли отрицательные числа среди введенных пользователем? %s\n", isNegativeNumbersVar1(numbersList));

        System.out.printf("Есть ли отрицательные числа среди введенных %s? %s\n", "2,3,4,5,6,7,-7,8", isNegativeNumbersVar2(2, 3, 4, 5, 6, 7, -7, 8));
        System.out.printf("Есть ли отрицательные числа среди введенных %s? %s\n", "2,3,0,8", isNegativeNumbersVar2(2, 3, 0, 8));

        System.out.printf("Является ли простым числом %s? %s ", 1765, isSimpleNumber(1765));
        System.out.printf("Является ли простым числом %s? %s ", 0, isSimpleNumber(0));
        System.out.printf("Является ли простым числом %s? %s ", -1, isSimpleNumber(-1));

    }

    public static double addition(double number1, double number2) {
//        Складывать 2 числа(double) и возвращать результат(double).
        return number1 + number2;
    }

    public static double subtraction(double number1, double number2) {
//      вычитать 2 числа(double) и возвращать результат(double).
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
//        умножать 2 числа(double) и возвращать результат(double).
        return number1 * number2;
    }

    public static double division(double dividend, double divisor) {
//        делить 2 числа(double) и возвращать результат(double).
        return dividend / divisor;
    }

    public static double squareRoot(int number) {
//        Принимать целое число и возвращать его корень квадратный.
        return Math.sqrt(number);
    }

    public static boolean isNegativeNumber(int number) {
//        Принимать 1 целое число и проверять на отрицательность. Возвращать true или false.
        return (number < 0 ? true : false);
    }

    public static boolean isNegativeNumbersVar1(ArrayList<Integer> numbers) {
//        Принимать набор чисел (см. varargs) и проверять если ли среди них отрицательные числа. Возвращать true или false.
        for (Integer number : numbers) {
            if (number < 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNegativeNumbersVar2(int... numbers) {
//        Принимать набор чисел (см. varargs) и проверять если ли среди них отрицательные числа. Возвращать true или false.
//        Вариант второй
        for (int number : numbers) {
            if (number < 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSimpleNumber(int number) {
//        Принимать 1 целое число и определять является ли оно *простым числом. Возвращать true или false.
        if (number > 3) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        } else if (number < -3) {
            for (int i = -2; i > number; i--) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return (number != 0 ? true : false);
    }

    public static boolean primeNumber(int number) {
        if (number >= 1) {
            System.out.println("Число " + number + " - простое");
            return true;
        } else {
            System.out.println("Число простым не является! ");
            return false;
        }
    }
}
