package week02;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        mallard.display();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();


    }
}
