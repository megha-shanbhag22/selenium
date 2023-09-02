package com.capg;

class Demo {
	public void divide(int a,int b)throws ArithmeticException {
        int c=a/b;
        System.out.println("value is: "+c);
    }
}
public class ThrowsDemo {

    public static void main(String[] args) {
        Demo d=new Demo();
        try {
        d.divide(100, 0);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
