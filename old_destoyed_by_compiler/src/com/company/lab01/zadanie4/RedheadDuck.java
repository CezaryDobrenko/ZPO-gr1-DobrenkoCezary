package com.company.lab01.zadanie4;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm Redhead duck");
    }

}
