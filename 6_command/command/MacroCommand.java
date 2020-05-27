package command;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command command : this.commands) {
            command.execute();
        }
    }

    public void undo() {
        for (Command command : this.commands) {
            command.undo();
        }
    }
}