package com.capg;

public class ElseIf {
	public static void main(String[] args) {
		int a=220;
		if(a<50) {
			System.out.println("less");
		}
		else if (50<a && a <100) {
			System.out.println("more");
		}
		else if (100<a && a <200) {
			System.out.println("ok");
		}
		else if (200<a && a <300) {
			System.out.println("okay");
		}
		else {
			System.out.println("300");
		}

	}

}
