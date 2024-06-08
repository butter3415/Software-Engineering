package week08.study.strategyPattern_weapon;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("나의 칼을 받아라! 이얏!");
    }
}
