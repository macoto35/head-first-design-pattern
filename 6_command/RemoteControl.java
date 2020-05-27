import command.Command;
import command.NoCommand;

public class RemoteControl {
    private int commandSize = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[this.commandSize];
        this.offCommands = new Command[this.commandSize];
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < this.commandSize; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPressed() {
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\n----------Remote Control----------\n");
        for (int i = 0 ; i < this.commandSize; i++) {
            sb.append("[slot" + i + "] on: " + this.onCommands[i].getClass().getName() +", off: " + this.offCommands[i].getClass().getName());
            sb.append("\n");
        }
        sb.append("[undo]: " + this.undoCommand.getClass().getName());
        
        return sb.toString();
    }
}