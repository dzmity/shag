package by.shag.exceptions.savostyanchik;

import java.util.Arrays;

public class PassportDb {
    static private String[] passportMass;

    public PassportDb() {
        passportMass = new String[]{
                "MC456889",
                "MC456789",
                "MC456232",
                "MC457789",
                "MC499789",
                "MC116789",
                "MC226789",
                "MC096789",
                "MC453989",
                "MC426781",
        };
    }

    static public boolean chekPassport(String passport) {
        for (String mass : passportMass) {
            if (passport.equals(mass)) {
                throw new PassportAlreadyExistException("Such a passport already exists");
            }
        }

        return false;
    }

    static public void addPassportToDb(String newPassport) {
        passportMass = Arrays.copyOf(passportMass, passportMass.length + 1);
        passportMass[passportMass.length - 1] = newPassport;
    }
}