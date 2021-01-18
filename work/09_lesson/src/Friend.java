public class Friend {

    String name;
    int age;
    boolean male = true;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this(name);
        this.age = age;
    }

    public Friend(String name, int age, boolean male) {
        this(name, age);
        this.male = male;
    }
}
