package jpa.model;

import java.util.Objects;

public class Film {

    private Integer id;
    private String name;
    private Integer year;
    private Double rating;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Film film = (Film) o;
        return Objects.equals(id, film.id) &&
                Objects.equals(name, film.name) &&
                Objects.equals(year, film.year) &&
                Objects.equals(rating, film.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, rating);
    }
}
