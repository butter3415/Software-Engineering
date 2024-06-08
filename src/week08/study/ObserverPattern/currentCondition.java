package week08.study.ObserverPattern;
// 현재 상태
public class currentCondition implements observer, displayElement{

    private float temp;
    private float humidity;
    private weatherData weatherData;

    public currentCondition(weatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerOb(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태라구요~");
    }

}
