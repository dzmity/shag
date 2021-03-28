package by.shag.lesson24;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Base64;

public class Person implements Externalizable {


    private static int count = 0;

    private String lastName;
    private String name;
    private String password;
    private Passport passport = new Passport("12345");


    public Person() {
    }

    // обязатеотный конструктор по-умолчанию
    public Person(String name, String lastName, String password) {
        count++;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", passport=" + passport +
                '}';
    }

    private String encryptString(String data) {
        String encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encryptedData);
        return encryptedData;
    }

    private String decryptString(String data) {
        String decrypted = new String(Base64.getDecoder().decode(data));
        System.out.println(decrypted);
        return decrypted;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {

        objectOutput.writeObject(lastName);
        objectOutput.writeObject(name);
        objectOutput.writeObject(encryptString(password));
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {

        this.lastName = (String) objectInput.readObject();
        this.name = (String) objectInput.readObject();
        this.password = decryptString((String) objectInput.readObject());

    }
}
