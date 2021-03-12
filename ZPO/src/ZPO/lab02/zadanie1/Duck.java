package ZPO.lab02.zadanie1;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;

    public Duck(String name){
        this.name = name;
    }

    abstract void display();

    public String getName(){
        return this.name;
    }

    public void printName(){
        System.out.println("My name is: " + this.name);
    }

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
