package com.chanti.setapps;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ob=new TreeSet<>();
        ob.add(45000);
        ob.add(25000);
        ob.add(33000);
        ob.add(10000);
        ob.add(50000);
        ob.add(85000);
        //SortedSet 5 methods
        System.out.println(ob.first());//10000
        System.out.println(ob.last());//85000
        System.out.println(ob.headSet(40000));  //< element
        System.out.println(ob.tailSet(40000));//> element
        System.out.println(ob.subSet(30000,60000));//in between
        //NavigableSet 7 methods
        System.out.println(ob.lower(20000));    //10000
        System.out.println(ob.higher(20000));   //25000
        System.out.println(ob.ceiling(45000));  //45000
        System.out.println(ob.ceiling(55000));  //85000
        System.out.println(ob.floor(45000));    //45000
        System.out.println(ob.floor(34000));    //33000
        ob.pollFirst();
        ob.pollLast();
        System.out.println(ob);
        System.out.println(ob.descendingSet());

    }
}
