package ru.diasoft.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Course {
    private String courseName;
    private int courseScore;
}
