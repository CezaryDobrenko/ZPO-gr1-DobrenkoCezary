package ZPO.lab02.zadanie3;

public class Knight extends Character {
    public Knight(){
        this.weapon = new Sword();
    }

    public void display(){
        System.out.println("I'm knight");
    }

    public void fight(){
        this.weapon.useWeapon();
    }
}
