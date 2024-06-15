package ru.diasoft.service;

import ru.diasoft.domain.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentProcessing implements Processing {
    @Override
    public List<Student> searchStudentByName(String name, List<Student> students) {
        return students.stream()
                .filter(s -> s.getFirstName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> sortStudentBySecondName(List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> s1.getSecondName().compareTo(s2.getSecondName()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> searchStudentByScoreExcellent(List<Student> students) {
        return students.stream().filter(s -> s.getScore() == 5).collect(Collectors.toList());
    }
}
