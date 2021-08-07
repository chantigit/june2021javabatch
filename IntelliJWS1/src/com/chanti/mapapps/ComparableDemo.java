package com.chanti.mapapps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        //Create a new emp list which have above 30000 salary employees only
        ArrayList<Employee1> above30KEmpList=new ArrayList<>();
        empList.forEach(emp->{
            if(emp.getSalary()>30000F)
            {
                above30KEmpList.add(emp);
            }
        });
        above30KEmpList.forEach(System.out::println);
        //Collections.sort(empList);

        List<Employee1> above30KEmpList1= empList.stream().filter(x -> x.getSalary() > 30000F).collect(Collectors.toList());
        above30KEmpList1.forEach(System.out::println);
        //empList.forEach(System.out::println);
    }
}
