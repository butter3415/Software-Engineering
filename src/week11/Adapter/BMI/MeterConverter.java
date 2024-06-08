package week11.Adapter.BMI;

public class MeterConverter {
    public static double feetToMeter(double feet){
        return feet * 0.3048;
    }

    public static double poundToKilos(double pounds){
        return pounds * 0.453592;
    }

}
