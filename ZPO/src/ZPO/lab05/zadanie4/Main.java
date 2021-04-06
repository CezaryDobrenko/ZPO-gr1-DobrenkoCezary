package ZPO.lab05.zadanie4;

public class Main {
    public static void main(String[] args) {
        OrderDecorator baseOrder = new OrderBase(100);
        OrderDecorator orderMascot = new Mascot(baseOrder);
        OrderDecorator orderLanyard = new Lanyard(orderMascot);
        OrderDecorator orderDiscount = new Discount(orderLanyard);
        OrderDecorator FinalOrderWithFee = new TransportFee(orderDiscount);

        System.out.println("Order inclue: " + FinalOrderWithFee.getDescription());
        System.out.println("Order cost: " + FinalOrderWithFee.getCost());
    }
}
