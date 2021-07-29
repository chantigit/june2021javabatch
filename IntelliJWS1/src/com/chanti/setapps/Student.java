package com.chanti.setapps;

import java.util.Objects;

public class Student {
    private Integer rollNumber;
    private String name;
    private Integer marks;
    public Student(){}

    public Student(Integer rollNumber, String name, Integer marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber.equals(student.rollNumber) && name.equals(student.name) && marks.equals(student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, marks);
    }

}
