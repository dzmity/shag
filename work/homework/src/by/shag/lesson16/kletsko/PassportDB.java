package by.shag.lesson16.kletsko;

public class PassportDB {

    public static String[] massPassport = {"MP123456", "Mc111111", "MP222222", "mp333333", "mC444444",
            "MC555555", "MP666777", "mp888888", "mc999999", "MP101010"};

    public static boolean isVerifyPassport(String strPassport) {

        boolean res = false;
        for (int i = 0; i < massPassport.length; i++) {
            res = massPassport[i].equalsIgnoreCase(strPassport);
            if (res) {
                i = massPassport.length; //он же break;
            }
        }
        return res;
    }
}
