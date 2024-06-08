package week08.study.ObserverPattern;
// 기상예보
public class forecast implements observer, displayElement{

    private float temp, humidity, pressure;
    private weatherData weatherData;
    public forecast(weatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerOb(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("예측 자료를 나타내야 하지만 시간이 늦었으므로 생략 ^^");
    }
}
