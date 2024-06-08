package week04.decorator.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}

// 손자 - 아부지 - 할아부지 ! 아부지, 할아부지는 추상이라 객체 못 만듦
