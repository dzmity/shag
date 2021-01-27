public final class Book implements Printable {

    private String name;
//    private Genre genre;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public void print(String info) {
        System.out.println(toString() + " " + info);
    }

    @Override
    public String toString() {
        return "Книга с название = " + name
                + " автор = " + author;
    }

    //    public Book(String name, String author, Genre genre){
//
//        this.genre = genre;
//        this.name = name;
//        this.author = author;
//    }
}
