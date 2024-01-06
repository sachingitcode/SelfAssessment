package com.designpattern.factorymethod.Notifs;

public class CallNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Call notification");
    }
}