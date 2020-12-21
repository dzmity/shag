import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {
        switchMethod();
    }


    public static void switchMethod() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 5
        int b = scanner.nextInt(); //3

        for (int j = 1; j <= b; j++) {
            for (int i = 1; i <= a; i++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
