package ZPO.lab05.zadanie4;

public class Discount extends OrderDecorator {
    public Discount(OrderItem newItem) {
        super(newItem);
        System.out.println("Adding Discount");
    }

    public String getDescription(){
        return item.getDescription() + ", Discount";
    }

    public double getCost(){
        return item.getCost() - 10.00;
    }

}

