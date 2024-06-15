package ru.diasoft.service;
import ru.diasoft.domain.Student;
import java.util.List;

public interface Processing {
     public List<Student> searchStudentByName(String name, List<Student> s);
     public List<Student> sortStudentBySecondName(List<Student> s);
     public List<Student> searchStudentByScoreExcellent(List<Student> s);
}
