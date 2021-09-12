package com.chanti.model;

import java.sql.Connection;
import java.sql.DriverManager;
public class DbCon {
    public static Connection getDbCon(){
        Connection dbCon=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sevenamdb1", "root", "root");
            
           }
        catch (Exception e){
            e.printStackTrace();
        }
        return dbCon;
    }
}
