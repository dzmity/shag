public class FinalParent {

    private int field;

//    public FinalParent(int field) {
//        this.field = field;
//    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public final void doSomething() {
        System.out.println("12345");
    }
}
