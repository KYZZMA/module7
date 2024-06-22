package ru.diasoft.domain;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    @Getter
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

}
