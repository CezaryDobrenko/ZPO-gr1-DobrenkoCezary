package ZPO.lab04.zadanie1;

public class BuyStockCommand implements Command{
    private Stock stock;

    public BuyStockCommand(Stock stock){
        this.stock = stock;
    }

    public double execute(int... multiplayers) {
        double result = 0;
        int quality = stock.buy();
        for(int multiplayer: multiplayers)
            result += multiplayer * quality;
        return result;
    }
}
