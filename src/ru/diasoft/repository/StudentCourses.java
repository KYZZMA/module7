package ru.diasoft.repository;

import ru.diasoft.domain.Course;

import java.util.Set;
import java.util.TreeSet;

public class StudentCourses {
    private Set<Course> studentCourses1 = new TreeSet<>();

    {
        studentCourses1.add(new Course("математика", 4));
        studentCourses1.add(new Course("экономика", 5));
        studentCourses1.add(new Course("информатика", 3));
        studentCourses1.add(new Course("ботаника", 5));
        studentCourses1.add(new Course("алгебра", 3));
    }

    private Set<Course> studentCourses2 = new TreeSet<>();

    {
        studentCourses2.add(new Course("математика", 3));
        studentCourses2.add(new Course("экономика", 4));
        studentCourses2.add(new Course("информатика", 5));
        studentCourses2.add(new Course("алгебра", 5));
    }

    private Set<Course> studentCourses3 = new TreeSet<>();

    {
        studentCourses3.add(new Course("математика", 3));
        studentCourses3.add(new Course("ботаника", 4));
        studentCourses3.add(new Course("алгебра", 5));
    }

    private Set<Course> studentCourses4 = new TreeSet<>();

    {
        studentCourses4.add(new Course("информатика", 5));
        studentCourses4.add(new Course("ботаника", 4));
        studentCourses4.add(new Course("алгебра", 5));
    }

    private Set<Course> studentCourses5 = new TreeSet<>();

    {
        studentCourses5.add(new Course("математика", 3));
        studentCourses5.add(new Course("экономика", 4));
    }

    public Set<Course> getStudentCourses1() {
        return studentCourses1;
    }

    public Set<Course> getStudentCourses2() {
        return studentCourses2;
    }

    public Set<Course> getStudentCourses3() {
        return studentCourses3;
    }

    public Set<Course> getStudentCourses4() {
        return studentCourses4;
    }

    public Set<Course> getStudentCourses5() {
        return studentCourses5;
    }
}
