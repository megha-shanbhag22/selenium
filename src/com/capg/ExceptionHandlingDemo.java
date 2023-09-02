package com.capg;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a=57,c;
			c=a/0;
			System.out.println(c);
			
			int[] arr=new int[6];
	        arr[8]=90;
	        
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Stop");

	}

}
