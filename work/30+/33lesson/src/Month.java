public class Month {

    private Integer id;
    private String name;
    private Integer days;

    public Month(Integer id, String name, Integer days) {
        this.id = id;
        this.name = name;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Month{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", days=" + days +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getDays() {
        return days;
    }
}
