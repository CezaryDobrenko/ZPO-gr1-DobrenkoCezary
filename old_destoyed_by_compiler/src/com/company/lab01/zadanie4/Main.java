package com.company.lab01.zadanie4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new RubberDuck());

        //change fly behavior to rubber duck
        ducks.get(3).setFlyBehavior(new FlyRocketPowered());

        for (Duck duck : ducks) {
            duck.display();
            duck.performQuack();
            duck.performFly();
        }

    }

}
