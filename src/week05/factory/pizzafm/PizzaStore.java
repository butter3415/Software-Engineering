package week05.factory.pizzafm;

public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
	// ★
	// 피자스토어 상속받는 아이들 - 뉴욕 피자, 시카고 피자
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- " + pizza.getName() + " 만들기 ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
