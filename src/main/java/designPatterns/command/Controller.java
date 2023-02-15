package designPatterns.command;

import java.util.ArrayDeque;

public class Controller {
    ArrayDeque<Command> commands;
    Command command;

    public Controller() {
        commands = new ArrayDeque<>();
    }

    public void executeCommand(Command command) {
        commands.push(command);
        this.command = command;
        command.execute();
    }

    public void lastCommand() {
        commands.pop();
        Command lastCommand = commands.peek();
        if (lastCommand != null) {
            lastCommand.execute();
        }

    }
}
