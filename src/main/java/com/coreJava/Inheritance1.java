package com.coreJava;

interface Abcd {
    int i = 5;
    void adder(int i, int j);
    default void print(int j) {
        System.out.println("Print " + i + " With " + j);
    }
}

interface Xyz1 {
    void adder(int i, int j);
}

 class Inheritance2 implements Abcd {  
    public void adder(int i, int j) {
        System.out.println("Adding " + (i + j));
    }
 }

public class Inheritance1{
    public static void main(String[] args) {

        Abcd a1 = new Inheritance2();
        a1.adder(01, 04);

      //  Integer a = new Integer(9);
        Integer a = 9;
        Integer b= 9;
        Integer c= 9;

       System.out.println(a==b);
       System.out.println(b==c);
       System.out.println(a.equals(b));    
    }
}