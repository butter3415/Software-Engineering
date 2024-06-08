package week08.study.strategyPattern_weapon;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("으하하! 피할 수 있으면 피해보시지~!!! 내 도끼는 못 피할걸!?@!?");
    }
}
