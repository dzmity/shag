package by.shag.lesson22.kletsko;

public class Task2 {

    public static void main(String[] args) {
        WorkSpaces.searchElem((a, b) -> {
            if (a > b) {
                System.out.print("Максимальный элемент: ");
                return a;
            }
            System.out.print("Максимальный элемент: ");
            return b;
        });

        WorkSpaces.searchElem((a, b) -> {
            if (a < b) {
                System.out.print("Минимальный элемент: ");
                return a;
            }
            System.out.print("Минимальный элемент: ");
            return b;
        });

        new Thread(() -> {
            System.out.print("Факториал числа: ");
            System.out.println(WorkSpaces.calculateFactorial(5));
        }).start();

        new Thread(() -> {
            System.out.print("Простое число? - ");
            System.out.println(WorkSpaces.checkNum(11));
        }).start();
    }

}
