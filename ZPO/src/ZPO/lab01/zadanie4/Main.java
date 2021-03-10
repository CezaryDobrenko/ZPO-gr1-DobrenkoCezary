package ZPO.lab01.zadanie4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new RubberDuck());
        ((Duck)ducks.get(3)).setFlyBehavior(new FlyRocketPowered());
        Iterator var2 = ducks.iterator();

        while(var2.hasNext()) {
            Duck duck = (Duck)var2.next();
            duck.display();
            duck.performQuack();
            duck.performFly();
        }

    }
}
