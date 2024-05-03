package ru.diasoft.service;

import ru.diasoft.domain.Person;

public class PersonDemo {
    Person person1 = new Person("Sasha","Kuzmin",160,"8937444444");
    Person person2 = new Person("Misha","Vetrov",25);

    public void demo(){
        PersonPrinter.printFI(person1);
        PersonPrinter.printInfo(person1);

        PersonPrinter.printFI(person2);
        PersonPrinter.printInfo(person2);
    }
}
