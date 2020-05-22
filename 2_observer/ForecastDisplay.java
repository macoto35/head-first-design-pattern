import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements /*MyObserver*/Observer, DisplayElement {
    private float currentPressure = 29.92f;

    private float lastPressure;

    //private MySubject weatherData;
    private Observable observable;

    public ForecastDisplay(/*MySubject weatherData*/ Observable observable) {
       /*this.weatherData = weatherData;
        this.weatherData.registerObserver(this);*/
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void update(/*float temperture, float humidity, float pressure*/Observable obs, Object arg) {
        /*this.lastPressure = currentPressure;
        this.currentPressure = pressure;
        this.display();*/

        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            this.display();
        }
    }

    public void display() {
        System.out.print("Forecast: ");

		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
    }
}