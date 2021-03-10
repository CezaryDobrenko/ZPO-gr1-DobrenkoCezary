package ZPO.lab01.zadanie4;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm Decoy duck");
    }
}


