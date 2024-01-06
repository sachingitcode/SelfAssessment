package com.coreJava;

// Marker or tagged interface  ( no member  , methods )
// used to provide some essential information to the JVM
// so that JVM may perform some useful operation

// public interface Serializable{  
// } 

// public interface Cloneable{  
// } 

interface TestInterface {
    // private String pet = "Cat"; //Error as Only public static final are Allowed
    default void methodName() {
        System.out.println("My pet is  ");
    }
}

interface Printable {
    void print();
}

public class SimpleInterface1 implements Printable {
    public void print() {
        System.out.println(" Inside Printable  ");
    }

    public static void main(String[] args) {
        SimpleInterface1 intface = new SimpleInterface1();
        intface.print();

    }

}