package week02;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑삑!");
    }
}
