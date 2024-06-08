package week03.observer_study;

public class staticsDisplay implements observer, displayElement{

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private  float tempSum = 0.0f;
    private int numReadings;
    private weatherData weatherData;

    public staticsDisplay(weatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // push 방법 update
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        tempSum += temp;
//        numReadings++;
//
//        if (temp > maxTemp) maxTemp = temp;
//
//        if (temp < minTemp) minTemp = temp;
//
//        display();
//    }

    // pull 방법 update

    @Override
    public void update() {
        float temp = weatherData.getTemperature();
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) maxTemp = temp;

        if (temp < minTemp) minTemp = temp;

        display();
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + (tempSum/numReadings) + "/" + maxTemp + "/" + minTemp );
    }
}
