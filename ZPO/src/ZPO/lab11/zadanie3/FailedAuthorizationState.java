package ZPO.lab11.zadanie3;

public class FailedAuthorizationState implements State {
    private Authorization autoryzacja;
    public FailedAuthorizationState(Authorization autoryzacja) {
        this.autoryzacja = autoryzacja;
    }
    public void checkAuthorization(String login, String haslo) {
        System.out.println("Niepoprawny login lub hasło");
        autoryzacja.setStan(autoryzacja.getCheckAuthorizationState());
    }
}