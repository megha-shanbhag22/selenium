package com.capg;

class Factorial{
    public void findFact(int num)throws NegativeNumberException {
        if(num<0) {
            throw new NegativeNumberException("factorial of Negative num can't be allowed");
        }
        else {
            int fact=1;
            for(int i=num;i>0;i--) {
                fact=fact*i;
            }
            System.out.println(fact);
        }    
    }
}
public class FactorialMain {

 

    public static void main(String[] args){
        Factorial f=new Factorial();
        try {
            f.findFact(4);
        } catch (NegativeNumberException e) {

            System.out.println(e);
        }

 

    }

 

}