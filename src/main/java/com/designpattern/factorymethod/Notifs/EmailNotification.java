package com.designpattern.factorymethod.Notifs;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}