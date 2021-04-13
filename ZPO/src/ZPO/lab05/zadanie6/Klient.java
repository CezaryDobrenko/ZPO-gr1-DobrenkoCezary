package ZPO.lab05.zadanie6;

public class Klient implements IManagerTuszu{
    SterownikDecorator ploter;

    public Klient(SterownikDecorator ploter){
        this.ploter = ploter;
    }

    @Override
    public void zaladujTusz(int ilosc) {
        this.ploter.zasobnikTuszu += ilosc;
    }

    @Override
    public void pobierzTusz(int ilosc) {
        this.ploter.zasobnikTuszu -= ilosc;
    }

    @Override
    public int sprawdzIlosc() {
        return this.ploter.sprawdzIlosc();
    }

    public String  historiaAkcji() {
        return this.ploter.historiaAkcji();
    }
}
