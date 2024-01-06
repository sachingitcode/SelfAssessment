package com.coreJava;


public class DefaultConstructorClass {
    DefaultConstructorClass(){
        System.out.println("HI");
    }
    int a ;
    int b ; 
     static String name = "sachin" ;
    
     void method2(){
       name = "sandip" ;
    }
 
    public static void main(String[] args) {
   
    DefaultConstructorClass df = new DefaultConstructorClass();
       df.method2();
    
       System.out.println("My name "+  name); 
    // Xyz abc = new Xyz();
    int a =  Xyz.methodname ("str", 6 );
    System.out.println("My Value "+ a); 
    }
}

class Xyz {
  static   int methodname (String str , int i ) {
      return  i + str.length();
  }
}

 