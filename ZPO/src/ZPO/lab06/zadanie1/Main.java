package ZPO.lab06.zadanie1;

public class Main {
    public static void main(String[] args) {
        KurierFabryka kurier = new KurierFabryka();
        AwizoFabryka awizo = new AwizoFabryka();
        PocztaFabryka poczta = new PocztaFabryka();

        poczta.przetwarzajPaczke("paczka 1");
        kurier.przetwarzajPaczke("paczka 2");
        awizo.przetwarzajPaczke("paczka 3");
    }
}
