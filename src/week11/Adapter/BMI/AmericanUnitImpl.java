package week11.Adapter.BMI;

public class AmericanUnitImpl implements AmericanUnit{
    private double feet;
    private double pound;

    public AmericanUnitImpl(double feet, double pound) {
        this.feet = feet;
        this.pound = pound;
    }

    @Override
    public double getFeet() {
        return feet;
    }

    @Override
    public double getPounds() {
        return pound;
    }
}
