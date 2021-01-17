public class Calculator {

    // ШУСТОВА А.И. Метод Складывать
    public static double task1(double num1, double num2) {
        return num1 + num2;
    }

    // ШУСТОВА А.И. Метод Вычитать
    public static double task2(double num1, double num2) {
        return num1 - num2;
    }

    // ШУСТОВА А.И. Метод Умножать
    public static double task3(double num1, double num2) {
        return num1 * num2;
    }

    // ШУСТОВА А.И. Метод Делить
    public static double task4(double num1, double num2) {
        return num1 / num2;
    }

    // ШУСТОВА А.И. Принимать целое число и возвращать его корень квадратный.
    public static double task5(int num1)    {
        return Math.sqrt(num1);
    }

    // ШУСТОВА А.И. Принимать 1 целое число и проверять на отрицательность.
    // Возвращать true или false.
    public static boolean task6(int num1) {
        return num1 < 0;
    }

    //ШУСТОВА А.И. Принимать набор чисел (см. varargs) и проверять
    // если ли среди них отрицательные числа. Возвращать true или false.
    public static boolean task7(double... num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                return true;
            }
        }
        return false;
    }

    //ШУСТОВА А.И.Принимать 1 целое число и определять является
    // ли оно *простым числом. Возвращать true или false.
    public static boolean task8(int num) {
        int [] arr = {2, 3, 5, 7};
        for (int i = 0; i < arr.length ; i++) {
            if (num <= 1 || (num % arr[i] == 0 && num != arr[i])) {
                return false;
            }
        }
        return true;
    }
}