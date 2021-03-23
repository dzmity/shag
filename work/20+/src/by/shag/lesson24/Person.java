package by.shag.lesson24;

import java.io.Serializable;
import java.util.Base64;

public class Person implements Serializable {

    private String name;
    private String lastName;
    private String password;


    // обязатеотный конструктор по-умолчанию
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
