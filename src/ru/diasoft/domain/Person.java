package ru.diasoft.domain;

import lombok.Getter;

@Getter
public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String phone = "Undefined";

    public Person(String firstName, String secondName, int age, String phone) {
        this.firstName = firstName;
        this.secondName = secondName;
        setAge(age);
        setPhone(phone);
    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        setAge(age);
    }

    public void setAge(int age) {
        if (age > 0 && age < 150)
            this.age = age;
    }

    public void setPhone(String phone) {
        if (phone.length() == 10)
            this.phone = phone;
    }

}
