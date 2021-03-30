package ZPO.lab04.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> orderList = new ArrayList<Command>();
    private Statistics stats = new Statistics();


    public void addOrder(Command order){
        orderList.add(order);
    }

    public void AddStatistic(Statistics stats){
        this.stats = stats;
    }

    public void printStats(){
        this.stats.printStats();
    }

    public void finalizeOrders(int ... multiplayers){
        int brokerSummary = 0;
        for (Command order : orderList) {
            brokerSummary += order.execute(multiplayers);
        }
        stats.addToStats(brokerSummary);
        orderList.clear();
    }
}