import java.util.Arrays;


public class Lesson8 {

    public static void printArray(int[] mass) {
        System.out.println(Arrays.toString(mass));
    }


    public static void main(String[] args) {
        long result = MathUtil.factorial(5);
        System.out.println(result);
//        RecursionUtil.doSomething();
//        int[] mass1 = {1, 2, 3};
//        String[] mass2 = {"1"};
//        int result = MathUtil.sum(mass1);
//        MathUtil.sum(mass2);
//        System.out.println(result);

//        MathUtil.printAllValuesFromDiapason(-100, 300);
//        A a = new A();
//        a.doSomething();
//          Calculator.summ(2100000000, -30000000);
//        int result = Calculator.summ(12, -3);
//        System.out.println(result);
//        Window window1 = new Window();
//        window1.doNothing();
//        boolean open = window1.isOpen();
//
//        System.out.println(open);
//        window1.open();
//        open = window1.isOpen();
//        System.out.println(window1.open);
//        System.out.println(open);


//        int[] mass1 = {1, 2, 3, 4};
//        printArray(mass1);




//        int[] t1 = {5, 4, 3, 2, 1};
//        int[] t2 = {0, 0, 0, 0, 0};
//        int[] t3 = {0, 0, 0, 0, 0};
//        makeReplacement(t1, t2, t3);
    }

    public static void moveRing(int[] from, int[] to) {
        int topRingIndex = findTopRingIndex(from);
        if (topRingIndex == -1) {
            return;
        }
        int ringSize = from[topRingIndex];
        from[topRingIndex] = 0;
        topRingIndex = findTopRingIndex(to);
        to[topRingIndex + 1] = ringSize;
    }

    public static int findTopRingIndex(int[] tower) {
        for (int i = tower.length - 1; i >= 0; i--) {
            if (tower[i] != 0) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }

    public static void makeReplacement(int[] from, int[] to1, int[] to2) throws InterruptedException {
        Thread.sleep(1000);
        System.out.print(Arrays.toString(from));
        System.out.print("---");
        System.out.print(Arrays.toString(to1));
        System.out.print("---");
        System.out.print(Arrays.toString(to2));
        System.out.println("---");


        moveRing(from, to1);
        moveRing(from, to2);
        moveRing(to1, to2);
        while (from[0] != 0) {
            moveRing(from, to1);
            makeReplacement(to2, to1, from);
        }
    }
}
