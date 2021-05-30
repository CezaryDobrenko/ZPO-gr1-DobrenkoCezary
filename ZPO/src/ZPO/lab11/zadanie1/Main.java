package ZPO.lab11.zadanie1;

public class Main {
    public static void main(String[] args) {
        DrawPanel drawPanel = new DrawPanel();
        UI ui = new UI(drawPanel);
        ui.init();
    }
}
