package com.coreJava;

/*
 *  It can have abstract and non-abstract methods.
 *  It needs to be extended and its method implemented.
 *  It cannot be instantiated.
 */

 /*Abstract Class can have Implemetation and Non-final fields
  * Intereface Can not have Non-final fields i.e Interface cannot carry State
  */

  
abstract class AbstractClass {
    String name ;
    AbstractClass(String str) {
        this.name= str;
        System.out.println("Abstract constructor  " + str);
    }
    public abstract String abstractMethod1(String str);
}

class TestNew extends AbstractClass{

    TestNew(String str) {
        super(str);
    } 
    public String abstractMethod1(String str) { 
        return "My Name is "+str;
    } 
}