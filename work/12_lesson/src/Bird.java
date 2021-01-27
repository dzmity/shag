public class Bird extends Animal2 implements Flyable, CanSwim {

    public Bird(double height) {
        super(height);
    }

    @Override
    public void fly() {
        System.out.println("Я птица. Я лечу.");
    }

    @Override
    public void swim() {
        System.out.println("Я птица. Я плаваю");
    }
}
