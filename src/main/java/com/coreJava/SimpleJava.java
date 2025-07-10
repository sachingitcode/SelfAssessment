package com.coreJava;

/* When Static block is there,
 *  you can declare a static block that gets executed exactly once, when the class is first loaded. */


class NewCounter {
    static int counter = 0; // shared across all objects  **********
    int counts = 0;         // separate for each object **********

    public void increment() {
        counts++;
        counter++;
        System.out.println("Counter: " + counter);
        System.out.println("Counts: " + counts);
    }
}

class SampleClass1 {
    public SampleClass1() {
        System.out.println("SampleClass1 constructor");
    }

    int a = 11;
    static int b = 22;


    public static void Method1_1() {
        System.out.println("Inside SampleClass1 Method1_1");
        System.out.println(b); // As Method1_1 is called ,but constructor is still not called bcoz  new keyword is not called yet.
        System.out.println(new SampleClass1().a + b);  //Here as new is called , so First constructor is called
    }

    public void Method1_2() {
        System.out.println("Inside SampleClass1 Method1_2");
        System.out.println(new SampleClass1().a + b);  //Here as new is called , so First constructor is called
    }

    static {
        System.out.println("SampleClass1 static block !!!");
    }

}


public class SimpleJava {
    int a = 1;
    static int b = 2;

    public static void main(String[] args) {

        // System.out.println(a);  // new can not access it
        System.out.println(new SimpleJava().a);
        System.out.println("Sample Class Start !!! " + b);

//        new SampleClass1().Method1_2();
        newStaticMethod_1();

    }

    static void newStaticMethod_1() {
        System.out.println("Inside newStaticMethod_1");

        NewCounter counter = new NewCounter();   //creates a new object // and its counts is initialized to 0

        counter.increment();
        NewCounter counter1 = new NewCounter();  // Here whenever new obj create .
        counter1.increment();
    }
/*  Result :
Counter: 1
Counts: 1
Counter: 2
Counts: 1


✅ counter is static → shared by all instances of NewCounter
✅ counts is non-static → each object has its own version*/

}

