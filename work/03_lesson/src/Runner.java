import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        // создаем объект класса сканер и передаем
        // в конструктор стандартный поток вывода
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        // возвращает истину, если введен целое число
        boolean isInt = scanner.hasNextInt();
        System.out.println(isInt);
        // вероятная ошибка
        int number = scanner.nextInt();
        System.out.println(number);








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
