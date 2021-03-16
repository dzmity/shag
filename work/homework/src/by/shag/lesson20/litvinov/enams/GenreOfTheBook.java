package by.shag.lesson20.litvinov.enams;

public enum GenreOfTheBook {

    AUTOBIOGRAPHICAL_NOVEL("Автобиографический роман"),
    FAIRY_TALES("Сказки"),
    CLASSIC("Классика"),
    SCIENCE_FICTION("Научная фантастика"),
    DETECTIVE_STORIES("Детективы");

    public String title;

    GenreOfTheBook(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "'" + title + "'";
    }
}