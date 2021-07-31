package com.chanti;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionDemo
{
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> customers=new ConcurrentHashMap<>();
        customers.put(101,"Ajay");
        customers.put(102,"Depak");
        customers.put(103,"Teja");
        customers.put(104,"Varun");
        customers.put(105,"Manideep");

        customers.keySet().forEach(k->{
            System.out.println("KEY="+k);
            customers.remove(101);
        });

        System.out.println(customers);
    }
}
