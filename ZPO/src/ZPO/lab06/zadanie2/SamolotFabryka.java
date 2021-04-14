package ZPO.lab06.zadanie2;

public class SamolotFabryka extends BazowaFabryka {
    @Override
    protected IDostarcz sposobTransportu() {
        return new Samolot();
    }
}