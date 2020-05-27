package command;

import electronics.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {
    
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.high();
    }
}