package com.chanti.mapapps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> customers=new HashMap<>();
        customers.put(101,"Ajay");
        customers.put(101,"Arun");
        customers.put(102,"Depak");
        customers.put(103,"Teja");
        customers.put(104,"Varun");
        customers.put(105,"Manideep");
        HashMap<Integer,String> customers1=new HashMap<>();
        customers1.put(106,"John");
        customers1.put(107,"James");
        customers.putAll(customers1);
        System.out.println(customers.size());
        System.out.println(customers.isEmpty());
        System.out.println(customers.equals(customers1));
        System.out.println(customers.hashCode());
        System.out.println(customers.containsKey(107));
        System.out.println(customers.containsValue("Chanti"));
        System.out.println(customers.get(101));
        System.out.println("KEYS="+customers.keySet());
        System.out.println("VALUES="+customers.values());
        System.out.println("KEYS & VALUES="+customers.entrySet());
        customers.remove(107);
        System.out.println("ALL KEYS & VALUES");
        for (Map.Entry<Integer,String> ob: customers.entrySet())
        {
            System.out.println(ob.getKey()+"===>"+ob.getValue());
        }
        customers.clear();
        System.out.println("KEYS & VALUES="+customers.entrySet());

    }
}
