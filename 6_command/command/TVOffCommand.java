package command;

import electronics.TV;

public class TVOffCommand implements Command {
    private TV tv;
    private int prevInputChannel;
    private int prevVolumn;
    
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.off();
        this.prevInputChannel = this.tv.getInputChannel();
        this.prevVolumn = this.tv.getVolumn();
    }

    public void undo() {
        this.tv.on();
        this.tv.setInputChannel(this.prevInputChannel);
        this.tv.setVolumn(this.prevVolumn);
    }
}