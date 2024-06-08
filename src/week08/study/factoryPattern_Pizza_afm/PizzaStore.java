package week08.study.factoryPattern_Pizza_afm;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String item);

    public Pizza orderPizza(String item){
        Pizza pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
