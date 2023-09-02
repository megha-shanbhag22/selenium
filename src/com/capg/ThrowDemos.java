package com.capg;

class Demos {
	public void divide(int a,int b) {
        if(b==0) {
            throw new ArithmeticException("Number can't divide by zero");
        }
        else {
        int c=a/b;
        System.out.println("value is: "+c);
        }
    }
}
public class ThrowDemos {

 

    public static void main(String[] args) {
        Demos d=new Demos();
        try {
        d.divide(100, 0);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}