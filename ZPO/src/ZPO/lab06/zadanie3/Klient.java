package ZPO.lab06.zadanie3;

public class Klient {
    private Fotel fotel;
    private Sofa sofa;
    private StolikKawowy stolikKawowy;

    public Klient(IAbstractFactory factory) {
        fotel = factory.dodajFotel();
        sofa = factory.dodajSofe();
        stolikKawowy = factory.dodajStolikKawowy();
    }

    public void zmienStylMebli(IAbstractFactory factory) {
        fotel = factory.dodajFotel();
        sofa = factory.dodajSofe();
        stolikKawowy = factory.dodajStolikKawowy();
    }

    public void wyswietlMeble() {
        System.out.println("\nWybrałeś meble: ");
        fotel.wyswietl();
        sofa.wyswietl();
        stolikKawowy.wyswietl();
    }

}
