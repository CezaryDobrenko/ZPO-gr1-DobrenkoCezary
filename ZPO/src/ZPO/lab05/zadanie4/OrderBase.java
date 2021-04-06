package ZPO.lab05.zadanie4;

public class OrderBase extends OrderDecorator{
    double baseOrderValue;

    public OrderBase(double value) {
        super(null);
        this.baseOrderValue = value;
        System.out.println("Add order base");
    }

    @Override
    public String getDescription() {
        return "Base order";
    }

    @Override
    public double getCost() {
        return this.baseOrderValue;
    }
}
