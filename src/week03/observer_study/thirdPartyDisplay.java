package week03.observer_study;

public class thirdPartyDisplay implements observer, displayElement{

    private weatherData weatherData;
    public thirdPartyDisplay(weatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("새로운 구독자 등장!");
        System.out.println();
    }
}
