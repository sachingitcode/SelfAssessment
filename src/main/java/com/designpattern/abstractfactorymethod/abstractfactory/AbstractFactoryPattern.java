package com.designpattern.abstractfactorymethod.abstractfactory;

//Creational Patterns
//These design patterns provide a way to create objects while hiding the creation logic,
// rather than instantiating objects directly using new operator.
// They mainly deal with the process of object creation

import com.designpattern.abstractfactorymethod.Callers.CallerFactoryMethodPattern;
import com.designpattern.abstractfactorymethod.Notifications.NotificationFactoryMethodPattern;

public class AbstractFactoryPattern {
    public AbstractFactory createAbstractFactory(String phonePart) {
        return switch (phonePart) {
            case "Notification" -> new NotificationFactoryMethodPattern();
            case "Call" -> new CallerFactoryMethodPattern();
            default -> throw new IllegalArgumentException("Unknown channel " + phonePart);
        };
    }
}
