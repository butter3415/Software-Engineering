package week08.study.Decorator_Starbuzz;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 400;
    }
}
