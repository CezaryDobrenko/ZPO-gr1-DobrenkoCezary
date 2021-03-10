package ZPO.lab01.zadanie4;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm Mallard duck");
    }
}
