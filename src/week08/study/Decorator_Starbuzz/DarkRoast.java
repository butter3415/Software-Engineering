package week08.study.Decorator_Starbuzz;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 300;
    }
}
