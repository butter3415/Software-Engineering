package week02;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
        display();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다!");
    }

}
