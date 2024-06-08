package week08.study.strategyPattern_weapon;

public class Troll extends Character{
    public Troll() {
        weaponBehavior = new AxeBehavior();
        display();
    }

    @Override
    public void display() {
        System.out.println("으하하! 내가 누군지 알아!? 나는 위대하도다!!");
    }
}
