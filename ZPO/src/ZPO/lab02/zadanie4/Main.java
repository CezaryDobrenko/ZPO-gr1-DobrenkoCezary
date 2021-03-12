package ZPO.lab02.zadanie4;

public class Main {
    public static void main(String[] args) {
        RussianLanguage rl = new RussianLanguage();
        GermanLanguage gl = new GermanLanguage();
        PolishLanguage pl = new PolishLanguage();
        HighTierAccount hta = new HighTierAccount(rl, 5000);
        MiddleTierAccount mta = new MiddleTierAccount(gl, 3000);
        LowTierAccount lta = new LowTierAccount(pl, 1000);

        hta.sendNotification();
        mta.sendNotification();
        lta.sendNotification();

        lta.changeLanguage(rl);
        lta.sendNotification();
    }
}
