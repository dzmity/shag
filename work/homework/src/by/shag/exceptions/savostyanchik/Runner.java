package by.shag.exceptions.savostyanchik;

public class Runner {

    public static void main(String[] args) {
        LoginDb db = new LoginDb();
        PassportDb db2 = new PassportDb();


        RegistrationForm user1 = new RegistrationForm();
        user1.setLogin("Ybica"); // если такой логин есть - будет исключение (Логин который уже есть в бд - 3JIou_Bandit )
        user1.setPassword("Lolwto15");
        user1.setName("Egor");
        user1.setSurname("Savostyanchik");
        user1.setAge(18); // если здесь поставить возраст меньше 18 будет исключение
        user1.setPassport("MC226584"); // если такой паспорт уже есть выкинет исключение
        user1.setRegion(Region.MINSK_REGION);
        user1.setTown("Minsk");
        user1.setStreet("Fedorova");
        user1.setHouseNumber(19);
        user1.setApartmentNumber(17);
        user1.setPostcode("220359"); // если неверный формат будет исключение (не 6 символов)

        /*
        я добавил два метода, addLoginToDB в класс LoginDb и добивил метод addPassportToDb в класс PassportDb
        чтобы в действительности, когда мы добавляем новый логин или паспорт он добавлялся в бд
         */


        System.out.println(user1);
    }
}