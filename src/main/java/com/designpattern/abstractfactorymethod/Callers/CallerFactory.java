package com.designpattern.abstractfactorymethod.Callers;

import com.designpattern.abstractfactorymethod.Callers.Callies.CallCaller;
import com.designpattern.abstractfactorymethod.Callers.Callies.Caller;
import com.designpattern.abstractfactorymethod.Callers.Callies.EmailCaller;
import com.designpattern.abstractfactorymethod.Callers.Callies.SMSCaller;

public class CallerFactory{

    public Caller createCall(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        return switch (channel) {
            case "SMS" -> new SMSCaller();
            case "EMAIL" -> new EmailCaller();
            case "PUSH" -> new CallCaller();
            default -> throw new IllegalArgumentException("Unknown Caller Channel " + channel);
        };
    }
}
