package command;

import electronics.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        this.garageDoor.down();
    }

    public void undo() {
        this.garageDoor.up();
    }
}