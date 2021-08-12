package com.chanti.jdbcapps;

public class EmployeeTest {
    public static void main(String[] args)  {
        //System.out.println(EmployeeDao.createEmployeeTable()==0?"Table is created":"Error while creating table");
        //Employee employee1=new Employee(605,"Sanjay",80000);
        //int insertQueryResult= EmployeeDao.saveEmployeeRecord(employee1);
        //System.out.println(insertQueryResult==1?insertQueryResult+" Record is saved": "Error while saving record");
        //int updateQueryResult = EmployeeDao.updateEmployeeRecord();
        //System.out.println(updateQueryResult==1?updateQueryResult+" Record is updated": "Error while updating record");
        //int deleteQueryResult = EmployeeDao.deleteEmployeeRecord();
        //System.out.println(deleteQueryResult==1?deleteQueryResult+" Record is deleted": "Error while deleting record");
        EmployeeDao.loadAllEmployees();
    }
}
