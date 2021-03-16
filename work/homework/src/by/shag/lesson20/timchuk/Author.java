package by.shag.lesson20.timchuk;

public class Author implements Comparable<Author> {

    private String authorName;
    private String authorSurname;

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                '}';
    }

    public Author() {
    }

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

     public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public int compareTo(Author author) {
        if (authorName == null) {
            return 0;
        }
        int res = authorSurname.compareToIgnoreCase(author.authorSurname);
        if (res == 0) {
            res = authorName.compareToIgnoreCase(author.authorName);
        }
        return res;
    }
}

