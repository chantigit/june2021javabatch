package com.chanti.mapapps;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        Employee1 e1=new Employee1(3,"Depak",45000D);
        Employee1 e2=new Employee1(4,"Tarun",25000D);
        Employee1 e3=new Employee1(1,"Depak",65000D);
        Employee1 e4=new Employee1(2,"Arun",5000D);
        ArrayList<Employee1> empList=new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        Collections.sort(empList);
        empList.forEach(System.out::println);
    }
}
