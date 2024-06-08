package week08.study.Decorator_Starbuzz;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();

        beverage1 = new Soy(new Milk(new Whip(new Whip(beverage1))));
        beverage1.order(beverage1);

        // Beverage beverage2 = new Decaf(new Milk(new Whip(new Mocha(beverage2))));
        Beverage beverage2 = new Milk(new Whip(new Mocha(new Decaf())));
        beverage2.order(beverage2);

    }
}
