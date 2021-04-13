package ZPO.lab06.zadanie1;

public class AwizoFabryka extends PocztaFabryka {
    @Override
    protected IDostarcz uslugaDostarczaniaPaczek() {
        return new Awizo();
    }
}