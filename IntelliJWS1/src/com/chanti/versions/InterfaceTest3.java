package com.chanti.versions;
@FunctionalInterface
interface InterfaceOne{
    void someLogic(int a,int b);
}
class Add{
    public static  void doAddition(int p,int q){
        System.out.println("Sum is:"+(p+q));
    }
}
public class InterfaceTest3 {
    public static void main(String[] args) {
        InterfaceOne ob= Add::doAddition;
        ob.someLogic(100,200);
    }
}
