package com.chanti.versions;

import java.lang.annotation.Annotation;

@Mobile()
class Product{

}

class  A{
    void m1(){

    }
}
class  B extends  A{
    @Override
    void m1(){

    }
}

public class AnnTest1 {
    public static void main(String[] args) {

        Product product=new Product();
        Class c= product.getClass();
        Annotation annotation = c.getAnnotation(Mobile.class);
        Mobile mobile=(Mobile) annotation;
        System.out.println(mobile.version());
        System.out.println(mobile.ram());
        System.out.println(mobile.rom());
        System.out.println(mobile.cost());
    }
}
