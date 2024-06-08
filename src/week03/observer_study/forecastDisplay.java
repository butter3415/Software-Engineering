package week03.observer_study;

public class forecastDisplay implements observer, displayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private weatherData weatherData;

    public forecastDisplay(weatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push 방법
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        lastPressure = currentPressure;
//        currentPressure = pressure;
//        display();
//    }

    // pull 방법
    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.print("기상 예보 : ");
        if(currentPressure > lastPressure) {
            System.out.println("날씨가 좋아지고 있습니다!");
        } else if (currentPressure == lastPressure){
            System.out.println("지금과 비슷할 것 같습니다.");
        } else if (currentPressure < lastPressure){
            System.out.println("쌀쌀하며, 비가 올 것 같습니다.");
        }
        // System.out.println();
        
    }
}
