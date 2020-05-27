package command;

import electronics.CeilingFan;
import electronics.CeilingFan.FanSpeed;

public abstract class CeilingFanCommand implements Command {
    public FanSpeed prevSpeed;
    public CeilingFan ceilingFan;

    public void undo() {
        if (this.prevSpeed.equals(FanSpeed.high)) {
            this.ceilingFan.high();
        } else if (this.prevSpeed.equals(FanSpeed.medium)) {
            this.ceilingFan.medium();
        } else if (this.prevSpeed.equals(FanSpeed.low)) {
            this.ceilingFan.low();
        } else if (this.prevSpeed.equals(FanSpeed.off)) {
            this.ceilingFan.off();
        }
    }
}