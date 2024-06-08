package week08.study.strategyPattern_weapon;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
        display();
    }

    @Override
    public void display() {
        System.out.println("나는 그대들의 어머니. 내가 당신들을 보살피겠어요.");
    }
}
