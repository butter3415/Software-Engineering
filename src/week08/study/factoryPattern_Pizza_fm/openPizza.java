package week08.study.factoryPattern_Pizza_fm;

public class openPizza {
    public static void main(String[] args) {
        pizzaStore NYpizza = new NYpizzaStore();
        pizzaStore LApizza = new LApizzaStore();

        Pizza pizza;
        pizza = NYpizza.orderPizza("cheese");
        pizza = NYpizza.orderPizza("pepperoni");
        pizza = NYpizza.orderPizza("Clam");
        pizza = NYpizza.orderPizza("Veggie");

        pizza = LApizza.orderPizza("cheese");
        pizza = LApizza.orderPizza("pepperoni");
        pizza = LApizza.orderPizza("Clam");
        pizza = LApizza.orderPizza("Veggie");
    }
}
