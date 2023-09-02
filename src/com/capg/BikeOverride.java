package com.capg;

class BikeOverrid{  
	  void run(){System.out.println("Vehicle is running");}
	  }    
class BikeOverride extends BikeOverrid{
	public static void main(String args[]){   
	BikeOverride obj = new BikeOverride();  
	obj.run();  
	}  
}
