public class MyCustomnException extends Exception {


    public MyCustomnException(String message) {
        super(message);
    }

    public MyCustomnException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomnException(Throwable cause) {
        super(cause);
    }
}
