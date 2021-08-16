package com.chanti.jdbcapps;

import com.chanti.mysqldbcon.DbCon;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AmountTransfer {
    static Connection dbCon =null;
    //method1
    public static int deposit(int toAccount,float amount){
        int res=0;
        try {
            dbCon= DbCon.getDbCon();
            PreparedStatement pst=dbCon.prepareStatement("update account set amount=amount+? where accno=?");
            pst.setFloat(1,amount);
            pst.setInt(2,toAccount);
            res=pst.executeUpdate();
        }
        catch (Exception e){ e.printStackTrace();}
        return res;
    }
    //method2
    public static int withdraw(int fromAccount,float amount){
        int res=0;
        try {
            dbCon= DbCon.getDbCon();
            PreparedStatement pst=dbCon.prepareStatement("update account set amount=amount-? where accno=?");
            pst.setFloat(1,amount);
            pst.setInt(2,fromAccount);
            res=pst.executeUpdate();
        }
        catch (Exception e){ e.printStackTrace();}
        return res;
    }
    //method3
    public static void transfer(int fromAccount,int toAccount,float amount)
    {
        withdraw(fromAccount,amount);
        deposit(toAccount,amount);
        System.out.println("Tx Done");
    }

    public static void main(String[] args) {
        transfer(10103,10104,15000);
    }
}
