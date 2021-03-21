package by.shag.lesson22.golatina;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaTasks {

    static Integer x = 2;
    static Integer y = 3;
    static Integer z = 4;

    public static ArrayList<Integer> doArrayList(int valueMass) {
        ArrayList<Integer> massForTask4 = new ArrayList<>();
        for (int i = 0; i < valueMass; i++) {
            massForTask4.add((int) (Math.random() * 11 - 5));
        }
        System.out.println("Массив для задания 4: " + massForTask4.toString());
        return massForTask4;
    }

    public static Integer calculateTheSumArrayElements(ArrayList<Integer> integerArrayList, Predicate<Integer> function) {
        Integer sum = 0;
        for (Integer element : integerArrayList) {
            if (function.test(element)) {
                sum += element;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        TaskForThreeNumbers myAddition = (a, b, c) -> a + b + c;
        System.out.printf("Подсчет суммы трёх целых чисел %s + %s + %s = %s \n", x, y, z, myAddition.forBack(x, y, z));

        TaskForThreeNumbers myMultiplication = (a, b, c) -> a * b * c;
        System.out.printf("Подсчет произведения трёх целых чисел %s * %s * %s = %s \n", x, y, z, myMultiplication.forBack(x, y, z));

        DoNothing localDateConsumer = () -> System.out.println("Вывод текущей даты " + LocalDate.now());
        localDateConsumer.doSomething();

        DoNothing localTimeConsumer = () -> System.out.println("Вывод текущей даты " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        localTimeConsumer.doSomething();

        BinaryOperator<Integer> checkMax = Math::max;
        System.out.printf("Максимум из двух %s и %s = %s \n", x, z, checkMax.apply(x, z));

        BinaryOperator<Integer> checkMin = Math::min;
        System.out.printf("Минимум из двух %s и %s = %s \n", x, z, checkMin.apply(x, z));

        UnaryOperator<Integer> factorial = a -> {
            int result = 1;
            while (a > 1) {
                result *= a;
                a--;
            }
            return result;
        };
        System.out.printf("Факториал числа %s = %s \n", z, factorial.apply(z));

        Predicate<Integer> simpleNumber = a -> {
            if (a < 4) {
                return false;
            }
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.printf("Проверка простое число или нет %s = %s \n", z, simpleNumber.test(z));

        TaskForThreeNumbers checkMaxForThreeNumbers = ((a, b, c) -> a >= b ? Math.max(a, c) : Math.max(b, c));
        System.out.printf("Максимум из трёх %s, %s, %s = %s \n", x, y, z, checkMaxForThreeNumbers.forBack(x, y, z));

        TaskForThreeNumbers checkMinForThreeNumbers = ((a, b, c) -> a <= b ? Math.min(a, c) : Math.min(b, c));
        System.out.printf("Минимум из трёх %s, %s, %s = %s \n\n", x, y, z, checkMinForThreeNumbers.forBack(x, y, z));

        ArrayList<Integer> massForTask4 = doArrayList((int) (Math.random() * 9 + 5));
        System.out.printf("Проверка на четность, сумма = %s \n", calculateTheSumArrayElements(massForTask4, a -> ((a % 2) == 0)));
        System.out.printf("Проверка на нечетность, сумма = %s \n", calculateTheSumArrayElements(massForTask4, a -> ((a % 2) != 0)));
        int firstLevel = (int) (Math.random() * 16 - 7);
        int secondLevel = (int) (Math.random() * 16 - 7);
        System.out.printf("Число находится в диапазоне от %s до %s, сумма = %s \n", firstLevel, secondLevel,
                calculateTheSumArrayElements(massForTask4,
                        a -> (firstLevel <= secondLevel) ? (a >= firstLevel && a <= secondLevel) : (a <= firstLevel && a >= secondLevel)));
        System.out.printf("Проверка на кратность параметру A = %s, сумма %s \n", x, calculateTheSumArrayElements(massForTask4, a -> ((a % x) == 0)));

    }

    @FunctionalInterface
    interface TaskForThreeNumbers {
        int forBack(int a, int b, int c);

    }

    @FunctionalInterface
    interface DoNothing {
        void doSomething();

    }

}
