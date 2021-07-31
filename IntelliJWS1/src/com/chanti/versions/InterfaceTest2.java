package com.chanti.versions;

@FunctionalInterface
interface InterfaceA{
    void m();    //Without return type & without param
}
@FunctionalInterface
interface InterfaceB{
    void m(int a);    //Without return type & with 1 param
}
@FunctionalInterface
interface InterfaceC{
    int m(int a);    //With return type & with 1 param
}
public class InterfaceTest2
{
    public static void main(String[] args) {
        InterfaceA ob=()->{
            System.out.println("logic1");
        };
        ob.m();
        InterfaceB ob1=(x)->{
            System.out.println("logic2"+(x=x+100));
        };
        ob1.m(500);
        InterfaceC ob2=y->y+10;
        System.out.println(ob2.m(100));
    }
}
