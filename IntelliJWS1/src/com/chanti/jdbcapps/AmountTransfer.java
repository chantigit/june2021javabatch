package com.chanti.jdbcapps;

import com.chanti.mysqldbcon.DbCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AmountTransfer {
    static Connection dbCon =null;
    public static void transfer(int fromAccount,int toAccount,float amount) throws SQLException {
        int res1=0,res2=0;
        try {
            dbCon= DbCon.getDbCon();
            PreparedStatement pst1=dbCon.prepareStatement("update account set amount=amount+? where accno=?");
            pst1.setFloat(1,amount);
            pst1.setInt(2,toAccount);
            PreparedStatement pst2=dbCon.prepareStatement("update account set amount=amount-? where accno=?");
            pst2.setFloat(1,amount);
            pst2.setInt(2,fromAccount);
            dbCon.setAutoCommit(false);
            res1=pst1.executeUpdate();
            res2=pst2.executeUpdate();
            if(res1==1 && res2==1)
            {
                System.out.println("Tx done successfully");
                dbCon.commit();
            }
            else {
                System.out.println("Tx failed for some reason");
                dbCon.rollback();
            }
            pst1.close();
            pst2.close();
        }
        catch (Exception e){
            System.out.println("Tx failed for some reason");
            dbCon.rollback();
            e.printStackTrace();
        }
        finally {
            System.out.println("Db Con was closed");
            dbCon.close();
        }
    }

    public static void main(String[] args) throws SQLException {

        transfer(10103,10101,15000);
    }
}
