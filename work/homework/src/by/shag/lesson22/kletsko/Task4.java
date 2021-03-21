package by.shag.lesson22.kletsko;

public class Task4 {

    public static void main(String[] args) {

        int[] mass = new int[]{1, 5, 4, 10};
        WorkSpaces.sum(mass, a -> true);
        WorkSpaces.sum((mass), a -> (a % 2 == 0));
        WorkSpaces.sum((mass), a -> (a % 2 == 1));

        int A = 2;
        int B = 21;
        WorkSpaces.sum(mass, a -> (a >= A && a <= B));
        WorkSpaces.sum(mass, a -> ((a % A) == 0));

    }

}
