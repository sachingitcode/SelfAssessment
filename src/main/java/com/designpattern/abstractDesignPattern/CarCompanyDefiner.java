package com.designpattern.abstractDesignPattern;

 // Sub Level  Objects are Created

public class CarCompanyDefiner {

    public static CarAbstractFactory carCompany(String side) {
        if (side.equals("Toyota"))
            return new ToyotaCarFactory();

        if (side.equals("Maruti"))
            return new MarutiCarFactory();

        return null;
    }

}
