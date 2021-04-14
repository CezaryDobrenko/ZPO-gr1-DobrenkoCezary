package ZPO.lab06.zadanie2;

public class Samolot implements IDostarcz {
    @Override
    public void dostarcz(String ladunek) {
        System.out.println("Samolot dostarcza ładunek: " + ladunek);
    }
}
