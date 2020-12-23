import java.util.ArrayList;
import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
//        task01();
//        task02();
//        task0();
//        task1();
//        task2();
//        task3();
        task5();

    }

    private static void task01() {
        System.out.println((int) (Math.random() * 31 - 15));
        System.out.println((int) (Math.random() * 31 - 15));
        System.out.println((int) (Math.random() * 31 - 15));
        System.out.println((int) (Math.random() * 31 - 15));
        System.out.println((int) (Math.random() * 31 - 15));
        System.out.println((int) (Math.random() * 31 - 15));
    }


    public static void task02() {
        int mass[] =  new int [10];
        int[] mass2 =  new int [10];
        int a = 10;
        int[] mass3 =  new int [a];
        System.out.println(mass);

        int mass4[] = null;
        System.out.println(mass4);

        int mass5[] = new int[] {1, 4, 6};
        int mass6[] =  {1, 4, 6};
        String mass7[] = {"dsf", "dsafsda"};
        System.out.println(mass7[0]);
        System.out.println(mass7[1]);
        mass7[1] = "Cat Vasya";
        System.out.println(mass7[1]);

//        System.out.println(mass6[-1]);
        System.out.print("Razmer massiva = ");
        System.out.println(mass6.length);


        String mass8[] = {"aa","bb", "cc"};
        for (int i = 0; i < mass8.length; i++) {
            System.out.println(mass8[i]);
        }

//        for (int i = 0; i < mass8.length; i++) {
//            mass8[i] = "Nomer ya4eiki = " + i;
//            System.out.println(mass8[i]);
//        }

        for (int i = 0; i < mass8.length; i++) {
            System.out.println(mass8[i]);
        }

        for (String elementMassiva: mass8) {
            System.out.println(elementMassiva);
        }
    }


    public static void task0() {
        int mass[] = new int[10];

        for (int i = 0; i < mass.length; i++) {
            //mas[0 ] =  0+ 1;
            //mas[1 ] = 1 + 1;
            //mas[2 ] = 2 + 1;
            mass[i] = i + 1; // 10 - i;
            System.out.print(mass[i] + " ");
        }
    }

    public static void task1() {
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 10 - i;
            System.out.print(mass[i] + " ");
        }
    }

    public static void task2() {
        int mass[] = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 11);
            System.out.print(mass[i] + " ");
        }
    }

    public static void task3() {
        String mass[] = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.next();
        }

        for (int i = mass.length -1; i >= 0; i--) {
            System.out.println(mass[i]);
        }
    }

    public static void task5() {
        int mass[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }

        boolean isAllElemtsEqual = true;
        int firstElement = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (firstElement != mass [i]) {
                isAllElemtsEqual = false;
                break;
            }
        }
        if (isAllElemtsEqual) {
            System.out.println("vse ravnu");
        } else {
            System.out.println("ne vse ranvu");
        }
    }
}
