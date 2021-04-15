public class LoginService {

    private static final String EMAIL = "secret@gmail.com";
    private static final String PASSWORD = "QwErTy";

    public boolean login(String email, String password) {
        if (email == null || password == null) {
            throw new IllegalArgumentException();
        }

        if (email.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return (password.equals(PASSWORD) && email.equalsIgnoreCase(EMAIL));
    }
}
