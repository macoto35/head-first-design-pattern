package command;

import electronics.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {
    
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.off();
    }
}