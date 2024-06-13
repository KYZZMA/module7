package ru.diasoft.service;
import ru.diasoft.domain.Student;
import java.util.List;
import java.util.stream.Collectors;

public class StudentProcessing implements Processing {
    @Override
    public void searchStudentByName(String name, List<Student> students) {
        List<Student> searchList = students.stream()
                .filter(s -> s.getFirstName().equals(name))
                .collect(Collectors.toList());
        if (searchList.size() > 1)
            System.out.println(students);
        else
            System.out.println(searchList);
    }

    @Override
    public void sortStudentBySecondName(List<Student> students) {
        students.stream()
                .sorted((s1, s2) -> s1.getSecondName().compareTo(s2.getSecondName()))
                .forEach(System.out::println);
    }

    @Override
    public void searchStudentByScoreExcellent(List<Student> students) {
        students.stream().filter(s -> s.getScore() == 5).forEach(System.out::println);
    }
}
