package by.shag.lesson16.kletsko;

public class Runner {

    public static void main(String[] args) {

        RegistrationForm a1 = new RegistrationForm("Ivanopulo", "VVVV", "Ivan",
                "Ivanov", 25, "mp555555", Region.MINSKAYA, "Minsk",
                "Lipovaya", 156, 25, "201222");
        System.out.println(a1.toString());
        System.out.println();

        RegistrationForm a2 = new RegistrationForm("123", "AAAA", "Vasya",
                "Vasilev", 1, "hhhh", Region.MOGILEVSKAYA, "Mogilev",
                "Pushkina", 23, 117, "222000");
        System.out.println(a2.toString());
        System.out.println();

        RegistrationForm a3 = new RegistrationForm("Lipa", "lipa", "Lena",
                "Lenova", 35, "mc785635", Region.GOMELSKAYA, "Gomel",
                "Lenina", 19, 17, "226007");
        System.out.println(a3.toString());
        System.out.println();

        RegistrationForm a4 = new RegistrationForm("Gen", "GGGG", "Gena",
                "Genoff", 85, "mc781111", Region.GOMELSKAYA, "Rechica",
                "Levaya", 1, 1, "224000");
        System.out.println(a4.toString());
        System.out.println();

        RegistrationForm a5 = new RegistrationForm("Ulik", "UUUU", "Ula",
                "Uliev", 44, "mc598521", Region.GRODNENSKAYA, "Grodno",
                "Korga", 22, 23, "223022");
        System.out.println(a5.toString());
        System.out.println();

        RegistrationForm a6 = new RegistrationForm("Sa4ok", "SaSa", "Sasha",
                "Sahin", 20, "Mc111111", Region.GRODNENSKAYA, "Lida",
                "Nemana", 85, 85, "223001");
        System.out.println(a5.toString());
        System.out.println();

        RegistrationForm a7 = new RegistrationForm("Lizik", "Lala", "Liza",
                "Lizova", 51, "mc524792", Region.MINSKAYA, "Borisov",
                "Rechaya", 77, 53, "22205456");
        System.out.println(a5.toString());
        System.out.println();
    }
}