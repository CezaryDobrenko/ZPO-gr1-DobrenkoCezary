package ZPO.lab03.zadanie5;

import java.util.ArrayList;

public class Stock implements Subject{
    private ArrayList<Observer> observers;
    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Double> Values  = new ArrayList<Double>();

    public Stock(){
        observers = new ArrayList<Observer>();
    }

    //companies
    public void addCompany(String name, double value) {
        this.Companies.add(name);
        this.Values.add(value);
        notifyObserver();
    }

    public void removeCompany(String name) {
        int index = Companies.indexOf(name);
        Companies.remove(index);
        Values.remove(index);
        notifyObserver();
    }

    public void changeCompanyValue(String name, double value){
        int index = Companies.indexOf(name);
        Values.set(index,value);
        notifyObserver();
    }

    //observers
    @Override
    public void register(Observer newObserver){
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver){
        observers.remove(deleteObserver);
    }

    @Override
    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(Companies, Values);
        }
    }

}
