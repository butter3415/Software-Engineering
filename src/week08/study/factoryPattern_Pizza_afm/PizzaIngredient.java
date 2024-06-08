package week08.study.factoryPattern_Pizza_afm;

public interface PizzaIngredient {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
}
