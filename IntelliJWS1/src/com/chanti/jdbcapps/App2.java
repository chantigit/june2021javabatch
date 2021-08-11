package com.chanti.jdbcapps;

import com.chanti.mysqldbcon.DbCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class App2 {

    static Connection dbCon =null;

    public static int createEmployeeTable(){
        int temp=0;
        try  {
            dbCon=DbCon.getDbCon();
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

    public static void main(String[] args)  {
        //System.out.println(App1.createEmployeeTable()==0?"Table is created":"Error while creating table");
        Employee employee1=new Employee(605,"Sanjay",80000);
        int insertQueryResult= App2.saveEmployeeRecord(employee1);
        System.out.println(insertQueryResult==1?insertQueryResult+" Record is saved": "Error while saving record");
        //int updateQueryResult = App1.updateEmployeeRecord();
        //System.out.println(updateQueryResult==1?updateQueryResult+" Record is updated": "Error while updating record");
        //int deleteQueryResult = App1.deleteEmployeeRecord();
        //System.out.println(deleteQueryResult==1?deleteQueryResult+" Record is deleted": "Error while deleting record");
    }
}
