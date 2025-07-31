package com.demo.lab1;

public class multiplicationTable {

    public static void printTableFor(int inputNumber){

        for(int i=1;i<=10;i++){
            System.out.println( i + "\t x" + "\t" + inputNumber + "=" + (inputNumber*i));
        }
    }

    public static void printTableWhile(int inputNumber){
        int i=1;
        while(i<=10){
            System.out.println( i + "\t x" + "\t" + inputNumber + "=" + (inputNumber*i));
            i++;
        }
    }

    public static void printTableDoWhile(int inputNumber){
        int i=1;
        do{
            System.out.println( i + "\t x" + "\t" + inputNumber + "=" + (inputNumber*i));
            i++;
        }while(i<=10);
    }
    public static void main(String args[]){

        int inputNumber =2;

        printTableFor(inputNumber);
        printTableWhile(inputNumber);
        printTableDoWhile(inputNumber);
    }

}
