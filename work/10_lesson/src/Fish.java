public class Fish extends Animal {

    private int finQuantity;


    public int getFinQuantity() {
        return finQuantity;
    }

    public void setFinQuantity(int finQuantity) {
        this.finQuantity = finQuantity;
    }


    @Override
    public void move() {
        System.out.println("I'm swimming!");
    }
}
