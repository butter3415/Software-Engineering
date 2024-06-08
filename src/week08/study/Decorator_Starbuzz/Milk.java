package week08.study.Decorator_Starbuzz;

public class Milk extends CondimentDeco{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 200;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Milk";
    }
}
