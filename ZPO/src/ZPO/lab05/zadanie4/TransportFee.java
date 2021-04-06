package ZPO.lab05.zadanie4;


public class TransportFee extends OrderDecorator {
    public TransportFee(OrderItem newItem) {
        super(newItem);
        System.out.println("Adding Transport fee");
    }

    public String getDescription(){
        return item.getDescription() + ", transport fee";
    }

    public double getCost(){
        return item.getCost() + 13.00;
    }

}
