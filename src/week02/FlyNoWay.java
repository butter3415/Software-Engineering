package week02;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("저는 날지 못해요");
    }
}
