import command.GarageDoorUpCommand;
import command.LightOnCommand;
import electronics.GarageDoor;
import electronics.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}