package by.shag.lesson16.kletsko;

public class RegistrationForm {

    private String login;
    private String password;
    private String name;
    private String surname;
    private int age;
    private String passport;
    private Region region;
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;
    private String index;

    public static final String secret = "********";

    public RegistrationForm(String login, String password, String name, String surname,
                            int age, String passport, Region region, String city, String street,
                            int houseNumber, int flatNumber, String index) {
        setLogin(login);
        this.password = password;
        this.name = name;
        this.surname = surname;
        setAge(age);
        setPassport(passport);
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        setIndex(index);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (LoginDB.isVerifyLogin(login)) {
            try {
                throw new LoginAlreadyExistException("Login is in base");
            } catch (LoginAlreadyExistException e) {
                System.err.println(e.getMessage());
            }
        }
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            try {
                throw new NotEnoughtAgeException("Age is incorrect");
            } catch (NotEnoughtAgeException e) {
                System.err.println(e.getMessage());
            }
        }
        this.age = age;
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surName) {
        this.surname = surName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        if (PassportDB.isVerifyPassport(passport)) {
            try {
                throw new PassportAlreadyExistException("Passport is in base");
            } catch (PassportAlreadyExistException e) {
                System.err.println(e.getMessage());
                e.getStackTrace();
            }
            this.passport = passport;
        }
    }

    public Region getRegoin() {
        return region;
    }

    public void setRegoin(Region regoin) {
        this.region = regoin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        if (index.length() != 6) {
            try {
                throw new InvalidPostIndexException("Index is incorrect");
            } catch (InvalidPostIndexException e) {
                System.err.println(e.getMessage());
            }
        }
        this.index = index;
    }

    @Override
    public String toString() {

        return ("Логин - " + login + ", Пароль - " + secret + ", Имя - " + name + ", Фамилия - " + surname +
                ", Возраст - " + age + ", Номер паспорта - " + secret + ", Область - " + region +
                ", Город - " + city + ",\n" + "Улица - " + street + ", Дом - " + houseNumber +
                ", Квартира - " + flatNumber + ", Индекс - " + index);
    }
    }
