package week08.study.Decorator_Starbuzz;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 500;
    }
}
