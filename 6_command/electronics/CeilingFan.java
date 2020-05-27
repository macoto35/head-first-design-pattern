package electronics;

public class CeilingFan {
    public enum FanSpeed {
        high,
        medium,
        low,
        off
    }

    private String name = "";
    private FanSpeed speed;

    public CeilingFan(String name) {
        this.name = name;
        this.speed = FanSpeed.off;
    }

    public void high() {
        this.speed = FanSpeed.high;
        System.out.println(this.name + " ceiling fan is on high");
    }

    public void medium() {
        this.speed = FanSpeed.medium;
        System.out.println(this.name + " ceiling fan is on medium");
    }

    public void low() {
        this.speed = FanSpeed.low;
        System.out.println(this.name + " ceiling fan is on low");        
    }

    public void off() {
        this.speed = FanSpeed.off;
        System.out.println(this.name + " ceiling fan is off");
    }

    public FanSpeed getSpeed() {
        return this.speed;
    }
}