package ru.diasoft.service;

import ru.diasoft.domain.Person;
public class PersonPrinter implements Printer{
    @Override
    public void printInfo(Person p) {
        System.out.println("====Person====");
        Printer.super.printInfo(p);
        System.out.println("Age : " + p.getAge() + "\n" +
                "Phone : " + p.getPhone()+ "\n");
    }
}
