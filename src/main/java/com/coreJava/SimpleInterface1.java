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

        Printable p = (() -> System.out.println("Inside Printable  "));
        p.print();

    }

}

/* THIS IS FUNCTIONAL INTERFACE  IMPL*/

/* Simply call the Interface name to   */

class Testing { //implements Printable *NOTE HERE we are not implementing *
    public void func(String[] args) {
        Printable p = () -> {
            System.out.println("Print My pet ");
        };
        p.print();
    }
}
