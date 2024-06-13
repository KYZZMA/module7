package ru.diasoft.service;

import ru.diasoft.repository.StudentRepository;

public class PersonDemo {
    private StudentRepository sr = new StudentRepository();
    private StudentProcessing sp = new StudentProcessing();
    public void demo() {
        sr.addFacultyAll();

        sp.searchStudentByName("Sasha",sr.getFaculty().getStudentList()); // поиск по имени
        sp.sortStudentBySecondName(sr.getFaculty().getStudentList()); // сортировка по фамилии
        sp.searchStudentByScoreExcellent(sr.getFaculty().getStudentList()); // поиск отличников

    }
}
