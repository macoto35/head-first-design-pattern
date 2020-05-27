package command;

import electronics.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;
    private int prevTemperature;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        this.prevTemperature = this.hottub.getTemperature();
        this.hottub.setTemperature(98);
        this.hottub.off();
    }

    public void undo() {
        this.hottub.on();
        this.hottub.setTemperature(this.prevTemperature);
        this.hottub.circulate();
    }

}