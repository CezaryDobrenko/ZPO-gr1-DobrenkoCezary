package ZPO.lab01.zadanie4;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("If we talking only about earth then every duck float");
    }
}
