package ru.diasoft.domain;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
