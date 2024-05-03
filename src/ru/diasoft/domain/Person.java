package ru.diasoft.domain;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String phone;

    {
        phone = "Undefined";
    }

    public Person(String firstName, String secondName, int age, String phone){
        this.firstName = firstName;
        this.secondName = secondName;
        setAge(age);
        setPhone(phone);
    }

    public Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 150)
            this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() == 10)
            this.phone = phone;
    }

}
