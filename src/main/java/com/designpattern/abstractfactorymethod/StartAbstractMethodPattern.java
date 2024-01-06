package com.designpattern.abstractfactorymethod;

import com.designpattern.abstractfactorymethod.abstractfactory.AbstractFactoryPattern;

public class StartAbstractMethodPattern {

    public static void main(String[] args) {
        String phonepart = "Notification";
        String phonetype = "EMAIL";
        new AbstractFactoryPattern()
                .createAbstractFactory(phonepart)
                .callFactoryMethod(phonetype);
    }
}
/* Flow
MAIN
 ->   abstract class AbstractFactory  having abstract callFactoryMethod








*  */