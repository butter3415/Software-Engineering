package week08.study.Decorator_Starbuzz;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 300;
    }
}
