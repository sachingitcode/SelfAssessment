package com.designpattern.commandpattern;

// This class gives command  to call the On method
public class LightOnCommand implements Command {

    Light light;
    String response;

    public String getResponse() {
        return response;
    }

    // The constructor is passed the light, it is going to control.
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        response = light.on();
    }

}
