public class Main {

    public static void main(String[] args) {
        System.out.printf("Сумма = %.3f \n", Calculator.task1(5, 6));
        System.out.printf("Разность = %.3f \n", Calculator.task2(5.999, 6));
        System.out.printf("Произведение = %.3f \n", Calculator.task3(5.999, 6));
        System.out.printf("Частное = %.3f \n", Calculator.task4(5, -6));
        System.out.printf("Корень квадратный = %.3f \n", Calculator.task5(111));
        System.out.printf("Число меньше нуля? %b \n", Calculator.task6(-100));
        System.out.println((Calculator.task7(-1.0, 2, 3, 4, -2.6, 9.22)) ?
                "Есть данные меньше нуля" : "Нет данных меньше нуля");
        System.out.println((Calculator.task8(59)) ?
                "Данное число простое" : "Не является простым числом");
    }
}
