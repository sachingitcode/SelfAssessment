package com.designpattern.factorymethod;

import com.designpattern.factorymethod.Notifs.CallNotification;
import com.designpattern.factorymethod.Notifs.EmailNotification;
import com.designpattern.factorymethod.Notifs.Notification;
import com.designpattern.factorymethod.Notifs.SMSNotification;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new CallNotification();
            default -> throw new IllegalArgumentException("Unknown channel " + channel);
        };
    }
}
