package com.advanceJava;
/*        java 8 can have a  body of interface with default keyword
         it makes the interface fully non-abstract 
         It is also a functionInterface where only 1 method is abtract 
         and other are non-abstract methods ie default and static .
          These methods are non-abstract methods and can have method body 
          *  interface can all methods nonAbstract        
           */

interface functionInterface {

    void draw();

    default void drawWithbody() {
        System.out.println(" Draw with body ");
    }

}

class test implements functionInterface {
    @Override
    public void draw() {
        System.out.println(" Drawing at test  draw ");
    }
}

public class advanceInterface1 {

    public static void main(String[] args) {
        functionInterface fn = new test();
        fn.draw();
        fn.drawWithbody();

    }

}
