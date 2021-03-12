package ZPO.lab02.zadanie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Duck[] ducksArray = new Duck[4];
        ducksArray[0] = new MallardDuck("gamma");
        ducksArray[1] = new RedheadDuck("alfa");
        ducksArray[2] = new DecoyDuck("beta");
        ducksArray[3] = new RubberDuck("delta");
        ArrayList<Duck> ducksList = new ArrayList();
        ducksList.add(new MallardDuck("gamma"));
        ducksList.add(new RedheadDuck("alfa"));
        ducksList.add(new DecoyDuck("beta"));
        ducksList.add(new RubberDuck("delta"));

        ((Duck)ducksList.get(3)).setFlyBehavior(new FlyRocketPowered());

        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        Sortowanie sorting = new Sortowanie(bubble);

        //Sortowania Tablicy bąbelkowo
        sorting.sort(ducksArray);
        sorting.print(ducksArray);

        //Sortowania Listy bąbelkowo
        sorting.sort(ducksList);
        sorting.print(ducksList);

        sorting.shuffleRandom(ducksArray);
        sorting.shuffleRandom(ducksList);

        sorting.setSortingAlgorithm(selection);

        //Sortowania Tablicy przez wybieranie
        sorting.sort(ducksArray);
        sorting.print(ducksArray);

        //Sortowania Listy przez wybieranie
        sorting.sort(ducksList);
        sorting.print(ducksList);

    }
}
