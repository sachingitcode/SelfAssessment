package com.designpattern.abstractfactorymethod.Notifications;


//structural design pattern

import com.designpattern.abstractfactorymethod.abstractfactory.AbstractFactory;

/*
 *  This is the Factory Design pattern ;
 * */
public class NotificationFactoryMethodPattern extends AbstractFactory {
    public void callFactoryMethod(String channel) {
        new NotificationFactory()
                .createNotification(channel)
                .notifyUser();
    }
}
