package ZPO.lab03.zadanie5;

public class Bank extends StockObserver{
    private Integer uniqueIDNumber;

    public Bank(Subject stock, String name, Integer uniqueIDNumber, Double balance){
        super(stock,name,balance);
        this.uniqueIDNumber = uniqueIDNumber;
        stock.register(this);
    }

    @Override
    public void buyStock(int amount, String company){
        double value = getValueByCompany(company);
        if(amount * value > 10000 && amount * value < getBalance()){
            System.out.println("I'm buying stock: Company " + company + " for each: " + value + " amount: " + amount + " total: " + (value*amount));
        } else if (amount * value < 10000){
            System.out.println("You must me kidding, everything below 10000 is waste of time");
        } else {
            System.out.println("Its too expensive to me");
        }
    }

    @Override
    public void sellStock(int amount, String company){
        double value = getValueByCompany(company);
        System.out.println("I'm selling stock: Company " + company + " for each: " + value + " amount: " + amount + " total: " + (value*amount));
    }

    @Override
    public void printAverage(){
        System.out.println("Permission denied");
    }
}