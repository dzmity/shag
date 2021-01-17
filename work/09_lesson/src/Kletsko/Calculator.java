import java.util.Scanner;

public class Calculator {

    public static double sum(double a, double b) {
        double sum = 0;
        sum = a + b;
        return sum;
    }

    public static double diff(double a, double b) {
        double diff = 0;
        diff = a - b;
        return diff;
    }

    public static double mul(double a, double b) {
        double mul = 0;
        mul = a * b;
        return mul;
    }

    public static double div(double a, double b) {
        double div = 0;
        div = a / b;
        return div;
    }

    public static int root(int a) {
        double res = 0;
        res = Math.sqrt(a);
        return (int)res;
    }

    public static boolean check(int a) {
        if (a < 0) {
            return true;
        } else {
           return false;
        }
    }

    public static boolean check(int ... a) {
        boolean check = false;
        for (int i = 0; i < a.length ; i++) {
           if (a[i] < 0) {
               check = true;
           } else {
               check = false;
           }
        }
        return check;
    }

    public static boolean check2(int a) {
        boolean check = false;


        for (int i = 2; i < a; i++){
            if (a % i == 0){
                check = false;
                break;
            } else {
                check = true;
                break;
            }
        }
        return check;
    }

    public static boolean checkNum(int a){
        boolean check = true;
        if (a == 0){
            check = false;
        }
        if (a == 1){
            check = false;
        }
        if (a > 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
            }
        }

        return check;
    }

    public static void main(String[] args) {
       double a = 0;
       double b = 0;
       int num = 0;
       int choose = 0;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Выберите действие:");
       System.out.println("1. Сложение;\n2. Вычитание;\n3. Умножение;\n4. Деление;");
       System.out.println("5. Корень числа;\n6. Проверка числа на отрицательность;" +
                "\n7. Проверка чисел на отрицательность;\n8. Проверка на простое число;" +
                "\n9. Выход");
       choose = scanner.nextInt();

       switch (choose) {
           case 1:
               System.out.println("Введите первое число:");
               a = scanner.nextDouble();
               System.out.println("Введите второе число:");
               b = scanner.nextDouble();
               System.out.println(sum(a, b));
               break;
           case 2:
               System.out.println("Введите первое число:");
               a = scanner.nextDouble();
               System.out.println("Введите второе число:");
               b = scanner.nextDouble();
               System.out.println(diff(a, b));
               break;
           case 3:
               System.out.println("Введите первое число:");
               a = scanner.nextDouble();
               System.out.println("Введите второе число:");
               b = scanner.nextDouble();
               System.out.println(mul(a, b));
               break;
           case 4:
               System.out.println("Введите первое число:");
               a = scanner.nextDouble();
               System.out.println("Введите второе число:");
               b = scanner.nextDouble();
               System.out.println(div(a, b));
               break;
           case 5:
               System.out.println("Введите число:");
               num = scanner.nextInt();
               System.out.println(root(num));
               break;
           case 6:
               System.out.println("Введите число:");
               num = scanner.nextInt();
               System.out.println(check(num));
               break;
           case 7:
               System.out.println("Введите желаемое количество чисел:");
               int n = scanner.nextInt();
               int mass[] = new int[n];
               System.out.println("Вводите числа:");
               for (int i = 0; i < n; i++) {
                   mass[i] = scanner.nextInt();
                   System.out.println(check(mass[i]));
               }
               break;
           case 8:
               System.out.println("Введите число:");
               num = scanner.nextInt();
               System.out.println(check2(num));
               break;
           case 9:
               break;
       }

    }
}
