package ru.diasoft.domain;

public class Student extends Person{
    private String group;
    private double score;

    {
        group = "Undefined";
        score = 0;
    }
    public Student(String firstName, String secondName, int age, String phone, String group, double score) {
        super(firstName, secondName, age, phone);
        setGroup(group);
        setScore(score);
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
        switch (group){
            case "ГЭБО1" :
            case "ГЭБО2" :
            case "ГЭБО3" :
                this.group = group;
                break;
        }
    }

    public void setScore(double score) {
        if (score >= 2 && score <=5)
            this.score = score;
    }
}
