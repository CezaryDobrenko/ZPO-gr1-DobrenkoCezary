package ZPO.lab01.zadanie5;

public class GreatBritainTax implements Tax {
    public GreatBritainTax() {
    }

    public double calculateTax(double value) {
        return value * 1.2D;
    }
}

