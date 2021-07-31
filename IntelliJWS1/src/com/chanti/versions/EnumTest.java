package com.chanti.versions;

public class EnumTest
{
    public enum WeekDays
    {
        SUNDAY,MONDAY,TUESDAY
    }
    public enum Points
    {
        GREEN(100),RED(200),BLUE(300);
        private int value;
        private Points(int value)
        {
            this.value=value;
        }
    }
    public static void main(String[] args) {
        System.out.println("Accessing enum values");
        for(WeekDays wd:WeekDays.values())
        {
            System.out.println(wd);
        }
        System.out.println(WeekDays.valueOf("MONDAY"));
        System.out.println(WeekDays.valueOf("MONDAY").ordinal());
        System.out.println("Accessing Point values");
        for(Points p:Points.values())
        {
            System.out.println(p+","+p.value);
        }
    }
}
