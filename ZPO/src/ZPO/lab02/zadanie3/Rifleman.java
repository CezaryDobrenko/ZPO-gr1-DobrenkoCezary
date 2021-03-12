package ZPO.lab02.zadanie3;

public class Rifleman extends Character{
    public Rifleman(){
        this.weapon = new Rifle();
    }

    public void display(){
        System.out.println("I'm Rifleman");
    }

    public void fight(){
        this.weapon.useWeapon();
    }
}
