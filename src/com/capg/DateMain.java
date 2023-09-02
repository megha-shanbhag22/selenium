package com.capg;

public class DateMain{
    public static void main(String[]args) {
        MyDate m=new MyDate();
        m.display();
        MyDate m1=new MyDate(14,11,2000);
        m1.display();
        MyDate m2=new MyDate();
        m2.setDay(19);
        m2.setMonth(5);
        m2.setYear(2009);
        m2.display();
    }

}
