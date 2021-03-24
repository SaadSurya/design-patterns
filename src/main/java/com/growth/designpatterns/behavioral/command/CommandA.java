package com.growth.designpatterns.behavioral.command;

public class CommandA implements ICommand {

    private Request request;

    public CommandA(Request request) {
        this.request = request;
    }

    @Override
    public void execute() {
        System.out.println(String.format("Command A executed request (%s)", request.getRequestString()));
    }

    public String toString() {
        return String.format("Command A with request (%s)", request.getRequestString());
    }
}
