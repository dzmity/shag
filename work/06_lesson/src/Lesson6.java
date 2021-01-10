import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args) {
//        task01();
        task1();
    }

    public static void task01() {
        int mass2[] = new int [5];
        Arrays.fill(mass2, 7);
        System.out.println(mass2);
        System.out.println(Arrays.toString(mass2));

        int mass[][] = new int[3][];
//        mass[0] = new int[5];
//        Arrays.fill(mass[0], 8);
//        mass[1] = new int[5];
//        Arrays.fill(mass[1], 4);
//        mass[2] = new int[0];
        Arrays.fill(mass, new int[2]);
        System.out.println(Arrays.equals(mass[0], mass[1]));
        System.out.println(Arrays.deepToString(mass));

        int mass6[] = {1, 2, 3};
        int mass7[] = {1, 2, 3};
        int mass8[] = {1, 2, 5};

        System.out.println(Arrays.equals(mass6, mass7));
        System.out.println(Arrays.equals(mass6, mass8));

        int mass3[] = {3, 7, 5, 1, -4, 9};
        Arrays.sort(mass3);
        System.out.println(Arrays.toString(mass3));
    }


    public static void task1() {
        int mass[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        int summ = 0;
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = scanner.nextInt();
                summ += mass[i][j];
                count++;
            }
        }
        System.out.println("summa = " + summ);
        System.out.println("srednee arifmeti4eskoe = " +  (double) summ / count);

        System.out.println(Arrays.deepToString(mass));
        System.out.println((int) (Math.random() * 6 + 2));
    }


}
