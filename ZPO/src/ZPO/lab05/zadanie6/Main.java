package ZPO.lab05.zadanie6;

public class Main {
    public static void main(String[] args) {
        SterownikDecorator linia0 = new punktPoczatkowy(0, 0, 100);
        SterownikDecorator linia1 = new rysujLinie(linia0, 5, 5);
        linia1.ustalPozycje(5,5);
        SterownikDecorator linia2 = new rysujLinie(linia1, 55, 55);
        linia2.ustalPozycje(2,2);
        SterownikDecorator ploter = new rysujLinie(new rysujLinie(new rysujLinie(new rysujLinie(linia2, 1, 1), 15, 15), 35, 35), 25, 25);

        Klient manager = new Klient(ploter);

        manager.zaladujTusz(55);
        manager.pobierzTusz(5);

        System.out.println("---------Wykonane Akcje---------");
        System.out.println(manager.historiaAkcji());
        System.out.println("--------------------------------");
        System.out.println("Tusz: " + manager.sprawdzIlosc());

    }
}
