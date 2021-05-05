package ZPO.lab10.zadanie2;

public class Wyplata implements OperacjaBankowa {
    Konto konto;
    Double wartosc;

    public Wyplata(Konto konto, Double wartosc){
        this.konto = konto;
        this.wartosc = wartosc;
    }

    public void wykonaj(){
        konto.wykonajWyplate(wartosc);
    }
}