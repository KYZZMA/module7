package ru.diasoft.service;

import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;

public class PersonDemo {
    private Person person1 = new Person("Sasha","Kuzmin",180,"8937444444");
    private Student student1 = new Student("Pasha","Vetrov",20,"8937444444","ГЭБО1",4.7);
    private Student student2 = new Student("Katya","Kuzmina",22,"893744444","ГЭБО5",1);

    public void demo(){
        PersonPrinter pp = new PersonPrinter();
        pp.printInfo(person1);

        StudentPrinter sp = new StudentPrinter();
        sp.printInfo(student1);
        sp.printInfo(student2);
    }
}
