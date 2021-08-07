package com.chanti.versions;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface FInt1{
    void doSomething(int x);
}

@FunctionalInterface
interface FInt2{
    boolean doSomething();
}

@FunctionalInterface
interface FInt3<T>{
    T doSomething(T x);
}


class MyClass implements Consumer, Predicate, Supplier
{
    @Override
    public void accept(Object o)       {   }
    @Override
    public boolean test(Object o)   {   return false;   }
    @Override
    public Object get()             {       return null;        }
}


public class FunctionalInterfaceTest{
    public static void main(String[] args) {

        Consumer<Integer> consumer1=x-> System.out.println(x+100);
        consumer1.accept(5);

        Predicate<Integer> predicate1=x->x%2==0;
        System.out.println(predicate1.test(10));
        System.out.println(predicate1.test(11));

        Supplier supplier1=()->2021;
        System.out.println(supplier1.get());
    }
}
