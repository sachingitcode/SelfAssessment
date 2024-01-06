package com.designpattern.adaptorpattern.plasitic;

public class PlasticToyDuck  implements ToyDuck{
    @Override
    public void squeak() {
        System.out.println("Plastic Duck Squeaks..");
    }
}
