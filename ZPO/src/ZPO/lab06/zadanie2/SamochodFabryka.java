package ZPO.lab06.zadanie2;

public class SamochodFabryka extends BazowaFabryka {
    @Override
    protected IDostarcz sposobTransportu() {
        return new Samochod();
    }
}
