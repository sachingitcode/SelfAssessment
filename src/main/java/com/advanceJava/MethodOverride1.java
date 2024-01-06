
package com.advanceJava;

/**
 *  Static method in parent class is not overriden 
 *  id parent has static method :in  result shows parent class method 
 *  if child has static method & parent dont : in result shows parent class method.
 *  if not are nonStatic : in result shows child class method
 */ 
//parent class  
class ParentClass { 
    public  static  void display() {         // we cannot override the display() method
        System.out.println("display() method of the parent class.");
    }
}

// child class
class ChildClass extends ParentClass {
    // the same method also exists in the ParentClass
    // it does not override, actually it is method hiding
    public  static  void display() {
        System.out.println("Overridden static method in Child Class in Java");
    }
}

public class MethodOverride1 {
    public static void main(String args[]) {
      //  ParentClass pc = new ChildClass();
                                  // calling display() method by parent class object
        ParentClass.display();
        // ChildClass c   = new ChildClass();
        // c.display();
    }
}