import java.util.List;

public class HumanNew {

    private String name;
    private Integer age;
    private List<Integer> marks;

    public HumanNew(String name, Integer age, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
