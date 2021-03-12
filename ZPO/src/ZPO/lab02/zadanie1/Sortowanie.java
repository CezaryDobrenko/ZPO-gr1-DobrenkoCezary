package ZPO.lab02.zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortowanie {
    SortingBehavior sorting;

    public Sortowanie(SortingBehavior sort){
        this.sorting = sort;
    }

    public void setSortingAlgorithm(SortingBehavior sort){
        this.sorting = sort;
    }

    public ArrayList<Duck> sort(ArrayList<Duck> arrayList){
        return this.sorting.Sort(arrayList);
    }

    public ArrayList<Duck> shuffleRandom(ArrayList<Duck> arrayList){
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public void print(ArrayList<Duck> arrayList){
        for(Duck duck : arrayList){
            duck.printName();
        }
    }

    public Duck[] sort(Duck[] array){
        return this.sorting.Sort(array);
    }

    public Duck[] shuffleRandom(Duck[] array){
        List<Duck> arrayList = Arrays.asList(array);
        Collections.shuffle(arrayList);
        return arrayList.toArray(array);
    }

    public void print(Duck[] array){
        for(Duck duck : array){
            duck.printName();
        }
    }

}
