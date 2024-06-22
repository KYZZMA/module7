package ru.diasoft.domain;

import lombok.Getter;

import java.util.*;

@Getter
public class Student extends Person {
    private String group = "Undefined";
    private double score = 0;
    private Set<Course> courses;

    public Student(String firstName, String secondName, int age, String phone, String group, double score, Set<Course> courses) {
        super(firstName, secondName, age, phone);
        setGroup(group);
        setScore(score);
        this.courses = courses;
    }

    public Student(String firstName, String secondName, int age, String group, double score) {
        super(firstName, secondName, age);
        setGroup(group);
        setScore(score);
    }

    public void setGroup(String group) {
        switch (group) {
            case "ГЭБО1":
            case "ГЭБО2":
            case "ГЭБО3":
                this.group = group;
                break;
        }
    }

    public void setScore(double score) {
        if (score >= 2 && score <= 5)
            this.score = score;
    }

    @Override
    public String toString() {
        return  "FirstName : " + getFirstName() + "\n" +
                "SecondName : " + getSecondName() + "\n" +
                "Age : " + getAge() + "\n" +
                "Phone : " + getPhone() + "\n" +
                "Group : " + getGroup() + "\n" +
                "Score: " + String.format("%.1f", getScore()) + "\n" +
                "Courses: " + getCourses();
    }
}
