package com.designpattern.adaptorpattern;

import com.designpattern.adaptorpattern.plasitic.ToyDuck;
import com.designpattern.adaptorpattern.animal.Bird;


public class BirdAdapter implements ToyDuck {  // This class is used to bridge blwn animal & plasitc

    //Here though BirdAdapter implements ToyDuck interface ,
    // still it Calls Bird Interface
    Bird bird;

    public BirdAdapter(Bird bird)
    {
        this.bird = bird;   // we need reference to the object we are adapting
    }

    @Override
    public void squeak() {  // Here Squeak is of ToyDuck , where as makesound is of animal
        bird.makeSound();
    }
}
