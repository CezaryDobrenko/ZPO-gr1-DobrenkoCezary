package ZPO.lab06.zadanie1;

public class PocztaFabryka {
    public void przetwarzajPaczke(String name) {
        String parcel = przygotujPaczke(name);
        IDostarcz uslugaDostarczania = uslugaDostarczaniaPaczek();
        uslugaDostarczania.dostarcz(parcel);
    }

    protected IDostarcz uslugaDostarczaniaPaczek() {
        return new Poczta();
    }

    private String przygotujPaczke(String name) {
        System.out.println("Paczka: " + name + " została przygotowana!");
        return name;
    }
}
