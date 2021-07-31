package com.chanti.mapapps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class NullInsertionDemo {
    public static void main(String[] args) {
        //HashMap ob1=new HashMap();
        //LinkedHashMap ob1=new LinkedHashMap();
        TreeMap ob1=new TreeMap();
       // ob1.put(null,"Apple");
       // ob1.put(null,"Banana");
        ob1.put("1",null);
        ob1.put("2",null);
        System.out.println(ob1);
    }
}
