package com.chanti.mapapps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(103,"Teja");
        hm.put(101,"Ajay");
        hm.put(104,"Varun");
        hm.put(102,"Depak");
        hm.put(105,"Manideep");
        System.out.println("HM="+hm.entrySet());
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(103,"Teja");
        lhm.put(101,"Ajay");
        lhm.put(104,"Varun");
        lhm.put(102,"Depak");
        lhm.put(105,"Manideep");
        System.out.println("LHM="+lhm.entrySet());
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(103,"Teja");
        tm.put(101,"Ajay");
        tm.put(104,"Varun");
        tm.put(102,"Depak");
        tm.put(105,"Manideep");
        System.out.println("TM="+tm.entrySet());
    }
}
