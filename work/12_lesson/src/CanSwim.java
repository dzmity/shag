@FunctionalInterface
public interface CanSwim {

    default String swimOnBack() {
        return "123";
    }

    void swim();
}
