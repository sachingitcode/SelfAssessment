package com.designpattern.adaptorpattern;

import com.designpattern.adaptorpattern.animal.Bird;
import com.designpattern.adaptorpattern.animal.Sparrow;
import com.designpattern.adaptorpattern.plasitic.PlasticToyDuck;
import com.designpattern.adaptorpattern.plasitic.ToyDuck;

// structural design pattern  :: These design patterns concern class and object composition.
// Concept of inheritance is used to compose interfaces
// and define ways to compose objects to obtain new functionalities.

public class AdaptorDesignPattern {
    // It converts the interface of a class into another interface that a client wants
    // It is like an adaptor,
    //
    //It allows two or more previously incompatible objects to interact.
   // It allows reusability of existing functionality.


    /*
    * Here Bird Interface has sound Method, which is implemented by Sparrow class in it.
    *
    *  */
    public static void main(String[] args) {

        Bird sparrow = new Sparrow();
        sparrow.makeSound();

        ToyDuck toyDuck = new PlasticToyDuck();
        toyDuck.squeak();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);  // Wrap a bird in a birdAdapter so that it behaves like toy duck
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();


        /*
        * Below is the understandable example.
        * as we know sparrow bird make sound but duck can't so here we created a bridge and provide toyDuck to create a sound
        *  */
        System.out.println("As ToyDuck Doesn't creates sound. But We Created a Adaptor to make sound for ToyDuck");
        var adaptor=   new BirdAdaptorListenDuckSoundByProvidingDuck( toyDuck);
       adaptor.makeSound();

    }
}
