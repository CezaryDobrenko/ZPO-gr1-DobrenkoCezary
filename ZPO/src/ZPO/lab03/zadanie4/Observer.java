package ZPO.lab03.zadanie4;

import java.util.ArrayList;

public class Observer {
    private ArrayList<iObserver> observers = new ArrayList<>();

    public void update() {
        for (iObserver o : this.observers) {
            o.update(this);
        }
    }

    public void update(Object o) {
        for (iObserver observer : this.observers) {
            observer.update(o);
        }
    }

    public void subscribe(iObserver o) {
        if (!this.observers.contains(o)) {
            this.observers.add(o);
        }
    }

    public void unsubscribe(iObserver o) {
        if (this.observers.contains(o)) {
            this.observers.remove(o);
        }
    }
}
