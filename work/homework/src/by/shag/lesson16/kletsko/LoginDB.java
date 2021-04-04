package by.shag.lesson16.kletsko;

public class LoginDB {

    public static String[] massLogin = {"qwerty", "AaaaA", "BBBbb", "CcC", "DdddDDD", "eeeEEE", "FFFfFF",
            "GGGGGggGG", "hhhhHHhhh", "JjJjJ"};

    public static boolean isVerifyLogin(String strLogin) {
        boolean res = false;
        for (int i = 0; i < massLogin.length; i++) {
            res = massLogin[i].equalsIgnoreCase(strLogin);
            if (res) {
                i = massLogin.length;
            }
        }
        return res;
    }
}
