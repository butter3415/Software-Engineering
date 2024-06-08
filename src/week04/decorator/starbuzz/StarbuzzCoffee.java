package week04.decorator.starbuzz;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());

		Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));	// 가장 안쪽에는 콘크리트 클래스 -> 사람 본체가 있어야 속옷도 입고 옷도 입음
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
		// 아래와 동일한 코드


//		Beverage beverage2 = new DarkRoast();
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Whip(beverage2);
//		System.out.println(beverage2.getDescription()
//				+ " $" + beverage2.cost());


		// 커피 시킬때도 메뉴를 정하고 옵션을 추가한다
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
