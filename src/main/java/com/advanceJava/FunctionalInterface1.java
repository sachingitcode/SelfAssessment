
package com.advanceJava;

/*
Functional interface are interface having single abstract method (SAM).

A functional interface can extend another interface only when it does not have any abstract method.
a functional interface only  extend to a non-functional interface.

Note having 2 abstract method wont give compile time error . But it is not counted as func. interface
 
Functional Interfaces are mainly used in Lambda expressions,
 Method reference and constructor references.
  In functional programming, code can be treated as data.
  For this purpose Lambda expressions are introduced.
 They can be used to pass a block of code to another method or object.

*/
// @FunctionalInterface  

interface sayable {
    void say(String msg);   // abstract method  

    // It can contain any number of Object class methods. Object class methods are not counted for Functional interface
    int hashCode();
    String toString();
    boolean equals(Object obj);
    void doable();
    //   only single abs methods is allowed
}

class says implements sayable {
    public void say(String msg) {
        System.out.println(" say a msg: " + msg);
    }

    public void doable() {
        System.out.println(" say a msg again  ");
    }
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        sayable fie = new says();
        fie.say("Hello there");
        //     fie.doable();    // says must implement the inherited abstract method sayable.doable()

           /* note No error will be given if doable is not called/inits in says class,
             till fie.doable() is not called.
             it fie.doable() is called and then it is not implmented/ called. it will throw eror.
           */
    }
}
