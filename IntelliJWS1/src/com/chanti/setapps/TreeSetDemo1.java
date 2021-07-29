package com.chanti.setapps;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet ob=new TreeSet();
        ob.add(45000);
        ob.add(25000);
        ob.add(33000);
        ob.add(10000);
        ob.add(50000);
        ob.add(85000);
        /*
       ob.forEach(x->{

           ob.remove(10000);        //remove() method removing an object from ob
           System.out.println("x="+x); //println() method printing each object from ob

       });
        */
        Iterator iterator = ob.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
