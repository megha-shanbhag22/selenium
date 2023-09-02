package com.capg;

public abstract class Shape {
	public Shape() {
		System.out.println("Default");
	}
	public Shape(int a) {
		System.out.println("Parametered");
	}
	public abstract void area();
	public void shapeType() {
		System.out.println("It is a shape");
	}
}
