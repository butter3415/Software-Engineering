package week03.observer_study;

import java.util.ArrayList;
import java.util.List;

public class weatherData implements subject{
    private List<observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public weatherData() {
        observers = new ArrayList<observer>();
    }

    @Override   // subject 임플리먼트해서 꼭 오버라이드 해야 함
    public void registerObserver(observer o) {
        observers.add(o);
    }

    @Override   // subject 임플리먼트해서 꼭 오버라이드 해야 함
    public void removeObserver(observer o) {
        observers.remove(o);
    }

    // ★ 중요 - 모든 옵저버에게 상태 변화 알려주는 부분, update() 메소드가 있는 객체들 => 상태 변화 알려줄 수 있음
    @Override   // subject 임플리먼트해서 꼭 오버라이드 해야 함
    public void notifyobservers() {
        for(observer observer : observers){
            // observer.update(temperature, humidity, pressure);    push 방법
            observer.update(); // pull 방법
        }
    }
     public void measurementsChanged(){
          notifyobservers();
     }

     public void setMeasurementsChanged(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
     }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
