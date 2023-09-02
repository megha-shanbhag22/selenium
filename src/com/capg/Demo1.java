package com.capg;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

 public static void englishToMorse(String[] code,String[] englishLang)
 {
	 String b = " ";
	 Set<String> s=new HashSet<>();
     for (int i = 0; i < englishLang.length; i++) {
    	 String a=englishLang[i];
    	 
    	 int j=0;
    	 while(j<a.length()) {
         b+=code[a.charAt(i) - 'a'];
         j++;
     }
    	 
    	 s.add(b);
     }
     System.out.println(s.size());
     
 }
 public static void main(String[] args)
 {
     String[] code
         = { ".-",   "-...", "-.-.", "-..",  ".",
             "..-.", "--.",  "....", "..",   ".---",
             "-.-",  ".-..", "--",   "-.",   "---",
             ".--.", "--.-", ".-.",  "...",  "-",
             "..-",  "...-", ".--",  "-..-", "-.--",
             "--..", "|" };


     String[] englishLang = {"gin","zen","gig","msg"};

     englishToMorse(code, englishLang);
 }
}