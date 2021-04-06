package ZPO.lab05.zadanie4;

public class Mascot extends OrderDecorator {
    public Mascot(OrderItem newItem) {
        super(newItem);
        System.out.println("Adding Mascot");
    }

    public String getDescription(){
        return item.getDescription() + ", Mascot";
    }

    public double getCost(){
        return item.getCost();
    }

}
