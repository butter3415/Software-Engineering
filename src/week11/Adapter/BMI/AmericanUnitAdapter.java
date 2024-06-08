package week11.Adapter.BMI;

public class AmericanUnitAdapter implements Unit{
    private AmericanUnit americanUnit;

    public AmericanUnitAdapter(AmericanUnit americanUnit) {
        this.americanUnit = americanUnit;
    }

    @Override
    public double getLength() {
        return MeterConverter.poundToKilos(americanUnit.getFeet());
    }

    @Override
    public double getWeight() {
        return MeterConverter.feetToMeter(americanUnit.getPounds());
    }

    @Override
    public double getBmi() {
        return getWeight() / (getLength() * getLength());
    }
}
