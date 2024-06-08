package week08.study.factoryPattern_Pizza_fm;

public class NYpizzaStore extends pizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYCheese();
        } else if(item.equals("pepperoni")){
            return new NYPepperoni();
        } else if(item.equals("Clam")){
            return new NYClam();
        } else if(item.equals("Veggie")){
            return new NYVeggie();
        } else return null;
    }
}
