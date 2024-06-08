package week04.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;	// has a 관계
	public abstract String getDescription();
}
