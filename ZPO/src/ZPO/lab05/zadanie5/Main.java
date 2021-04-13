package ZPO.lab05.zadanie5;

public class Main {
    public static void main(String[] args) {

        SterownikDecorator ploter = new punktPoczatkowy(0, 0, 100);
        SterownikDecorator linia1 = new rysujLinie(ploter, 5, 5);
        SterownikDecorator linia2 = new rysujLinie(linia1, 55, 55);
        SterownikDecorator linia3 = new rysujLinie(linia2, 1, 1);
        SterownikDecorator linia4 = new rysujLinie(linia3, 15, 15);
        SterownikDecorator linia5 = new rysujLinie(linia4, 35, 35);
        SterownikDecorator linia6 = new rysujLinie(linia5, 25, 25);

        linia3.ustalPozycje(5,5);
        linia5.ustalPozycje(2,2);

        System.out.println("---------Wykonane Akcje---------");
        System.out.println(linia6.historiaAkcji());
        System.out.println("--------------------------------");
        System.out.println("Tusz: " + linia6.getTusz());

    }
}
