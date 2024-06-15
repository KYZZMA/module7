package ru.diasoft.service;

import ru.diasoft.domain.Student;
import ru.diasoft.repository.StudentRepository;

import java.util.List;

public class PersonDemo {
    private StudentRepository sr = new StudentRepository();
    private StudentProcessing sp = new StudentProcessing();
    private StudentPrinter spr = new StudentPrinter();

    public void demo() {
        sr.addFacultyAll();

        List<Student> resultListSearchStudentByName = sp.searchStudentByName("Pasha", sr.getFaculty().getStudentList()); // поиск по имени
        List<Student> resultListSortStudentBySecondName = sp.sortStudentBySecondName(sr.getFaculty().getStudentList()); // сортировка по фамилии
        List<Student> resultListSearchStudentByScoreExcellent = sp.searchStudentByScoreExcellent(sr.getFaculty().getStudentList());// поиск отличников

        resultListSearchStudentByName.forEach(x -> spr.printInfo(x));
        resultListSortStudentBySecondName.forEach(x -> spr.printInfo(x));
        resultListSearchStudentByScoreExcellent.forEach(x -> spr.printInfo(x));

    }
}
