package task;

public final class Book implements Printable {

    private String name;
    private Genre genre;
    private String author;

    public Book(String name, String author, Genre genre) {

        this.genre = genre;
        this.name = name;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Книга с название = " + name
                + " автор = " + author
                +  " жанр = " + genre;
    }
}
