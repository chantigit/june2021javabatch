package com.chanti.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
    static Connection dbCon =null;
    /*
    public static int createEmployeeTable(){
        int temp=0;
        try  {
            dbCon= DbCon.getDbCon();
            Statement myStatement = dbCon.createStatement();
            String myQuery =" create table students(fullname varchar(30) not null,userid varchar(30) primary key,password varchar(30) not null,courses varchar(30) not null,qualification varchar(30) not null)";
            temp = myStatement.executeUpdate(myQuery);
            dbCon.close();
            myStatement.close();
        }
        catch (Exception e)        {            e.printStackTrace();        }
        return temp;
    }*/
    public static int saveStudentRecord(Student student){
    	System.out.println("StudentDao.saveStudentRecord():entry student="+student);
        int res=0;
        try{
            dbCon=DbCon.getDbCon();
            PreparedStatement myStatement = dbCon.prepareStatement("insert into students values(?,?,?,?,?)");
            myStatement.setString(1,student.getFullName());
            myStatement.setString(2,student.getUserId());
            myStatement.setString(3,student.getPassword());
            myStatement.setString(4,student.getCourses());
            myStatement.setString(5,student.getQulaification());
            
            
            res=myStatement.executeUpdate();
            dbCon.close();
            myStatement.close();
        }
        catch (Exception e){ e.printStackTrace();}
        System.out.println("StudentDao.saveStudentRecord():exit res="+res);
        return res;
    }
    public static boolean isStudentExist(String userId) {
    	System.out.println("StudentDao.isStudentExist()");
        boolean res=false;
        try {
            dbCon = DbCon.getDbCon();
            PreparedStatement pst = dbCon.prepareStatement("select * from students where userid=?");
            pst.setString(1,userId);
            ResultSet resultSet = pst.executeQuery();
            res=resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public static boolean loginStudent(String userId,String pswd) {
        boolean res=false;
        try {
            dbCon = DbCon.getDbCon();
            PreparedStatement pst = dbCon.prepareStatement("select * from students where userid=? and password=?");
            pst.setString(1,userId);
            pst.setString(2,pswd);
            ResultSet resultSet = pst.executeQuery();
            res=resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    public static Student loadStudentById(String userid) {
    	Student student=new Student();
        try {
            dbCon = DbCon.getDbCon();
            PreparedStatement pst = dbCon.prepareStatement("select * from students where userid=?");
            pst.setString(1,userid);
            ResultSet resultSet = pst.executeQuery();
            if(resultSet.next())
            {
            	student.setFullName(resultSet.getString(1));
            	student.setUserId(resultSet.getString(2));
            	student.setPassword(resultSet.getString(3));
            	student.setCourses(resultSet.getString(4));
            	student.setQulaification(resultSet.getString(5));
            }
            else
            {
                return new Student();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }
   
    public static int updateStudentRecord(Student student){
        int res=0;
        try{
            dbCon=DbCon.getDbCon();
            PreparedStatement myStatement = dbCon.prepareStatement("update students set fullname=?,password=?,courses=?,qualification=? where userid=?");
            myStatement.setString(1,student.getFullName());
            myStatement.setString(5,student.getUserId());
            myStatement.setString(2,student.getPassword());
            myStatement.setString(3,student.getCourses());
            myStatement.setString(4,student.getQulaification());
            res=myStatement.executeUpdate();
            dbCon.close();
            myStatement.close();
        }
        catch (Exception e){ e.printStackTrace();}
        return res;
    }
    /*
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
    public static ArrayList<Student> loadAllStudent(){
        ArrayList<Student> employees=new ArrayList<>();
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
    */
   

}
