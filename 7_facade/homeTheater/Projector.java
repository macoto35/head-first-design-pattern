package homeTheater;

public class Projector {
    private String description;

    public Projector(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(this.description + " Projector on");
    }

    public void wideScreenMode() {
        System.out.println(this.description + " Projector in widescreen mode (16X9 aspect ratio)");
    }

    public void off() {
        System.out.println(this.description + " Projector off");
    }
}