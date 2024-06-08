package week08.study.Decorator_Starbuzz;

public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void order(Beverage beverage){
        System.out.println("주문하신 음료는 " + getDescription() +"이며, 금액은 "+ cost() +"원입니다~!");
    }
}
