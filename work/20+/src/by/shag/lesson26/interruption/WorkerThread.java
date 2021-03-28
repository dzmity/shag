package by.shag.lesson26.interruption;

public class WorkerThread extends Thread {

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
            if (i % 100 == 0 && isInterrupted()) {
                System.out.println("Loop is interrupted at i = " + i);
                break;
            }
        }
    }
}
