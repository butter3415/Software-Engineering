package week05.factory.pizzas;

import java.util.*;

// 피자 추상 클래스
// 치즈피자는 구체 클래스, 피자는 추상 클래스
abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	// 어레이리스트 -> 검색에 용이
	// 링크드리스트 -> 삽입, 삭제 용이

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}


}

// 오구쌀피자
// 노모어피자 -> 먹어보기 수제 피자 -> 1인용피자
// 피자스쿨

