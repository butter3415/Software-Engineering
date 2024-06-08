package week08.study.strategyPattern_weapon;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void display();

    public void fight(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
