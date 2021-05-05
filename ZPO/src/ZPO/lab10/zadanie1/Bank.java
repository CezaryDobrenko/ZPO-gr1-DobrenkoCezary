package ZPO.lab10.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Konto> Klienci = new ArrayList<Konto>();

    public void dodajKlienta(Konto klient){
        Klienci.add(klient);
    }

    public void usunKlienta(Konto klient){
        Klienci.remove(klient);
    }

    public void dokonajWplatyNaKontaKlientow(double wartosc){
        for(Konto client : Klienci){
            client.doOperation(new Wplata(client, wartosc));
        }
    }

    public void dokonajWyplatyNaKontaKlientow(double wartosc){
        for(Konto client : Klienci){
            client.doOperation(new Wyplata(client, wartosc));
        }
    }

    public void dokonajTransferuZKontKlientow(Konto to, double value){
        for(Konto client : Klienci){
            client.doOperation(new Transfer(client,to,value));
        }
    }

}
