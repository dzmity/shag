package lesson13;

public enum Genre {

    Classic("Classic", 3),
    FANTASY("Fantasy", 1),
    SCIENCE("Science", 2);

    private final String description;
    private final Integer order;

    Genre(String description, Integer order) {
        this.description = description;
        this.order = order;
    }

    public String getDescription() {
        return description;
    }

    public Integer getOrder() {
        return order;
    }

    public Genre valueOf2(String str) {
        String str2 = str.toUpperCase().trim();
        return Genre.valueOf(str2);
    }
}
