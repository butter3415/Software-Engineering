package week08.study.ObserverPattern;
// 통계자료
public class statistics implements observer, displayElement{
    private float temp, humidity;
    private weatherData weatherData;

    public statistics(weatherData weatherData) {
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
        System.out.println("통계 자료를 나타내야 하지만 귀찮으므로 생략^^");

    }
}
