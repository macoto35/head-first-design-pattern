package command;

import electronics.Stereo;
import electronics.Stereo.InputType;

public class StereoOffCommand implements Command {
    private Stereo stereo;
    private InputType prevInputType;
    private int prevVolumn;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.prevInputType = this.stereo.getInputType();
        this.prevVolumn = this.stereo.getVolumn();

        this.stereo.off();
    }

    public void undo() {
        switch (this.prevInputType) {
            case CD:
                this.stereo.on(); this.stereo.setCd(); break;

            case DVD:
                this.stereo.on(); this.stereo.setDvd(); break;

            case Radio:
                this.stereo.on(); this.stereo.setRadio(); break;

            default:
                this.stereo.off(); break;
        }

        this.stereo.setVolumn(this.prevVolumn);
    }
}