package ZPO.lab06.zadanie2;

public abstract class BazowaFabryka {
    public void zaladujTowar(String name) {
        String parcel = przygotujZamowienie(name);
        IDostarcz uslugaDostarczania = sposobTransportu();
        uslugaDostarczania.dostarcz(parcel);
    }

    protected abstract IDostarcz sposobTransportu();

    private String przygotujZamowienie(String name) {
        System.out.println("Ladunek: " + name + " został załadowany!");
        return name;
    }
}
