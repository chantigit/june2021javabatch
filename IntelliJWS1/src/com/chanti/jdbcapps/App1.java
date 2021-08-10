package com.chanti.jdbcapps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App1 {
    public static void main(String[] args)  {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("MySQL Driver loaded successfully");
           Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sevenamdb1", "root", "root");
           System.out.println("Connection between Java App & DB was established ");
           Statement myStatement = dbCon.createStatement();
           String myQuery ="create table employee1(id int primary key,name varchar(30) not null,salary float not null)";
           int dbResult = myStatement.executeUpdate(myQuery);
           System.out.println(dbResult+" Table created successfully");
           dbCon.close();
           myStatement.close();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }

    }
}
