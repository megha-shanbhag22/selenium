package com.capg;
class Vehicle{
	  void method1() {
	       System.out.println("class vehicle");
	    }
	}
class InheritanceDemo extends Vehicle{
	  void method1() {
	       System.out.println("class InheritanceDemo");    
	    }
	  public static void main(String[] args) {
	       InheritanceDemo c= new InheritanceDemo();
	       c.method1();
	    }
	}

