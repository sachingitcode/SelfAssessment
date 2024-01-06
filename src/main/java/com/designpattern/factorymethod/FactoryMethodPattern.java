package com.designpattern.factorymethod;

//structural design pattern

import com.designpattern.factorymethod.Notifs.Notification;

/*
*  we create object without exposing the creation logic to the client
* */
public class FactoryMethodPattern {
    //
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

        new NotificationFactory()
                .createNotification("EMAIL")
                .notifyUser();
    }
}
