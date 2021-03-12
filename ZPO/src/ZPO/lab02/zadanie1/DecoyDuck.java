package ZPO.lab02.zadanie1;

public class DecoyDuck extends Duck {
    public DecoyDuck(String name) {
        super(name);
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm Decoy duck");
    }
}


