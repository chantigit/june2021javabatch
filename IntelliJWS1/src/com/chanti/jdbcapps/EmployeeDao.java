package com.chanti.jdbcapps;

import com.chanti.mysqldbcon.DbCon;

import java.sql.*;
import java.util.ArrayList;

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
    public static ArrayList<Employee> loadAllEmployees(){
        ArrayList<Employee> employees=new ArrayList<>();
        try{
            dbCon=DbCon.getDbCon();
            PreparedStatement pst=dbCon.prepareStatement("select * from employee");
            ResultSet resultSet = pst.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();

            //Printing MetaData
            int columnCount = metaData.getColumnCount();
            for(int i=1;i<=columnCount;i++)
            {
                System.out.print(metaData.getColumnName(i)+"\t");
            }
            System.out.println("\n-------------------------------------------\n");
            //Printing Data
            while(resultSet.next()) {
                Employee employee=new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setSalary(resultSet.getFloat(3));
                employees.add(employee);
            }
            employees.forEach(e->{
                System.out.println(e);
            });
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
        return employees;
    }
    public static Employee loadEmployeeById(int eid) {
        Employee employee=new Employee();
        try {
            dbCon = DbCon.getDbCon();
            PreparedStatement pst = dbCon.prepareStatement("select * from employee where id=?");
            pst.setInt(1,eid);
            ResultSet resultSet = pst.executeQuery();
            if(resultSet.next())
            {
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setSalary(resultSet.getFloat(3));
            }
            else
            {
                return new Employee();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }
    public static boolean isEmployeeExist(int eid) {
        boolean res=false;
        try {
            dbCon = DbCon.getDbCon();
            PreparedStatement pst = dbCon.prepareStatement("select * from employee where id=?");
            pst.setInt(1,eid);
            ResultSet resultSet = pst.executeQuery();
            res=resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
