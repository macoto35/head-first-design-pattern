package homeTheater;

public class DvdPlayer {
    private String description;
    private String movie;

    public DvdPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(this.description + " DVD Player on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(this.description + " DVD Player playing \"" + this.movie + "\"");
    }

    public String toString() {
        return this.description + "DVD Player";
    }

    public void stop() {
        System.out.println(this.description + " DVD Player stopped \"" + this.movie + "\"");
    }

    public void eject() {
        System.out.println(this.description + " DVD Player eject");
    }

    public void off() {
        System.out.println(this.description + " DVD Player off");
    }
}