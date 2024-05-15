package ru.diasoft.service;

import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;

public class StudentPrinter implements Printer {
    @Override
    public void printInfo(Person p) {
        System.out.println("====Student====");
        Printer.super.printInfo(p);
        if (p instanceof Student) {
            System.out.println("Age : " + p.getAge() + "\n" +
                    "Phone : " + p.getPhone() + "\n" +
                    "Group : " + ((Student) p).getGroup() + "\n" +
                    "Score: " + ((Student) p).getScore() + "\n");
        }
    }
}
