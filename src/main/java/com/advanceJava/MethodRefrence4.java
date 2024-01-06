package com.advanceJava;

/**
 * 
 */
interface  IntfcName{
    void methdName();     // functional interface is must for ref method
} 

public class MethodRefrence4 {
     
    public   void methdREfrencemthod() {  //  NoNstatic  method is must for this type 
        System.out.println(" inside  non static method of  main class ");
    }

    public static void main(String[] args) {

        MethodRefrence4 var  = new MethodRefrence4();   //this line is addition for non static 
        IntfcName a = var::methdREfrencemthod;             // / Creating object  
        a.methdName();

        // IntfcName a = new MethodRefrence4()::methdREfrencemthod;   // it is called ananymous funcion 
        // a.methdName();
    }


}
