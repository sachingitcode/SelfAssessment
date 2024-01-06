package com.designpattern.abstractfactorymethod.Callers;

//structural design pattern

/*
*  we create object without exposing the creation logic to the client
* */

import com.designpattern.abstractfactorymethod.abstractfactory.AbstractFactory;

public class CallerFactoryMethodPattern extends AbstractFactory {
    public void callFactoryMethod(String channel) {
        new CallerFactory()
                .createCall(channel)
                .callUser();
    }
}
//        NotificationFactory notificationFactory = new NotificationFactory();//        Notification notification = notificationFactory.createNotification("SMS");//        notification.notifyUser();
