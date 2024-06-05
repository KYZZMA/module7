package ru.diasoft.service;

import ru.diasoft.domain.Student;
import ru.diasoft.repository.StudentCourses;
import ru.diasoft.repository.StudentRepository;

public class PersonDemo {
    private StudentRepository sr = new StudentRepository();

    public void demo() {
        sr.addFacultyAll();

        StudentPrinter sp = new StudentPrinter();

        for (Student student : sr.getFaculty().getStudentList()) {
            sp.printInfo(student);
        }
    }
}
