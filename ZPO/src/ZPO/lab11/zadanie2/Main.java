package ZPO.lab11.zadanie2;

public class Main {
    public static void main(String[] args) {
        MoviePlayer moviePlayer = new MoviePlayer();
        UI ui = new UI(moviePlayer);
        ui.init();
    }
}
