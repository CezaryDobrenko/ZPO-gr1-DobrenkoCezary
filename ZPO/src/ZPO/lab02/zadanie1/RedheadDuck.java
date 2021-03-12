package ZPO.lab02.zadanie1;

public class RedheadDuck extends Duck {
    public RedheadDuck(String name) {
        super(name);
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm Redhead duck");
    }
}