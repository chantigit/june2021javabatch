package com.chanti;

import p1.p2.Calc;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) throws Exception {
        Calc c1=new Calc();
        c1.add(10,20);
        Calc.sub(10,6);
        //Can we load .class file explicitly into JVM ?
        //Yes, by using forName() method from java.lang.Class class
        Calc c2=(Calc) Class.forName("p1.p2.Calc").newInstance();
        c2.add(5,6);
        Stack s =(Stack) Class.forName("java.util.Stack").newInstance();
        s.push(10);
        s.push(20);
        System.out.println(s);
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("MySQL Driver loaded successfully");
        Class.forName("oracle.jdbc.OracleDriver");
        System.out.println("Oracle Driver loaded successfully");
    }
}
