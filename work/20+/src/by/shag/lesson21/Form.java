package by.shag.lesson21;

public class Form {

    private String login;
    private String year;

    public Form(String login, String year) {
        this.login = login;
        this.year = year;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
