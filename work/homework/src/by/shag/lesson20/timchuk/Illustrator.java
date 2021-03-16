package by.shag.lesson20.timchuk;

public class Illustrator implements Comparable<Illustrator> {

    private String illustratorName;
    private String illustratorSurname;

    @Override
    public String toString() {
        return "Illustrator{" +
                "illustratorName='" + illustratorName + '\'' +
                ", illustratorSurname='" + illustratorSurname + '\'' +
                '}';
    }

    public Illustrator() {
    }

    public Illustrator(String illustratorName, String illustratorSurname) {
        this.illustratorName = illustratorName;
        this.illustratorSurname = illustratorSurname;
    }

    public String getIllustratorName() {
        return illustratorName;
    }

    public String getIllustratorSurname() {
        return illustratorSurname;
    }

    @Override
    public int compareTo(Illustrator illustrator) {
        if (illustratorSurname == null) {
            return 0;
        }
        int res = illustratorSurname.compareToIgnoreCase(illustrator.illustratorSurname);
        if (res == 0) {
            res = illustratorName.compareToIgnoreCase(illustrator.illustratorName);
        }
        return res;
    }
}
