package ru.diasoft.service;

import ru.diasoft.domain.Person;

public class StudentPrinter implements Printer {
    @Override
    public void printInfo(Person p) {
        System.out.println("====Student====");
        Printer.super.printInfo(p);
        System.out.println("Age : " + p.getAge() + "\n" +
                "Phone : " + p.getPhone());
    }
}
