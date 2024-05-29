package ru.diasoft.domain;

import java.util.*;

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

    public String getGroup() {
        return group;
    }

    public double getScore() {
        return score;
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

    public Set<Course> getCourses() {
        return courses;
    }
}
