package by.shag.exceptions.savostyanchik;


public class RegistrationForm {
    public static final int MINIMUM_USER_AGE = 18;
    public static final int POSTCODE_LENGTH = 6;
    private String login;
    private String password;
    private String name;
    private String surname;
    private int age;
    private String passport;
    private Region region;
    private String town;
    private String street;
    private int houseNumber;
    private int apartmentNumber;
    private String postcode;


    @Override
    public String toString() {
        return "Login: " + login + "\n" +
                "Password: ********" + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Age: " + age + "\n" +
                "Series and number of passport: ********" + "\n" +
                "Region: " + region + "\n" +
                "Town: " + town + "\n" +
                "Street: " + street + "\n" +
                "House number: " + houseNumber + "\n" +
                "Apartment number: " + apartmentNumber + "\n" +
                "Postcode: " + postcode + "\n";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (!(LoginDb.chekLogin(login))) {
            this.login = login;
            LoginDb.addLoginToDB(login);
        }
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < MINIMUM_USER_AGE) {
            throw new NotEnoughAgeException("User is less than 18 years old");
        }

        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        if (!(PassportDb.chekPassport(passport))) {
            this.passport = passport;
            PassportDb.addPassportToDb(passport);
        }
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
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

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        if (postcode.length() != POSTCODE_LENGTH) {
            throw new InvalidPostIndexException("Postcode does not match format");
        }

        this.postcode = postcode;
    }
}