package by.shag.lesson24;

import java.io.Serializable;

public class Passport implements Serializable {

    private String seria;

    public Passport(String seria) {
        this.seria = seria;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "seria='" + seria + '\'' +
                '}';
    }
}
