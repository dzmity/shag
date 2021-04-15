import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginServiceTest {

    private LoginService loginService;


    @BeforeEach
    void setUp() {
        loginService = new LoginService();
    }


    @Test
    void login() {
        String validEmail = "secret@gmail.com";
        String validPassword = "QwErTy";

        boolean result = loginService.login(validEmail, validPassword);

        assertTrue(result);
    }
}