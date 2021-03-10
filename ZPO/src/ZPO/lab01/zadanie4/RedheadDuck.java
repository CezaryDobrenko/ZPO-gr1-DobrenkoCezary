package ZPO.lab01.zadanie4;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm Redhead duck");
    }
}