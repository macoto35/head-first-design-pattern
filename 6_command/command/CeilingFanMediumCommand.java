package command;

import electronics.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.medium();
    }
}