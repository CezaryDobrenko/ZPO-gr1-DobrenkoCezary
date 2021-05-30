package ZPO.lab11.zadanie3;

public class ValidAuthorizationState implements State {
    public ValidAuthorizationState(Authorization autoryzacja) {
    }
    public void checkAuthorization(String login, String haslo) {
        System.out.println("Zalogowany - witam!");
    }
}
