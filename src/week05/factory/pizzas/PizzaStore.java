package week05.factory.pizzas;

public class PizzaStore {
	SimplePizzaFactory factory;
	// has a 관계, aggregation
	// 
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		// 변하지 않는 부분
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
