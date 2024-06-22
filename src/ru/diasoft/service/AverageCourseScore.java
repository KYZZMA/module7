package ru.diasoft.service;
import ru.diasoft.domain.Course;
import java.util.Set;

public class AverageCourseScore {
    public static double averageScore(Set<Course> setCourse) {

        double sumAverage = 0;
        for (Course i : setCourse) {
            sumAverage += i.getCourseScore();
        }
        return sumAverage / setCourse.size();
    }
}
