package by.shag.lesson29.forkjoinpool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Runner {

    public static void main(String[] args) {
        int[] array = MathUtil.prepareArray();

        long startTime = System.currentTimeMillis();

        double sum = MathUtil.calculate(array);

        long endTime = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(endTime - startTime + " mS for the computing");

        //////////////////////////////////////////////////////////////

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        startTime = System.currentTimeMillis();

        sum = forkJoinPool.invoke(new RecursiveCalc(array, 0, array.length));

        endTime = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(endTime - startTime + " mS for the computing");

        forkJoinPool.shutdown();
    }

    private static class RecursiveCalc extends RecursiveTask<Double> {

        private final int[] array;
        private final int start;
        private final int end;

        public RecursiveCalc(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }


        @Override
        protected Double compute() {
            if (end - start <= 25_000) {
                return MathUtil.calculate(array, start, end);
            } else {
                int middle = start + ((end - start) / 2);
                RecursiveCalc left = new RecursiveCalc(array, start, middle);
                RecursiveCalc right = new RecursiveCalc(array, middle, end);
                invokeAll(left, right);
                return left.join() + right.join();
            }
        }
    }
}
