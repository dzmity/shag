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
//        task5();

//        task7();
//        task8();
        task10();
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
        int mass[] = new int[10];
        int[] mass2 = new int[10];
        int a = 10;
        int[] mass3 = new int[a];
        System.out.println(mass);

        int mass4[] = null;
        System.out.println(mass4);

        int mass5[] = new int[]{1, 4, 6};
        int mass6[] = {1, 4, 6};
        String mass7[] = {"dsf", "dsafsda"};
        System.out.println(mass7[0]);
        System.out.println(mass7[1]);
        mass7[1] = "Cat Vasya";
        System.out.println(mass7[1]);

//        System.out.println(mass6[-1]);
        System.out.print("Razmer massiva = ");
        System.out.println(mass6.length);


        String mass8[] = {"aa", "bb", "cc"};
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

        for (String elementMassiva : mass8) {
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

        for (int i = mass.length - 1; i >= 0; i--) {
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
            if (firstElement != mass[i]) {
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

    public static void task7() {
        int numbers[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
//                System.out.println("numbers[" + i + "] = " + numbers[i]);
                System.out.println(String.format("numbers[%s] = %s", i, numbers[i]));
            }

        }
    }

    public static void task8() {
        byte numb[] = new byte[15];
        for (int i = 0; i < numb.length; i++) {
            //[0 , 1)
            // 3 [0 , 3)
            // 5 [0 , 5)
            // 6 [0 , 5]
            // [ 0 12 ] -5  7
            numb[i] = (byte) (Math.random() * 13 - 5);
        }

        byte minElement = numb[0];
        for (int i = 1; i < numb.length; i++) {
            if (minElement > numb[i]) {
                minElement = numb[i];
            }
        }
        System.out.println(minElement);
    }

    public static void task10() {
        byte numb[] = new byte[20];
        for (int i = 0; i < numb.length; i++) {
            numb[i] = (byte) (Math.random() * 7 - 3);
        }

        byte maxElement = numb[0];
        int index = 0;
        for (int i = 1; i < numb.length; i++) {
            System.out.println(String.format("numbers[%s] = %s", i, numb[i]));

            if (maxElement <= numb[i]) {
                maxElement = numb[i];
                index = i;
            }
        }
        System.out.println(
                String.format("Max element = %s, index = %s", maxElement, index));
    }
}
