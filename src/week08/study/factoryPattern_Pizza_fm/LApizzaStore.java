package week08.study.factoryPattern_Pizza_fm;

public class LApizzaStore extends pizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new LACheese();
        } else if(item.equals("pepperoni")){
            return new LAPepperoni();
        } else if(item.equals("Clam")){
            return new LAClam();
        } else if(item.equals("Veggie")){
            return new LAVeggie();
        } else return null;
    }
}
