package homeTheater;

public class Amplifier {
    private String description;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(this.description + " Amplifier on");
    }
    
    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println(this.description + " Amplifier setting DVD player to " + dvdPlayer);
    }
    
    public void setSurroundSound() {
        System.out.println(this.description + " Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }
    
    public void setVolumn(int volumn) {
        System.out.println(this.description + " Amplifier setting volume to " + volumn);
    }

    public void off() {
        System.out.println(this.description + " Amplifier off");
    }
}