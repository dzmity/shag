//import java.util.Scanner;

import java.util.Scanner;

public class Runner {

    public static void ifTask() {
        // создаем объект класса сканер и передаем
        // в конструктор стандартный поток вывода
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        // возвращает истину, если введен целое число
        boolean isInt = scanner.hasNextInt();
        // boolean isInt = false;
        if (isInt) {
            int abc = scanner.nextInt();
            System.out.println("Вы ввели = " + abc);
        } else {
            System.out.println("Error");
        }

    }

    public static void ifElseIf() {
        int b = -1;

        if (b < 0) {
            System.out.println("1 variant");
            System.out.println("b < 0");
        } else if (b >= 0 && b < 5) {
            System.out.println("2 variant");
            System.out.println("b от  0 до 4");
        } else {
            System.out.println("3 variant");
            System.out.println("b >= 5");
        }
        System.out.println("Конец");
    }

    public static void main(String[] args) {
        ifTask();
        // проверяем, являлось ли введенное значение
        // целым числом
//        if (isInt) {
//            // считываем из консоли значение целого числа
//            // в переименую x
//            int x = scanner.nextInt();
//            System.out.println("Вы ввели число " + x);
//        } else {
//            System.out.println("Это не целое число");
//        }
    }
}
