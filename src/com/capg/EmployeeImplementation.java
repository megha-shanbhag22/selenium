package com.capg;

class Employee{
    String name;
    String ssn;
    String dept;
    int salary;

 

    public Employee(String name, String ssn, String dept, int salary) {
        this.name = name;
        this.ssn = ssn;
        this.dept = dept;
        this.salary = salary;
    }
}

 

public class EmployeeImplementation {

 

    public Employee getEmployeeInfo(String str) {
        String name="";
        String ssn="";
        String dept="";

        String s="";

        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch!='@' || ch!='-' ||ch!='#') {
                s+=ch;
            }
            else {
                if(ch=='@') {
                    name=s;
                    s="";
                }
                if(ch=='-') {
                    ssn=s;
                    s="";
                }
                if(ch=='#') {
                    dept=s;
                    s="";
                }

            }
        }
        return new Employee(name,ssn,dept,Integer.parseInt(s));
    }

 

    public String getEmployeeDept(Employee e) {
        String ssn = e.ssn;

 

        String lastThreeDigits = ssn.substring(ssn.length() - 3);
        int ssnSuffix = Integer.parseInt(lastThreeDigits);

 

        if (ssnSuffix >= 1 && ssnSuffix <= 60) {
            return "L1";
        } else if (ssnSuffix >= 61 && ssnSuffix <= 120) {
            return "L2";
        } else if (ssnSuffix >= 121 && ssnSuffix <= 180) {
            return "L3";
        } else {
            return "L4";
        }

 

    }

 

}