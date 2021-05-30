package ZPO.lab11.zadanie3;

import java.util.*;

public class FailedThreeTimesAuthorizationState implements State {
    private Authorization autoryzacja;
    private Long czas = -1l;

    public FailedThreeTimesAuthorizationState(Authorization autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    public void checkAuthorization(String login, String haslo) {
        GregorianCalendar gc = new GregorianCalendar();
        if (czas == -1l) {
            czas = gc.getTime().getTime();
        }
        if ((gc.getTime().getTime() - czas) >= 30000) {
            autoryzacja.setStan(autoryzacja.getCheckAuthorizationState());
            autoryzacja.getStan().checkAuthorization(login, haslo);
            czas = -1l;
            return;
        }
        System.out.println("Podano trzy razy nieprawidłowy login lub hasło - możliwość logowania zablokowana na 30 sekund!");
    }
}