package com.growth.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Receiver {

    private List<ICommand> commandList;

    public Receiver() {
        this.commandList = new ArrayList<>();
    }

    public void queueCommand(ICommand command) {
        this.commandList.add(command);
        System.out.println(String.format("Queued command: %s", command.toString()));
    }


    public void executeCommands() {
        for(ICommand command : commandList) {
            command.execute();
        }
    }
}
