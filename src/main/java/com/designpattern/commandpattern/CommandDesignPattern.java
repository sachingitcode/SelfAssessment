package com.designpattern.commandpattern;

public class CommandDesignPattern{ // behavioural design pattern
    // Here we use Command Design pattern ,
    // provides  loose coupling and remote control
    // Disadvantag :Increase in the number of classes for each individual command


    public static void main(String[] args) {
        new CommandDesignPattern().callOnCommand();
    }

    void callOnCommand() {
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        lightOnCommand.execute();
        System.out.println("Response is :"+ lightOnCommand.getResponse());
    }

}
