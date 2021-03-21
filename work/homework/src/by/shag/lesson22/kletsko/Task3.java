package by.shag.lesson22.kletsko;

public class Task3 {

    public static void main(String[] args) {

        WorkSpaces.searchElem2((a, b, c) -> {
            if (a > b && a > c) {
                System.out.print("Максимальный элемент: ");
                return a;
            }
            if (b > a && b > c) {
                System.out.print("Максимальный элемент: ");
                return b;
            }
            System.out.print("Максимальный элемент: ");
            return c;
        });

        WorkSpaces.searchElem2((a, b, c) -> {
            if (a < b && a < c) {
                System.out.print("Минимальный элемент: ");
                return a;
            }
            if (b < a && b < c) {
                System.out.print("Минимальный элемент: ");
                return b;
            }
            System.out.print("Минимальный элемент: ");
            return c;
        });

    }

}
