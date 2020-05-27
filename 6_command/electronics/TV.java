package electronics;

public class TV {
    private String name = "";
    private int channel = 0;
    private int volumn = 0;

    public TV (String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(this.name + "tv is on");
    }

    public void off() {
        System.out.println(this.name + "tv is off");
    }

    public void setInputChannel(int channel) {
        this.channel = channel;
        System.out.println(this.name + " tv channel to " + this.channel);
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
        System.out.println(this.name + " tv volumn set to " + this.volumn);
    }

    public int getInputChannel() {
        return this.channel;
    }

    public int getVolumn() {
        return this.volumn;
    }
}