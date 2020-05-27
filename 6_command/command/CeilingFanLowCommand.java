package command;

import electronics.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.low();
    }
}