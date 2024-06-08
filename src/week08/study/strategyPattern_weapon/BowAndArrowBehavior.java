package week08.study.strategyPattern_weapon;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("사랑의 화살은 아니지만 받아라 내 화살!");
    }
}
