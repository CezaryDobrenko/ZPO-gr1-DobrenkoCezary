package ZPO.lab02.zadanie3;

public class Gunner extends Character{
    public Gunner(){
        this.weapon = new Cannon();
    }

    public void display(){
        System.out.println("I'm heavy weapon guy and this is my weapon ~Heavy");
    }

    public void fight(){
        this.weapon.useWeapon();
    }
}
