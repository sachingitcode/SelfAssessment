package com.designpattern.adaptorpattern.animal;

public class Pegion implements Bird {
    // a concrete implementation of bird
    public void makeSound() {
        System.out.println("Pegion : Gutur Gutur");
    }
}