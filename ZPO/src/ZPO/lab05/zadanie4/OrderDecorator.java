package ZPO.lab05.zadanie4;

public class OrderDecorator implements OrderItem {
    protected OrderItem item;

    public OrderDecorator(OrderItem item){
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getCost() {
        return item.getCost();
    }
}
