package com.growth.designpatterns.behavioral.command;

public class CommandB implements ICommand {

    private Request request;

    public CommandB(Request request) {
        this.request = request;
    }

    @Override
    public void execute() {
        System.out.println(String.format("Command B executed request (%s)", request.getRequestString()));
    }

    public String toString() {
        return String.format("Command B with request (%s)", request.getRequestString());
    }
}
