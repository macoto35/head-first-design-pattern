package command;

import electronics.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        this.hottub.on();
        this.hottub.setTemperature(104);
        this.hottub.circulate();
    }

    public void undo() {
        this.hottub.off();
    }
}