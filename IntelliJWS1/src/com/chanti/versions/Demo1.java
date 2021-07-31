package com.chanti.versions;
//1.Variable arguments
public class Demo1
{
    public static void totalStudentMarks(int... marks)
    {
        int s=0;
        for (int m:marks) {
            s=s+m;
        }
        System.out.println("Sum="+s);
    }
    public static void main(String... args)
    {
        System.out.println("Hello");
        int marks[]={40,50,60};
        totalStudentMarks(marks);
    }
}
