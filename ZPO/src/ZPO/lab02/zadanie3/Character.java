package ZPO.lab02.zadanie3;

public abstract class Character {
    WeaponBehavior weapon;

    abstract void display();
    abstract void fight();

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }

}
