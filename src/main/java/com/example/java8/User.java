package com.example.java8;

public class User {

    private int id;
    private String name;
    private double marks;
    private String grade;

    public User(int id, String name, double marks, String grade) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }
}
