package electronics;

public class Stereo {
    public enum InputType {
        CD,
        DVD,
        Radio,
        Off
    }

    private String name = "";
    private InputType inputType;
    private int volumn = 0;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name+ " stereo is on");
    }

    public void off() {
        this.inputType = InputType.Off;
        System.out.println(this.name+ " stereo is off");
    }

    public void setCd() {
        this.inputType = InputType.CD;
        System.out.println(this.name+ " stereo is set for CD input");
    }

    public void setDvd() {
        this.inputType = InputType.DVD;
        System.out.println(this.name+ " stereo is set for DVD input");
    }

    public void setRadio() {
        this.inputType = InputType.Radio;
        System.out.println(this.name+ " stereo is set for Radio input");
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
        System.out.println(this.name + " stereo volumn set to " + this.volumn);
    }

    public int getVolumn() {
        return this.volumn;
    }

    public InputType getInputType() {
        return this.inputType;
    }
}