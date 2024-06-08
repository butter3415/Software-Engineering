package week11.Adapter.code_TG;

public class UnitImpl implements Unit{
    private double length;
    private double weight;

    public UnitImpl(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getBmi() {
        double heightInMeters = length / 100;
        return weight / (heightInMeters * heightInMeters);
    }
}
