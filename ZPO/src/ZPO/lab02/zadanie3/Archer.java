package ZPO.lab02.zadanie3;

public class Archer extends Character{
    public Archer(){
        this.weapon = new Bow();
    }

    public void display(){
        System.out.println("I'm archer");
    }

    public void fight(){
        this.weapon.useWeapon();
    }
}
