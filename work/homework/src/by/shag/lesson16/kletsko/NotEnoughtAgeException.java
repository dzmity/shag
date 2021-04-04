package by.shag.lesson16.kletsko;

public class NotEnoughtAgeException extends Exception {

    public NotEnoughtAgeException() {
    }

    public NotEnoughtAgeException(String message) {
        super(message);
    }

    public NotEnoughtAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughtAgeException(Throwable cause) {
        super(cause);
    }

}
