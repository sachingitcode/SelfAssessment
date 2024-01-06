package com.designpattern.singleton;

// a class that has only one instance and provides a global point of access
//  class that can have only one object (an instance of the class) at a time.
//  After the first time, if we try to instantiate the Java Singleton classes,
//  the new variable also points to the first instance created


public class SingletonPattern {

    // create a PRIVATE STATIC object of the class
    private static final SingletonPattern instance = new SingletonPattern();

    //make the constructor private so that this class cannot be instantiated
    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        return instance;
    }

}
