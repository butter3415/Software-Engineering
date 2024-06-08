package week08.study.Decorator_Starbuzz;

public class Whip extends CondimentDeco{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
