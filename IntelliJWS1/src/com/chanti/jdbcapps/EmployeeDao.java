package com.chanti.jdbcapps;

import com.chanti.mysqldbcon.DbCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
    static Connection dbCon =null;

    public static int createEmployeeTable(){
        int temp=0;
        try  {
            dbCon= DbCon.getDbCon();
            Statement myStatement = dbCon.createStatement();
            String myQuery ="create table employee(id int primary key,name varchar(30) not null,salary float not null)";
            temp = myStatement.executeUpdate(myQuery);
            dbCon.close();
            myStatement.close();
        }
        catch (Exception e)        {            e.printStackTrace();        }
        return temp;
    }
    public static int saveEmployeeRecord(Employee employee){
        int res=0;
        try{
            dbCon=DbCon.getDbCon();
            PreparedStatement myStatement = dbCon.prepareStatement("insert into employee values(?,?,?)");
            myStatement.setInt(1,employee.getId());
            myStatement.setString(2,employee.getName());
            myStatement.setFloat(3,employee.getSalary());
            res=myStatement.executeUpdate();
            dbCon.close();
            myStatement.close();
        }
        catch (Exception e){ e.printStackTrace();}
        return res;
    }
    public static int updateEmployeeRecord(){
        int res=0;
        try{
            dbCon=DbCon.getDbCon();
            Statement myStatement = dbCon.createStatement();
            String myQuery ="update employee set name='Vinay',salary=55000 where id=601";
            res=myStatement.executeUpdate(myQuery);
            dbCon.close();
            myStatement.close();
        }
        catch (Exception e){ e.printStackTrace();}
        return res;
    }
    public static int deleteEmployeeRecord(){
        int res=0;
        try{
            dbCon=DbCon.getDbCon();
            Statement myStatement = dbCon.createStatement();
            String myQuery ="delete from employee where id=601";
            res=myStatement.executeUpdate(myQuery);
            dbCon.close();
            myStatement.close();
        }
        catch (Exception e){ e.printStackTrace();}
        return res;
    }
    //Prepare dao method which will display all employee records
    public static void loadAllEmployees(){
        try{
            dbCon=DbCon.getDbCon();
            PreparedStatement pst=dbCon.prepareStatement("select * from employee");
            ResultSet resultSet = pst.executeQuery();
            while(resultSet.next())
            {
                for(int i=1;i<=3;i++)
                {
                    System.out.print(resultSet.getString(i)+"\t");
                }
                System.out.println();
            }

            /*

            System.out.println(resultSet.next());//Moving cursor to before 1st row
            //Reading 1st cell data
            System.out.println(resultSet.getString(1));
            //Reading 2nd cell data
            System.out.println(resultSet.getString(2));
            //Reading 3rd cell data
            System.out.println(resultSet.getString(3));

            System.out.println(resultSet.next());//Moving cursor to before 2nd row
            //Reading 1st cell data
            System.out.println(resultSet.getString(1));
            //Reading 2nd cell data
            System.out.println(resultSet.getString(2));
            //Reading 3rd cell data
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.next());//Moving cursor to before 3rd row
            //Reading 1st cell data
            System.out.println(resultSet.getString(1));
            //Reading 2nd cell data
            System.out.println(resultSet.getString(2));
            //Reading 3rd cell data
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.next());//Moving cursor to before 4th row
            //Reading 1st cell data
            System.out.println(resultSet.getString(1));
            //Reading 2nd cell data
            System.out.println(resultSet.getString(2));
            //Reading 3rd cell data
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.next());//Moving cursor to before 5th row
            //Reading 1st cell data
            System.out.println(resultSet.getString(1));
            //Reading 2nd cell data
            System.out.println(resultSet.getString(2));
            //Reading 3rd cell data
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.next());//Moving cursor to before 6th row
            */
        }
        catch (Exception e){ e.printStackTrace();}
    }
}
