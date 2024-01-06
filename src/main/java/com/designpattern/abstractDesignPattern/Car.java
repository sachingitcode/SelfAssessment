package com.designpattern.abstractDesignPattern;

public interface Car {
    void carName();
}

/* Toyota Factory */

class ToyotaSuv implements Car{
    public void carName() {
     System.out.println("Fortuner,UrbanCruiser");    
    }
}

class TataSuv{
    Car newcarMethod = () ->{
        System.out.println("Sample Tata Suv");
    };
}



class ToyotaSedan implements Car{
    public void carName() {
        System.out.println("Corolla Camry");    
       }
}


/* Maruti Factory */

class MarutiSuv implements Car{
    public void carName() {
     System.out.println("Brazza,S-Cross");    
    }
}

class MarutiSedan implements Car{
    public void carName() {
        System.out.println("Desize, Ciaz");    
       }
}