import homeTheater.Amplifier;
import homeTheater.CdPlayer;
import homeTheater.DvdPlayer;
import homeTheater.PopcornPopper;
import homeTheater.Projector;
import homeTheater.Screen;
import homeTheater.TheaterLights;
import homeTheater.Tuner;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        String description = "Top-O-Line";

        Amplifier amp = new Amplifier(description);
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer(description);
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector(description);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}