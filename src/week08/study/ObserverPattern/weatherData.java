package week08.study.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class weatherData implements subject{
    private List<observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public weatherData() {
        observerList = new ArrayList<observer>();
    }

    @Override
    public void registerOb(observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeOb(observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyOb() {
        for (observer o : observerList){
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyOb();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
