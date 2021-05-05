package ZPO.lab10.zadanie2;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Konto acc1 = new Konto(3200);
        Konto acc2 = new Konto(1500);
        Konto acc3 = new Konto(3500);

        //Dodaj klientów do banku

        bank.dodajKlienta(acc1);
        bank.dodajKlienta(acc2);
        bank.dodajKlienta(acc3);

        //Usuń klientów z banku

        bank.usunKlienta(acc3);

        //Wpłata na konta klientów

        acc1.doOperation(new Wplata(acc1,500.00));
        acc2.doOperation(new Wplata(acc2,500.00));

        //Wypłata z kont klientów

        acc1.doOperation(new Wyplata(acc1,500.00));
        acc2.doOperation(new Wyplata(acc2,500.00));

        //Transfer środków z konta na konto
        acc1.doOperation(new Transfer(acc1, acc2, 500.00));

        //Kolejkowanie operacji i wykonywanie gdy użytkownik wyda polecenie
        acc1.addToOperations(new Wplata(acc1,500.00));
        acc1.addToOperations(new Wyplata(acc1,300.00));
        acc1.addToOperations(new Transfer(acc1, acc2, 200.00));
        acc1.doOperations();

        //Operacje wykonywane po stronie banku
        bank.dokonajWplatyNaKontaKlientow(50.0);
        bank.dokonajWyplatyNaKontaKlientow(50.0);
        bank.dokonajTransferuZKontKlientow(acc2, 30.0);

        //Wyślij dla kientów wiadomość
        bank.wyslijWiadomosc("test wiadomosci push");
        bank.wyslijWiadomosc("ęąźćż");

        //Wyświetl historie wysłanych wiadomości
        bank.wyswietlHistorieWiadomosci();
    }
}
