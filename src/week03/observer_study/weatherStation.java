package week03.observer_study;

public class weatherStation {
    public static void main(String[] args) {
        weatherData weatherData = new weatherData();

        currentConditionsDisplay currentDisplay = new currentConditionsDisplay(weatherData);
        staticsDisplay staticsDisplay = new staticsDisplay(weatherData);
        forecastDisplay forecastDisplay = new forecastDisplay(weatherData);
        thirdPartyDisplay thirdPartyDisplay = new thirdPartyDisplay(weatherData);

        weatherData.setMeasurementsChanged(80, 65, 30.4f);
        weatherData.setMeasurementsChanged(90,40,60.7f);
        weatherData.setMeasurementsChanged(102,75,80.7f);

    }
}
