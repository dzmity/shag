public class Task {

    /*
    Раскомментируй одну строчку, чтобы программа вывела на экран числа - сначала 12, а затем 2.
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        // y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
