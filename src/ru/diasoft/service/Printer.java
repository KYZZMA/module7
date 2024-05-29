package ru.diasoft.service;

import ru.diasoft.domain.Person;
public interface Printer {
    default void printInfo(Person p){
        System.out.println("FirstName : " + p.getFirstName() + "\n" +
                "SecondName : " + p.getSecondName());
    }
}
