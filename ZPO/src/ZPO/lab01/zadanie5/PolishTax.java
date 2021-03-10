package ZPO.lab01.zadanie5;

public class PolishTax implements Tax {
    public PolishTax() {
    }

    public double calculateTax(double value) {
        return value * 1.23D;
    }
}