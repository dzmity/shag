package by.shag.exceptions.savostyanchik;

public class LoginAlreadyExistException extends RuntimeException {

    public LoginAlreadyExistException(String message) {
        super(message);
    }
}