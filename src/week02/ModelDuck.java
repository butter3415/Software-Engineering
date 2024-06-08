package week02;

public class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 기계오리입니다!");
    }
}
