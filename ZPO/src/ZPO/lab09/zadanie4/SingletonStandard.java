package ZPO.lab09.zadanie4;

public class SingletonStandard
{
    // publiczny obiekt inicjalizowany gdy klasa jest załadowana
    private static final SingletonStandard instance = new SingletonStandard();

    private SingletonStandard()
    {
        // prywatny konsktuktor
    }

    public static SingletonStandard getInstance(){
        return instance;
    }
}