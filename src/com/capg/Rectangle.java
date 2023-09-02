package com.capg;

public class Rectangle extends Shape {
	public Rectangle() {
		super(20);
		System.out.println("It is a shape");
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle");
		
	}
	
	
}
