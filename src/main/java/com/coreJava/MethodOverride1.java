package com.coreJava;

/**
 * Static method in parent class is not overriden
 * id parent has static method :in  result shows parent class method
 * if child has static method & parent dont : in result shows parent class method.
 * if not are nonStatic : in result shows child class method
 */

//parent class  
class ParentClass {
    public void nonStatic() {System.out.println("Non Static method of the parent class.");}
    public static void display() {         // we cannot override the display() method
        System.out.println("Static method of the parent class.");
    }
}

// child class
class ChildClass extends ParentClass {
    public void nonStatic() {System.out.println("Non Static method of the Child class.");}

    // the same method also exists in the ParentClass
    // it does not override, actually it is method hiding
    public static void display() {
        System.out.println("Static method in Child Class in Java");
    }
}

public class MethodOverride1 {
    public static void main(String[] args) {

        ParentClass pc = new ChildClass();     // calling display() method by parent class object
        ParentClass.display();
        ChildClass c = new ChildClass();
        ChildClass.display();

        System.out.println("Calling ParentClass pc = new ChildClass ");
        pc.nonStatic();

        System.out.println("Calling ChildClass c = new ChildClass");
        c.nonStatic();

        ParentClass pc1 = new ParentClass();
        System.out.println("Calling ParentClass pc1 = new ParentClass");
        pc1.nonStatic();





    }
}