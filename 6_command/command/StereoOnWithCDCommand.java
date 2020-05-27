package command;

import electronics.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
        this.stereo.setVolumn(11);
    }

    public void undo() {
        this.stereo.off();
    }
}