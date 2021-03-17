package ZPO.lab03.zadanie5;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        stock.addCompany("Google", 500.00);
        stock.addCompany("Apple", 450.00);
        stock.addCompany("Amazon", 400.00);
        stock.addCompany("IBM", 300.00);

        stock.changeCompanyValue("Google",600);

        StockObserver obs1 = new IndividualClient(stock, "Pablo", "Riviera", 5000.00);
        StockObserver obs2 = new IndividualClient(stock, "Juan", "Carlos", 7000.00);
        StockObserver obs3 = new MinisterFinance(stock, "Oscar", "Espinoza", 55000.00);
        StockObserver obs4 = new Bank(stock, "Federal Reserve Bank", 4213, 222500.00);

        stock.changeCompanyValue("Google", 1000);

        stock.addCompany("SpaceX", 1000000.00);

        stock.unregister(obs2);

        stock.changeCompanyValue("Apple", 500);

        stock.removeCompany("Apple");

        obs1.printPrices();

        System.out.println("\nAll posible cases when individual client buy actions:");
        obs1.buyStock(10000, "Google");
        obs1.buyStock(1,"Google");

        System.out.println("\nAll posible cases when minister of finance buy actions:");
        obs3.buyStock(10000, "Amazon");
        obs3.buyStock(1,"Amazon");

        System.out.println("\nAll posible cases when bank buy actions:");
        obs4.buyStock(10000, "IBM");
        obs4.buyStock(100,"IBM");
        obs4.buyStock(1,"IBM");

        System.out.println("\nAll users selling actions:");
        obs1.sellStock(5,"IBM");
        obs3.sellStock(15,"Google");
        obs4.sellStock(25,"IBM");

        System.out.println("\nMinister może sprawdzić jaka jest średnia cena za aukcję: ");
        obs1.printAverage();
        obs3.printAverage();
        obs4.printAverage();

    }
}
