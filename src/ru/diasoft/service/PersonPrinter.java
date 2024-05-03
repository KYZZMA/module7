package ru.diasoft.service;

import ru.diasoft.domain.Person;

public class PersonPrinter {
    static void printFI(Person p){
        System.out.println("FirstName : " + p.getFirstName() + "\n" +
                "SecondName : " + p.getSecondName()+ "\n");
    }

    static void printInfo(Person p){
        System.out.println("FirstName : " + p.getFirstName() + "\n" +
                "SecondName : " + p.getSecondName() + "\n" +
                "Age : " + p.getAge() + "\n" +
                "Phone : " + p.getPhone()+ "\n");
    }
}
