package ZPO.lab01.zadanie4;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm Rubber duck");
    }
}