package by.shag.lesson27.rafalovich.task5;

public class StringHolder {

    private String textLine;

    public synchronized String getTextLine() {
        return textLine;
    }

    public synchronized void setTextLine(String textLine) throws InterruptedException {
        this.textLine = textLine;
        notify();
        wait();
    }

    public synchronized void lastNotify() {
        notify();
    }
}
