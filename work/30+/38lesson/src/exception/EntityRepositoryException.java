package exception;

public class EntityRepositoryException extends Exception {

    public EntityRepositoryException() {
        super();
    }

    public EntityRepositoryException(String message) {
        super(message);
    }

    public EntityRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
