package ZPO.lab01.zadanie5;

public class GermanTax implements Tax {
    public GermanTax() {
    }

    public double calculateTax(double value) {
        return value * 1.19D;
    }
}