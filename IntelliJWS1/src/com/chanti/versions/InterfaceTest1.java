package com.chanti.versions;
interface MyInterface1
{
    void m1();
    default void m2(){
        System.out.println("MyInterface1.m2");
    }
    static void m3(){
        System.out.println("MyInterface1.m3");
    }
}
class MyClass1 implements MyInterface1
{
    @Override
    public void m1() {
        System.out.println("MyClass1.m1()");
    }
}
public class InterfaceTest1 {
    public static void main(String[] args) {
        MyInterface1 ob=new MyClass1();
        ob.m1();
        ob.m2();
        MyInterface1.m3();
    }
}
