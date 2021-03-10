package by.shag.lesson21;

public class Bicycle {

    private static int maxAcceptableWeight = 120;
//    private static int seatPostDiameter = 40 mm;

    private String model;
    private int weight;
    private Seat seat;
    private HandleBar handleBar;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public HandleBar getHandleBar() {
        return handleBar;
    }

    public void setHandleBar(HandleBar handleBar) {
        this.handleBar = handleBar;
    }

    public void start() {
        System.out.println("Поехали!");
    }
}
