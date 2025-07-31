package com.demo.lab1;

public class adder {
    public int add(int a, int b){
    return a+b;
    }
    public int add(int a, int b, int c){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }




    public static void main(String args[]){

        adder add= new adder();
        System.out.println(add.add(20,30));
        System.out.println(add.add(34,123));
        System.out.println(add.add(59,45));
        System.out.println(add.add(20,10));
        System.out.println(add.add(20.4543,10.436));

    }
}
