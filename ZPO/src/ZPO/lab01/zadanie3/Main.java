package ZPO.lab01.zadanie3;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(new Szybki(), "Audi s50");
        Car car2 = new Car(new Wolny(), "Mały fiat");
        car1.showCarName();
        car1.printMaxSpeed();
        car2.showCarName();
        car2.printMaxSpeed();
        car2.changeCarState(new Zepsuty());
        car2.printMaxSpeed();
    }
}