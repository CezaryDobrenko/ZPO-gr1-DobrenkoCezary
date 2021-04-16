package ZPO.lab06.zadanie3;

public class MebleArtDecoFactory implements IAbstractFactory {
    @Override
    public Fotel dodajFotel() {
        return new FotelArtDeco();
    }

    @Override
    public Sofa dodajSofe() {
        return new SofaArtDeco();
    }

    @Override
    public StolikKawowy dodajStolikKawowy() {
        return new StolikKawowyArtDeco();
    }
}
