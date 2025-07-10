package com.coreJava;

/*
 *  It can have abstract and non-abstract methods.
 *  It needs to be extended and its method implemented.
 *  It cannot be instantiated. ****
 */

/*Abstract Class can have Implemetation and Non-final fields
 * Intereface Can not have Non-final fields i.e Interface cannot carry State
 */
/* Note : though abstract class can have constructor, but we cannot initiate directly
 * we need to initialte the base/child class constructor to initilise with super() */


abstract class AbstractClass {
    String name;

    /* Here constructor cannot be initiate directly, it needs base clas constructor with super()*/
    AbstractClass(String str) {
        this.name = str;
        System.out.println("Abstract constructor  " + str);
    }


    public abstract String abstractMethod1(String str);

    public void concreateMethod() {
        System.out.println("concreateMethod");
    }
}

class TestNew extends AbstractClass {

    TestNew() {
        super("Hello");
        System.out.println("TestNew constructor");
    }

    public String abstractMethod1(String str) {
        return "My Name is " + str;
    }

    public static void main(String[] args) {
        TestNew test = new TestNew();

        // AbstractClass abstractClass = new AbstractClass("TestNew");
        /*We can not instatiate AbstractClass
         * To Call the Concrete method, we need to make Child class object and call parent method  */
        test.concreateMethod();
    }


}

/*
* 1. can't initiate the abstract class ( cannot create object via new )
* 2.To call Concrete method, we need to make Child class object and call abstract/parent class  method
* 3. We can make constructor in abstract class, but cannot call directly, we need to call child class const, and then use super(arg)
* 4. super only called with constructor body only and should have 1st line  
 * */
