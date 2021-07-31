package com.chanti.mapapps;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryHashtableDemo {
    public static void main(String[] args) {
        Dictionary<Character,String> ob=new Hashtable<>();
        ob.put('A',"Apple,...");
        ob.put('B',"Bat,..");
        ob.put('C',"Cat,..");
        System.out.println(ob);

    }
}
