package ZPO.lab10.zadanie2;

public class Transfer implements OperacjaBankowa {
    Konto zKonta;
    Konto naKonto;
    Double wartosc;

    public Transfer(Konto zKonta, Konto naKonto, Double wartosc){
        this.zKonta = zKonta;
        this.naKonto = naKonto;
        this.wartosc = wartosc;
    }

    public void wykonaj(){
        zKonta.wykonajWyplate(wartosc);
        naKonto.wykonajWplate(wartosc);
    }
}
