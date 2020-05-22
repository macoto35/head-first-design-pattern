import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherData /*implements MySubject*/ extends Observable {
    // private ArrayList<MyObserver> observers;
    
    private float temperture;

    private float humidity;

    private float pressure;

    public WeatherData() {
        // this.observers = new ArrayList<MyObserver>();
    }

    /*public void registerObserver (MyObserver o) {
        this.observers.add(o);
    } 
    
    public void removeObserver (MyObserver o) {
        this.observers.remove(o);
    }

    public void notifyObserver() {
        for (MyObserver o: this.observers) {
            o.update(this.temperture, this.humidity, this.pressure);
        }
    }*/

    public void measurementsChanged() {
        //this.notifyObserver();

        setChanged();
        notifyObservers();
    }

    public void setMeasurements (float temperture, float humidity, float pressure) {
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure;

        this.measurementsChanged();
    }

    public float getTemperture() {
        return this.temperture;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

}