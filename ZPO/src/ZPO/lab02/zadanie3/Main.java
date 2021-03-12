package ZPO.lab02.zadanie3;

public class Main {
    public static void main(String[] args) {
        Rifleman rifleman = new Rifleman();
        Knight knight = new Knight();
        Archer archer = new Archer();
        Gunner gunner = new Gunner();

        rifleman.display();
        rifleman.fight();
        archer.display();
        archer.fight();
        knight.display();
        knight.fight();
        rifleman.display();
        gunner.fight();

        knight.setWeapon(new Bow());
        knight.display();
        knight.fight();
    }
}
