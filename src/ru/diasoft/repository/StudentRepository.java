package ru.diasoft.repository;

import ru.diasoft.domain.Faculty;
import ru.diasoft.domain.Student;
import ru.diasoft.service.AverageCourseScore;

public class StudentRepository {
    private StudentCourses studentCourses = new StudentCourses();
    private Faculty faculty = new Faculty();

    public void addFacultyAll(){
        studentCourses.addStudentCourses1();
        studentCourses.addStudentCourses2();
        studentCourses.addStudentCourses3();
        studentCourses.addStudentCourses4();
        studentCourses.addStudentCourses5();

        faculty.addStudent(new Student("Pasha", "Vetrov", 20,
                "8937444444", "ГЭБО1", AverageCourseScore.averageScore(studentCourses.getStudentCourses1()), studentCourses.getStudentCourses1()));

        faculty.addStudent(new Student("Pasha", "Kotov", 23,
                "8937414141", "ГЭБО2", AverageCourseScore.averageScore(studentCourses.getStudentCourses2()), studentCourses.getStudentCourses2()));

        faculty.addStudent(new Student("Sasha", "Kuzmin", 23,
                "8937414141", "ГЭБО2", AverageCourseScore.averageScore(studentCourses.getStudentCourses3()), studentCourses.getStudentCourses3()));

        faculty.addStudent(new Student("Gena", "Uhov", 19,
                "8937414141", "ГЭБО3", AverageCourseScore.averageScore(studentCourses.getStudentCourses4()), studentCourses.getStudentCourses4()));

        faculty.addStudent(new Student("Dima", "Kovrov", 24,
                "8937414141", "ГЭБО1", AverageCourseScore.averageScore(studentCourses.getStudentCourses5()), studentCourses.getStudentCourses5()));
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
