public class Magazine implements Printable {

    private String name;
    private int issueNumber;

    public Magazine(String name, int issueNumber) {
        this.name = name;
        this.issueNumber = issueNumber;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public void print(String info) {
        System.out.println(this.toString() + " " + info);
    }

    @Override
    public String toString() {
        return "Magazine with name " + name
                + " with issue number = " + issueNumber;
    }
}
