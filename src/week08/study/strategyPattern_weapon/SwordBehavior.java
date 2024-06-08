package week08.study.strategyPattern_weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("그대가 나와 싸운다면 그대는 목숨을 잃을 것이오. 각오하시오!");
    }
}
