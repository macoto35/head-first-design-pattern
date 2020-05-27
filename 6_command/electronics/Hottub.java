package electronics;

public class Hottub {
    private String name = "";
    private boolean isOn;
    private int temperature = 0;

    public Hottub(String name) {
        this.name = name;
    }

    public void on() {
        this.isOn = true;
        System.out.println(this.name + " hottub is on");
    }

    public void off() {
        this.isOn = false;
        System.out.println(this.name + " hottub is off");
    }

    public void circulate() {
        if (this.isOn) {
            System.out.println("Hottub is bubbling!");
        }
    }

    public void jetsOn() {
		if (this.isOn) {
			System.out.println("Hottub jets are on");
		}
    }

    public void jetsOff() {
        if (this.isOn) {
			System.out.println("Hottub jets are off");
		}
    }

    public void setTemperature(int temperature) {
        if (temperature > this.temperature) {
			System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
		}
		else {
			System.out.println("Hottub is cooling to " + temperature + " degrees");
        }
        
		this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }
}