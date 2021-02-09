import java.util.List;

public class Box<T extends Product> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean find(List<T> list, T t) {
        return false;
    }

    ///isSameProduct(p)
}
