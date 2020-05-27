import command.CeilingFanHighCommand;
import command.CeilingFanMediumCommand;
import command.CeilingFanOffCommand;
import command.Command;
import command.GarageDoorDownCommand;
import command.GarageDoorUpCommand;
import command.HottubOffCommand;
import command.HottubOnCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import command.MacroCommand;
import command.StereoOffCommand;
import command.StereoOnWithCDCommand;
import command.TVOffCommand;
import command.TVOnCommand;
import electronics.CeilingFan;
import electronics.GarageDoor;
import electronics.Hottub;
import electronics.Light;
import electronics.Stereo;
import electronics.TV;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteLoader remoteLoader = new RemoteLoader();
        // remoteLoader.executeTest();
        // remoteLoader.undoTest();
        // remoteLoader.fanTest();
        remoteLoader.macroTest();
    }

    public void executeTest() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);
        CeilingFanHighCommand ceilingFanOnWithHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCd = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenRoomLightOff);
        remoteControl.setCommand(2, ceilingFanOnWithHigh, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCd, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
    }

    public void undoTest() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
    }

    public void fanTest() {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
    }

    public void macroTest() {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub("");

        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPressed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPressed(0);
        System.out.println("--- Pushing Macro Undo ---");
        remoteControl.undoButtonWasPressed();
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPressed(0);
    }
}