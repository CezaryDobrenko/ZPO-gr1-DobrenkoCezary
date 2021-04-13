package ZPO.lab06.zadanie1;

public class KurierFabryka extends PocztaFabryka {
    @Override
    protected IDostarcz uslugaDostarczaniaPaczek() {
        return new Kurier();
    }
}
