public class Window {

    private boolean open;

    public void open() {
        boolean open = true;
        if (open == false) {
            open = true;
            this.open = true;
        }
        System.out.println("Window is already opened");
    }

    public boolean isOpen() {
        doNothing();
        return open;
    }

    private void doNothing() {
    }
}
