package com.chanti.jdbcapps;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchProcessingDemo {
    public static void main(String[] args)throws Exception {

        Properties p=new Properties();
        FileInputStream fis = new FileInputStream("db.properties");
        p.load(fis);

        try{
            Class.forName(p.getProperty("driverClassName"));
            Connection dbCon = DriverManager.getConnection(p.getProperty("dbUrl"), p.getProperty("dbUser"), p.getProperty("dbPassword"));

            String q1="insert into account values(10104,555)";
            String q2="update account set amount=amount+100 where accno=10101";
            String q3="delete from account where accno=10103";

            Statement statement = dbCon.createStatement();
            //Prepare SQL
            statement.addBatch(q1);
            statement.addBatch(q2);
            statement.addBatch(q3);
            //Execute SQL
            int[] res = statement.executeBatch();
            for (int i=0;i<res.length;i++){
                System.out.println((i+1)+" Query result ="+res[i]);
            }
            statement.close();
            dbCon.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
