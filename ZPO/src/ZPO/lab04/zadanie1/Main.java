package ZPO.lab04.zadanie1;

import ZPO.lab04.zadanie3.Editor;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Statistics stats = new Statistics();

        BuyStockCommand buyStock = new BuyStockCommand(stock);
        SellStockCommand sellStock = new SellStockCommand(stock);

        Broker broker = new Broker();

        broker.AddStatistic(stats);

        broker.addOrder(buyStock);
        broker.addOrder(buyStock);
        broker.addOrder(sellStock);

        broker.finalizeOrders(1,2,5);

        broker.printStats();

        broker.addOrder(buyStock);
        broker.addOrder(sellStock);

        broker.finalizeOrders(3,3);

        broker.printStats();
    }
}
