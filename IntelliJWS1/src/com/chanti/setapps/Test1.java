package com.chanti.setapps;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ajay",450);
        Student s2=new Student(1,"Ajay",450);

        System.out.println(s1);
        System.out.println(s2);

        HashSet<Student> students=new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students);
    }
}
