import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements /*MyObserver*/Observer, DisplayElement {
    private float temperture;

    private float humidity;

    //private MySubject weatherData;
    private Observable observable;

    public CurrentConditionDisplay(/*MySubject weatherData*/Observable observable) {
        /*this.weatherData = weatherData;
        this.weatherData.registerObserver(this);*/
        this.observable = observable;
        this.observable.addObserver(this);
    }
    
    public void update(/*float temperture, float humidity, float pressure*/Observable obs, Object arg) {
        /*this.temperture = temperture;
        this.humidity = humidity;
        this.display();*/

        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperture = weatherData.getTemperture();
            this.humidity = weatherData.getHumidity();
            this.display();
        }
    }

    public void display() {
        System.out.println("current conditions: " + temperture + "F degrees and " + humidity + "% humidity");
    }
}