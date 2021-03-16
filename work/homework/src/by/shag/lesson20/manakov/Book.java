package by.shag.lesson20.manakov;


public class Book implements Comparable<Book> {

     private String name; //
     private Genre genre;//
     private int yearOfPublishing;//
     private String publisherName; //
     private Author listOfAuthors;
     private String bindingType;//

    public Book(String name, Genre genre, int yearOfPublishing, String publisherName, Author listOfAuthors, String bindingType) {
        this.name = name;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;
        this.publisherName = publisherName;
        this.listOfAuthors = listOfAuthors;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", yearOfPublishing=" + yearOfPublishing +
                ", publisherName='" + publisherName + '\'' +
                ", listOfAuthors=" + listOfAuthors +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Author getListOfAuthors() {
        return listOfAuthors;
    }

    public String getBindingType() {
        return bindingType;
    }


    @Override
    public boolean equals(Object o) {

        if(this == o) {
            return true;
        }
        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }
        Book book = (Book) o;
        boolean result = false;


        String name = book.name;
        if (book.name == null) {
            result = this.name == null;
        } else {
            result = book.name.equals(this.name);
        }
        if (!result) {
            return false;
        }
        ////////////////////////////////
        String publisherName = book.publisherName;
        if (book.publisherName == null) {
            result = this.publisherName == null;
        } else {
            result = book.publisherName.equals(this.publisherName);
        }
        if (!result) {
            return false;
        }
        /////////////////////////////
        if (book.yearOfPublishing != this.yearOfPublishing) {
            return false;
        }
        ////////////////////////////
        if (book.genre == null) {
            result = this.genre == null;
        } else {
            result = book.genre == this.genre;
        }
        ////////////////////////////
        String bindingType = book.bindingType;
        if (book.bindingType == null) {
            result = this.bindingType == null;
        } else {
            result = book.bindingType.equals(this.bindingType);
        }
        if (!result) {
            return false;
        }
        ///////////////
        if (book.listOfAuthors == null) {
            result = this.listOfAuthors == null;
        } else {
            result = book.listOfAuthors == this.listOfAuthors;
        }

        ///////// НАДЕЮСЬ ПОРЯДОК СРАВНИВАНИЙ equals НЕ НА ЧТО НЕ ВЛИЯЕТ

        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (genre == null ? 0 : genre.hashCode());
        result = 31 * result + yearOfPublishing;
        result = 31 * result + (publisherName == null ? 0 : publisherName.hashCode());
        result = 31 * result + (listOfAuthors == null ? 0 : listOfAuthors.hashCode());
        result = 31 * result + (bindingType == null ? 0 : bindingType.hashCode());
        return result;
    }

    @Override
    public int compareTo(Book book) {
        int result =  this.name.compareTo(book.getName());
        if (result == 0) {
            result = this.publisherName.compareTo(book.getPublisherName());
        }if (result == 0) {
            result = this.genre.compareTo(book.genre);
//        }if (result == 0) {
//            result = -1 * this.yearOfPublishing.compareTo(book.getYearOfPublishing());  НА ГОДА ПОЧЕМУ ТО НЕ ХОЧЕТ СРАВНИВАТЬ
        }

        return result;

    }
}
