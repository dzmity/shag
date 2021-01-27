@FunctionalInterface
public interface CanSwimButterfly extends CanSwim {

    String BUTT_TECHNIC = "BUTT";

    void canSwimButterfly();

    @Override
    default void swim() {
        System.out.println("плыву баттом");
    }

    private void doSomething() {
        System.out.println("do something");
    }
}
