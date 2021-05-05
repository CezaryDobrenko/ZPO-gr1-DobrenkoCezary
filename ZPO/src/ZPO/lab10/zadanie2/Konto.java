package ZPO.lab10.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Konto implements Obserwator{
    private double stanKonta = 0.0;
    private List<OperacjaBankowa> operacje = new ArrayList<OperacjaBankowa>();

    public Konto(double stanKonta){
        this.stanKonta = stanKonta;
    }

    public void wykonajWplate(Double wartosc){
        this.stanKonta += wartosc;
    }

    public void wykonajWyplate(Double wartosc){
        this.stanKonta += wartosc;
    }

    public void doOperation(OperacjaBankowa o){
        o.wykonaj();
    }

    public void addToOperations(OperacjaBankowa o) {
        operacje.add(o);
    }

    public void doOperations(){
        for (OperacjaBankowa operation : operacje) {
            operation.wykonaj();
        }
        operacje.clear();
    }

    @Override
    public void update(String wiadomosc) {
        System.out.println("Otrzymałem wiadomośc od banku:");
        System.out.println(wiadomosc);
    }
}
