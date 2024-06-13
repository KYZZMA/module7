package ru.diasoft.service;
import ru.diasoft.domain.Student;
import java.util.List;

public interface Processing {
     public void searchStudentByName(String name, List<Student> s);
     public void sortStudentBySecondName(List<Student> s);
     public void searchStudentByScoreExcellent(List<Student> s);
}
