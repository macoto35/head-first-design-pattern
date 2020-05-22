import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements /*MyObserver*/Observer, DisplayElement {
    private float maxTemp = 0.0f;

	private float minTemp = 200;
    
    private float tempSum = 0.0f;

    private float temperture;

    private int numReadings;

    //private MySubject weatherData;
    private Observable observable;

    public StatisticsDisplay(/*MySubject weatherData*/ Observable observable) {
        /*this.weatherData = weatherData;
        weatherData.registerObserver(this);*/
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void update(/*float temperture, float humidity, float pressure*/Observable obs, Object arg) {
        /*this.tempSum += temperture;
        this.numReadings++;

        if (temperture > this.maxTemp) {
            this.maxTemp = temperture;
        }

        if (temperture < this.minTemp) {
            this.minTemp = temperture;
        }
        
        this.display();*/

        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperture = weatherData.getTemperture();

            this.tempSum += temperture;
            this.numReadings++;

            if (temperture > this.maxTemp) {
                this.maxTemp = temperture;
            }

            if (temperture < this.minTemp) {
                this.minTemp = temperture;
            }

            this.display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}