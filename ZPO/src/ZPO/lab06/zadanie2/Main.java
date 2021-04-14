package ZPO.lab06.zadanie2;

public class Main {
    public static void main(String[] args) {
        StatekFabryka statek = new StatekFabryka();
        SamolotFabryka samolot = new SamolotFabryka();
        SamochodFabryka samochod = new SamochodFabryka();

        statek.zaladujTowar("walizka");
        samolot.zaladujTowar("kontener");
        samochod.zaladujTowar("zakupy");
    }
}
