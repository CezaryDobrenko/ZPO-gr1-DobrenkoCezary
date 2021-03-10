package ZPO.lab01.zadanie6;

public class Main {

    public static void main(String[] args) {
        SpedzanieWolnegoCzasu silownia = new Silownia();
        NaprawaSamochodow naprawaSamochodow = new NaprawaSamochodow();
        Samochod samochod = new Samochod();
        String zawod = "ninja";
        Pracownik p = new Pracownik(zawod, samochod, naprawaSamochodow, silownia);
        p.pracowac.pracuj();
        p.spedzanieWolnegoCzasu.spedzajWolnyCzas();
        p.dojezdzac.dojezdzaj();
        p.printZawod();
    }
}