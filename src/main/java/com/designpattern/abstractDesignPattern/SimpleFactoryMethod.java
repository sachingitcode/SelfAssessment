package com.designpattern.abstractDesignPattern;

/* Simply Create 1 Interface and 4 Classes Implementing that Interface // Like Car Inteface 
 * Create Factory class having Method that  returns Car object 
 * In Main Class Call -> Create Factory Object to Call that FactoryClass Method
 * That FactoryClass Method Return the Interface. From that call the Interface Method
 */

// Creates objects with a common interface and lets a class defer instantiation to subclasses

// A class or interface relies on a drived class to provide the implemetation 
// where as Base provides the Common behaviour
// It uses  Inhertance as Design Tool 

// Reduce Null As much as you can 
/* eg    public List<String> returnList (){ 
    return null ;   
    return List.of();  <- use This , instead of null;
   } */

   
// Here Objects are Created 


class CarFactory {

    public Car getCarNames(String brandType) {

        if (brandType.equals("ToyotaSuv"))
            return new ToyotaSuv();
        if (brandType.equals("ToyotaSedan"))
            return new ToyotaSedan();

        if (brandType.equals("MarutiSuv"))
            return new MarutiSuv();
        if (brandType.equals("MarutiSedan"))
            return new MarutiSedan();

        return null;
    }
}

public class SimpleFactoryMethod {

public static void main(String[] args) {
    // It tells Factory For which Object to create
    CarFactory carFactory = new CarFactory();
    Car car = carFactory.getCarNames("ToyotaSuv");
    car.carName();
}
}
