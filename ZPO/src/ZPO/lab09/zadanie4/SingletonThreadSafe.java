package ZPO.lab09.zadanie4;

public class SingletonThreadSafe
{
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe()
    {
        // prywatny konsktuktor
    }

    //zsynchronizowana metoda getIsntance do kontroli współbieżnego dostępu
    synchronized public static SingletonThreadSafe getInstance()
    {
        if (instance == null)
        {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}