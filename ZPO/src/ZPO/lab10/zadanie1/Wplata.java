package ZPO.lab10.zadanie1;

public class Wplata implements OperacjaBankowa {
    Konto konto;
    Double wartosc;

    public Wplata(Konto konto, Double wartosc){
        this.konto = konto;
        this.wartosc = wartosc;
    }

    public void wykonaj(){
        konto.wykonajWplate(wartosc);
    }
}