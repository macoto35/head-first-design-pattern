package command;

import electronics.TV;

public class TVOnCommand implements Command {
    private TV tv;
    
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.on();
        this.tv.setInputChannel(3);
        this.tv.setVolumn(11);
    }

    public void undo() {
        this.tv.off();
    }
}