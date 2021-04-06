package ZPO.lab05.zadanie4;

public class Lanyard extends OrderDecorator {
    public Lanyard(OrderItem newItem) {
        super(newItem);
        System.out.println("Adding Lanyard");
    }

    public String getDescription(){
        return item.getDescription() + ", Lanyard";
    }

    public double getCost(){
        return item.getCost() + 1.00;
    }

}
