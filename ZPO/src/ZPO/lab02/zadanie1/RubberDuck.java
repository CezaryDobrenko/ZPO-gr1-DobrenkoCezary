package ZPO.lab02.zadanie1;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm Rubber duck");
    }
}