package ZPO.lab03.zadanie3;

import java.util.ArrayList;

public class Program  implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int value;

    public void addValue(int value){
        this.value = value;
        notifyObserver();
    }

    public void selectObserver(int value){
        if(value == 1) register(new GreaterThanZero());
        if(value == 2) register(new EqualsThreeNumber());
        if(value == 3) register(new EvenNumber());
    }

    //observers
    public void register(Observer newObserver){
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver){
        observers.remove(deleteObserver);
    }

    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(value);
        }
    }

}
