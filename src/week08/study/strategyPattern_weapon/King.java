package week08.study.strategyPattern_weapon;

public class King extends Character{

    public King() {
        weaponBehavior = new KnifeBehavior();
        display();
    }

    @Override
    public void display() {
        System.out.println("나는 이 나라의 왕이다! 다 내 앞에 조아리거라!");
    }
}
