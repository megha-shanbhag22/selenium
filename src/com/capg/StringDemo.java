package com.capg;

public class StringDemo {

	public static void main(java.lang.String[] args) {
		String s1="String";
        String s2=new String("Java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.concat("Script"));
        
        StringBuilder s3=new StringBuilder("Cloud");
        System.out.println(s3);
        StringBuilder s4=s3.append(s2);
        System.out.println(s4);

 

	}

}
