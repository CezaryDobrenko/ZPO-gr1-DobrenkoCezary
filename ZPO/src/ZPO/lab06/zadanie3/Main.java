package ZPO.lab06.zadanie3;

public class Main {

    public static void main(String[] args) {
        IAbstractFactory mobleWiktorianskie = new MebleWiktorianskieFactory();
        IAbstractFactory mebleNowoczesne = new MebleNowoczesneFactory();
        IAbstractFactory mebleArtDeco = new MebleArtDecoFactory();

        Klient klient = new Klient(mobleWiktorianskie);
        klient.wyswietlMeble();

        klient.zmienStylMebli(mebleArtDeco);
        klient.wyswietlMeble();

        klient.zmienStylMebli(mebleNowoczesne);
        klient.wyswietlMeble();
    }
}
