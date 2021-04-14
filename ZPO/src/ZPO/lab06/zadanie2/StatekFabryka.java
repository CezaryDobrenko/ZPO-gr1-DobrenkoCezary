package ZPO.lab06.zadanie2;

public class StatekFabryka extends BazowaFabryka {
    @Override
    protected IDostarcz sposobTransportu() {
        return new Statek();
    }
}
