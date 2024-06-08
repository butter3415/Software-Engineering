package week08.study.ObserverPattern;

public class observerSim {
    public static void main(String[] args) {
        weatherData weatherData = new weatherData();

        currentCondition currentCondition = new currentCondition(weatherData);
        statistics statistics = new statistics(weatherData);
        forecast forecast = new forecast(weatherData);

        weatherData.setMeasurements(26, 85, 65);





    }
}
