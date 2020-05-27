package electronics;

public class GarageDoor {
    private String name = "";

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(this.name + " garage Door is open!");
    }

    public void down() {
        System.out.println(this.name + " garage Door is close!");
    }

    public void stop() {
        System.out.println(this.name + " garage Door is stop working!");
    }

    public void lightOn() {
        System.out.println(this.name + " garage Dppr Light is on!");
    }

    public void lightOff() {
        System.out.println(this.name + " garage Dppr Light is off!");
    }
}