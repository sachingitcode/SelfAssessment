package com.designpattern.abstractDesignPattern;


public class MainClass {
    public static void main(String[] args) {

        getCarNames("Toyota", "Suv");
    }

    private static void  getCarNames(String brand , String carType){
    CarAbstractFactory carFactory = CarCompanyDefiner.carCompany(brand);
    Car car1 = carFactory.getCarType(carType);
    car1.carName();
}
}
