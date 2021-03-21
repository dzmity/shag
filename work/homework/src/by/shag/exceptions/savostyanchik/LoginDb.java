package by.shag.exceptions.savostyanchik;

import java.util.Arrays;

public class LoginDb {

     private static String[] loginMass;


    public LoginDb() {
        loginMass = new String[]{
                "Vitaminka",
                "CmeTanKa",
                "LiMon4k",
                "AliceFox",
                "DIVERSANT_95",
                "Rosette",
                "3JIou_4uTeP",
                "Cherry",
                "3JIou_Bandit",
                "Mr.GameFun"
        };
    }

    public static boolean chekLogin(String login) {
        for (int i = 0; i < loginMass.length; i++) {
            if (login.equals(loginMass[i])) {
                throw new LoginAlreadyExistException("This login already exists, come up with another login");
            }
        }

        return false;
    }

    public static void addLoginToDB(String newLogin) {
        loginMass = Arrays.copyOf(loginMass, loginMass.length + 1);
        loginMass[loginMass.length - 1] = newLogin;
    }
}