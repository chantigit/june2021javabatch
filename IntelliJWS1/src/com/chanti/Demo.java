package com.chanti;

import p1.p2.Calc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("MySQL Driver loaded successfully");
       // Class.forName("oracle.jdbc.OracleDriver");
        //System.out.println("Oracle Driver loaded successfully");


        String str="INDIA";
        boolean v1 = str.isEmpty();
        char v2 = str.charAt(0);
        String ob1 = str.toLowerCase();
        Class ob2 = Class.forName("java.lang.Thread");
        Thread ob3 = Thread.currentThread();
        int v3= Thread.currentThread().getPriority();
        System.gc();  //void
        System.out.println();//void

        //Any method in java has 3 possible return types
        //1.void                :  Non-Factory methods
        //2.primitive           :  Non-Factory methods
        //3.class/interface/abstract class  :  Factory methods


        Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sevenamdb1", "root", "root");
        System.out.println("Connection between Java App & DB was established ");

        dbCon.createStatement();
    }
}
