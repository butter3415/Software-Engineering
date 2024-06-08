package week08.study.strategyPattern_weapon;

public class weaponSim {
    public static void main(String[] args) {
        Character character1 = new King();

        character1.fight();
        character1.setWeaponBehavior(new SwordBehavior());
        character1.fight();

        Character character2 = new Queen();
        character2.fight();
    }
}
