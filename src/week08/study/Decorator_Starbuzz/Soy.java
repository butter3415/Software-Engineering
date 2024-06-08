package week08.study.Decorator_Starbuzz;

public class Soy extends CondimentDeco{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 100;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
