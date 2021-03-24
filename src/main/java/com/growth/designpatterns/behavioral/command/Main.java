package com.growth.designpatterns.behavioral.command;

public class Main {

    public static void main(String... args) {
        Receiver receiver = new Receiver();

        //Queue Commands
        receiver.queueCommand(new CommandA(new Request("New Client", "Hi")));
        receiver.queueCommand(new CommandA(new Request("New Client", "Hello")));
        receiver.queueCommand(new CommandB(new Request("New Client", "Bye")));
        receiver.queueCommand(new CommandB(new Request("New Client", "Bye Bye")));

        //Execute Commands
        receiver.executeCommands();
    }
}
