package com.designpattern.adaptorpattern.animal;

public class Sparrow  implements Bird {
    // a concrete implementation of bird
    public void makeSound() {
        System.out.println("Sparrow : Chirp Chirps");
    }
}