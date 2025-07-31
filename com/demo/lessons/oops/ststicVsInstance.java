package com.demo.lessons.oops;

public class ststicVsInstance {
    public static void main(String args[]){
        Employee.companyName="Thriller company";
        String companyName = Employee.companyName;
        System.out.println(companyName);

        Employee emp1= new Employee();
        emp1.employeeName="amruta";
        System.out.println(emp1.employeeName);

        Employee.companyName="Daridra company";

        Employee emp2= new Employee();
        emp2.employeeName="nivedita";
        System.out.println(emp2.employeeName);

        System.out.println(companyName);
    }
}

class Employee{
    public static String companyName ="amazing company";
    public String employeeName;
}