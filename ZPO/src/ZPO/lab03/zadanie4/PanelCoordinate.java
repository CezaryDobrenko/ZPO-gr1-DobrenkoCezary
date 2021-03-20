package ZPO.lab03.zadanie4;

public class PanelCoordinate {
    public int x;
    public int y;

    public PanelCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double DistanceFormula(PanelCoordinate c1, PanelCoordinate c2) {
        return Math.sqrt(Math.pow(c1.x - c2.x, 2) + Math.pow(c1.y - c2.y, 2));
    }

    public String toString() {
        return "Punkt: {" + this.x + " ; " + this.y + "}";
    }

}