package week11.Adapter.code_TG;

public class AmericanUnitImpl implements AmericanUnit{
    private double feet;
    private double pounds;

    public AmericanUnitImpl(double feet, double pounds) {
        this.feet = feet;
        this.pounds = pounds;
    }

    @Override
    public double getFeet() {
        return feet;
    }

    @Override
    public double getPounds() {
        return pounds;
    }
}
