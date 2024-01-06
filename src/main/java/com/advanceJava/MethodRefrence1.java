package com.advanceJava;
/* 
    used to refer method of functional interface.
    alternate of lambda expression
         Reference to a static method.     //  static method as refrencee is must for this type 
         Reference to an instance method.  //  for nonStatic check MethodRefrence4
         Reference to a constructor
    */

interface intfcNam {
    // void methd2(); // functional interface is must for ref method
    void methdName(); //
}

public class MethodRefrence1 {

    public static void methdRefrencemthod() { // static method is must for this type
        System.out.println(" inside method of  main class ");
    }

    public static void main(String[] args) {
        intfcNam var = MethodRefrence1::methdRefrencemthod;
        var.methdName();
        // helps to call only static method inside main class ; for nonStatic check
        // MethodRefrence4
    }

}
