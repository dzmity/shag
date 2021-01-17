public class task77 {
    public static double summ(double number1, double number2) {
        return number1 + number2;
    }

    public static double sub(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double division(double number1, double number2) {
        return number1 / number2;
    }

    public static double root(double number1) {
        return Math.sqrt(number1);
    }

    public static boolean negativeNumber(int number1) {
        return number1 < 0;
    }

    public static boolean negativeNumberVarargs(int... numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("есть отрицательные числа : ");
                return true;
            }
        }
        System.out.println("Нет отрицательных чисел : ");
        return false;
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