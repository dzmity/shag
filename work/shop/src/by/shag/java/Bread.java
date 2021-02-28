package by.shag.java;

public class Bread extends Product {

    private boolean sliced;
    private int weight;

    public boolean isSliced() {
        return sliced;
    }

    public void setSliced(boolean sliced) {
        this.sliced = sliced;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "sliced=" + sliced +
                ", weight=" + weight +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bread bread = (Bread) o;

        if (sliced != bread.sliced) return false;
        return weight == bread.weight;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (sliced ? 1 : 0);
        result = 31 * result + weight;
        return result;
    }
}
