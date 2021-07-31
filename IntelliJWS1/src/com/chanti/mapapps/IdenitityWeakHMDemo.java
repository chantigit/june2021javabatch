package com.chanti.mapapps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class IdenitityWeakHMDemo {
    public static void main(String[] args) {
        Integer i1=new Integer(100);
        Integer i2=new Integer(100);
        //Here keys are compared using equals() = CONTENT COMPARISION
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(i1,"Sachin");
        hm.put(i2,"Dhoni");
        System.out.println("hm="+hm.entrySet());
        //Here keys are compared using == operator = ADDRESS COMPARISION
        IdentityHashMap<Integer,String> ihm=new IdentityHashMap<>();
        ihm.put(i1,"Sachin");
        ihm.put(i2,"Dhoni");
        System.out.println("ihm="+ihm.entrySet());

        i2=null;
        System.gc();
        System.out.println("hm="+hm.entrySet());

        Integer i3=new Integer(300);
        WeakHashMap<Integer,String> whm=new WeakHashMap<>();
        whm.put(i3,"Kohli");
        System.out.println("Before gc::whm="+whm.entrySet());
        i3=null;
        System.gc();
        System.out.println("After gc::whm="+whm.entrySet());
    }
}
