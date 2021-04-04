package by.shag.lesson16.kletsko;

public class LoginAlreadyExistException extends Exception {

    public LoginAlreadyExistException() {
    }

    public LoginAlreadyExistException(String message) {
        super(message);
    }

}
