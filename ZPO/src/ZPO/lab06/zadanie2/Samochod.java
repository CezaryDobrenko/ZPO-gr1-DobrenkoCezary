package ZPO.lab06.zadanie2;

public class Samochod implements IDostarcz {
    @Override
    public void dostarcz(String ladunek) {
        System.out.println("Samochód dostarcza ładunek: " + ladunek);
    }
}
