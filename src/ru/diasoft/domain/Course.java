package ru.diasoft.domain;

public class Course implements Comparable<Course> {
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
    public int compareTo(Course o) {
        return o.getCourseName().compareTo(courseName);
    }

    @Override
    public String toString() {
        return "courseName='" + courseName + '\'' +
                ", courseScore=" + courseScore + "\n";
    }
}
