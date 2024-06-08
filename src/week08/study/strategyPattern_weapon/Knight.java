package week08.study.strategyPattern_weapon;

public class Knight extends Character{

    public Knight() {
        weaponBehavior = new SwordBehavior();
        display();
    }

    @Override
    public void display() {
        System.out.println("아가씨, 제가 지켜드리지요. 제게 꼭 붙어있으세요.");
    }
}
