package com.coreJava;
 


class Parent{   
 public  void  run() {System.out.println("Parent is Here");}  
  }   
class Child extends Parent{  

 public  void run() {System.out.println("Child is Here");}  
  }

  public class MethodOverloading {
    public static void main(String args[]){  
    Parent obj3 = new Parent();    obj3.run();
    Parent obj2 = new Child();     obj2.run(); 
   Math.random();   // random is static method 
    Child  obj1 = new Child();     obj1.run(); 
                //   Child obj4 = new Parent();      Type Mismatch Error
    }  
  }  


