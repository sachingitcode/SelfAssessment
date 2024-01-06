package com.designpattern.adaptorpattern;

import com.designpattern.adaptorpattern.animal.Bird;
import com.designpattern.adaptorpattern.plasitic.ToyDuck;


/*
 * Here client doesn't know ant thing, we want to listen dcuk sound,
 * but we dont have makeSound for Plastic Duck.
 * We create bridge btwn them, so
 * */

public class BirdAdaptorListenDuckSoundByProvidingDuck  implements Bird {

    ToyDuck toyDuck;

    public BirdAdaptorListenDuckSoundByProvidingDuck(  ToyDuck toyDuck){
        this.toyDuck =toyDuck;
    }

    @Override
    public void makeSound() {
        toyDuck.squeak();
    }



}
