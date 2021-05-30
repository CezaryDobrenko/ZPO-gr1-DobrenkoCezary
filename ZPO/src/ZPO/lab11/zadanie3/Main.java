package ZPO.lab11.zadanie3;

public class Main {
    public static void main(String[] args) {
        Authorization auth = new Authorization();
        auth.checkAuthorization("login", "password");
        System.out.println(auth.getStan());
    }
}
