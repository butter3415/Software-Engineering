package week03.observer_study;

public class currentConditionsDisplay implements observer, displayElement{

    private float temperature;
    private float humidity;
    private weatherData weatherData;    // weatherData 타입 필드 선언

    public currentConditionsDisplay(weatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push 방법 update
//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity +  "%");
    }
}
