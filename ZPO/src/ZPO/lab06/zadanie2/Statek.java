package ZPO.lab06.zadanie2;

public class Statek implements IDostarcz {
    @Override
    public void dostarcz(String ladunek) {
        System.out.println("Statek dostarcza ładunek: " + ladunek);
    }
}
