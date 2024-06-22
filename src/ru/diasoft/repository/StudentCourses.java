package ru.diasoft.repository;

import lombok.Getter;
import ru.diasoft.domain.Course;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentCourses {
    private Comparator<Course> comparator = (s1, s2) -> s2.getCourseName().compareTo(s1.getCourseName());
    @Getter
    private Set<Course> studentCourses1 = new TreeSet<>(comparator);

    void addStudentCourses1(){
        studentCourses1.add(new Course("математика", 4));
        studentCourses1.add(new Course("экономика", 3));
        studentCourses1.add(new Course("информатика", 3));
        studentCourses1.add(new Course("ботаника", 5));
        studentCourses1.add(new Course("алгебра", 3));
    }

    @Getter
    private Set<Course> studentCourses2 = new TreeSet<>(comparator);

    void addStudentCourses2(){
        studentCourses2.add(new Course("математика", 3));
        studentCourses2.add(new Course("экономика", 3));
        studentCourses2.add(new Course("информатика", 5));
        studentCourses2.add(new Course("алгебра", 4));
    }

    @Getter
    private Set<Course> studentCourses3 = new TreeSet<>(comparator);

    void addStudentCourses3(){
        studentCourses3.add(new Course("математика", 3));
        studentCourses3.add(new Course("ботаника", 4));
        studentCourses3.add(new Course("алгебра", 5));
    }

    @Getter
    private Set<Course> studentCourses4 = new TreeSet<>(comparator);

    void addStudentCourses4(){
        studentCourses4.add(new Course("информатика", 5));
        studentCourses4.add(new Course("ботаника", 5));
        studentCourses4.add(new Course("алгебра", 5));
    }

    @Getter
    private Set<Course> studentCourses5 = new TreeSet<>(comparator);

    void addStudentCourses5(){
        studentCourses5.add(new Course("математика", 5));
        studentCourses5.add(new Course("экономика", 5));
    }
}
