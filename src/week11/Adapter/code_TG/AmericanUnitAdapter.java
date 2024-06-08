package week11.Adapter.code_TG;

public class AmericanUnitAdapter implements Unit{
    private AmericanUnit americanUnit;

    public AmericanUnitAdapter(AmericanUnit americanUnit) {
        this.americanUnit = americanUnit;
    }

    @Override
    public double getLength() {
        return MeterConverter.feetToMeter(americanUnit.getFeet());
    }

    @Override
    public double getWeight() {
        return MeterConverter.poundToKilos(americanUnit.getPounds());
    }

    @Override
    public double getBmi() {
        //        double heightInMeters = length / 100;
        //        return weight / (heightInMeters * heightInMeters);

        return getWeight() / (getLength() * getLength());
    }
}
