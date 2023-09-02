package com.capg;

public class AnimalMain implements Animal {

	@Override
	public void dog() {
		System.out.println("Dog");

	}

	@Override
	public void cat() {
		System.out.println("Cat");

	}

	@Override
	public void rat() {
		System.out.println("Rat");

	}
	public static void main(String[] args) {
		AnimalMain a=new AnimalMain();
		a.cat();
		a.dog();
		a.rat();
	}

}
