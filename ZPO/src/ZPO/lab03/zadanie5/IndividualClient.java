package ZPO.lab03.zadanie5;

public class IndividualClient extends StockObserver{
    private String surname;

    public IndividualClient(Subject stock, String name, String surname, Double balance){
        super(stock,name, balance);
        this.surname = surname;
        stock.register(this);
    }

    @Override
    public void buyStock(int amount, String company){
        double value = getValueByCompany(company);
        if(value * amount < this.getBalance()){
            System.out.println("I'm buying stock: Company " + company + " for each: " + value + " amount: " + amount + " total: " + (value*amount));
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
