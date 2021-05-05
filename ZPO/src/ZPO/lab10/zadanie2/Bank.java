package ZPO.lab10.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Wiadomosc {
    private List<Konto> Klienci = new ArrayList<Konto>();
    private ArrayList<String> Wiadomosci = new ArrayList<String>();

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

    public void wyslijWiadomosc(String wiadomosc) {
        Wiadomosci.add(wiadomosc);
        PowiadomKlientow();
    }

    public void wyswietlHistorieWiadomosci(){
        System.out.println("=====Historia wiadomosci:=====");
        for(String wiadomosc: Wiadomosci){
            System.out.println(wiadomosc);
        }
    }

    @Override
    public void dodajKlienta(Konto klient){
        Klienci.add(klient);
    }

    @Override
    public void usunKlienta(Konto klient){
        Klienci.remove(klient);
    }

    @Override
    public void PowiadomKlientow(){
        for(Konto klient : Klienci){
            int last_message = Wiadomosci.size()-1;
            klient.update(Wiadomosci.get(last_message));
        }
    }


}
