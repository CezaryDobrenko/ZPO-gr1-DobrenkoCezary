package ZPO.lab04.zadanie1;

public class SellStockCommand implements Command {
    private Stock stock;

    public SellStockCommand(Stock stock){
        this.stock = stock;
    }

    public double execute(int... multiplayers) {
        double result = 0;
        int quality = stock.sell();
        for(int multiplayer: multiplayers)
            result += multiplayer * quality;
        return result;
    }
}