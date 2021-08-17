package com.chanti.jdbcapps;

public class EmployeeTest {
    public static void main(String[] args)  {
        //System.out.println(EmployeeDao.createEmployeeTable()==0?"Table is created":"Error while creating table");
        /*
        Employee employee1=new Employee(606,"Madhu",80000);
        if(EmployeeDao.isEmployeeExist(employee1.getId()))
        {
            System.out.println(employee1.getId()+" id is already exist & please try with another");
        }
        else {
            int insertQueryResult = EmployeeDao.saveEmployeeRecord(employee1);
            System.out.println(insertQueryResult==1?" reg done ":" reg failed");
        }
        */

        //System.out.println(insertQueryResult==1?insertQueryResult+" Record is saved": "Error while saving record");

        //int updateQueryResult = EmployeeDao.updateEmployeeRecord();
        //System.out.println(updateQueryResult==1?updateQueryResult+" Record is updated": "Error while updating record");
        //int deleteQueryResult = EmployeeDao.deleteEmployeeRecord();
        //System.out.println(deleteQueryResult==1?deleteQueryResult+" Record is deleted": "Error while deleting record");
        EmployeeDao.loadAllEmployees().forEach(x->
                System.out.println(x));
        //EmployeeDao.loadEmployeeById(609);

        //login
        //System.out.println("---LOGIN OPERATION----");
        //Enter cust id , pswd
        //Call login method & deliver appropriate msg
        Employee emp = EmployeeDao.loadEmployeeById(501);
        if(emp!=null)
        {
            System.out.println(emp);
        }
        else{
            System.out.println("id is not exist");
        }
    }
}
