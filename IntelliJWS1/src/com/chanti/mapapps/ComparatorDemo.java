package com.chanti.mapapps;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product(2,"Samsung",75000));
        products.add(new Product(4,"OnePlus",65000));
        products.add(new Product(1,"Oppo",35000));
        products.add(new Product(2,"Nokia",90000));
        products.forEach(System.out::println);
        System.out.println("Sort by Id");
        Collections.sort(products);
        products.forEach(System.out::println);
        System.out.println("Sort by brandName");
        Collections.sort(products,new BrandNameComparator());
        products.forEach(System.out::println);
        System.out.println("Sort by Price");
        Collections.sort(products,new PriceComparator());
        products.forEach(System.out::println);

    }
}
