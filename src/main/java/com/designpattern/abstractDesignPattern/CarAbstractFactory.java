package com.designpattern.abstractDesignPattern;


// Here  Objects of Base Class Are Creates

public abstract class CarAbstractFactory {
    public abstract Car getCarType(String partName);
}

class ToyotaCarFactory extends CarAbstractFactory {
    public Car getCarType(String partName) {
        if (partName.equals("Suv"))
            return new ToyotaSuv();
        if (partName.equals("Sedan"))
            return new ToyotaSedan();
        return null;
    }
}

class MarutiCarFactory extends CarAbstractFactory {
    public Car getCarType(String partName) {
        if (partName.equals("Suv"))
            return new MarutiSuv();
        if (partName.equals("Sedan"))
            return new MarutiSedan();
        return null;
    }
}