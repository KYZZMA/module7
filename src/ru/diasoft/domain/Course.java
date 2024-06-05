package ru.diasoft.domain;

public class Course {
    private String courseName;
    private int courseScore;

    public Course(String courseName, int courseScore) {
        this.courseName = courseName;
        this.courseScore = courseScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseScore() {
        return courseScore;
    }

    @Override
    public String toString() {
        return "courseName='" + courseName + '\'' +
                ", courseScore=" + courseScore + "\n";
    }
}
