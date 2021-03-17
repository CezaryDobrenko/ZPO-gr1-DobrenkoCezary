package ZPO.lab03.zadanie5;

import java.util.ArrayList;

public abstract class StockObserver implements Observer{

    private ArrayList<String> Companies = new ArrayList<String>();
    private ArrayList<Double> Values  = new ArrayList<Double>();

    private String name;
    private Subject stock;
    private Double balance;

    public StockObserver(Subject stock, String name, Double balance){
        this.stock = stock;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void update(ArrayList<String> Companies, ArrayList<Double>Values) {
        this.Companies = Companies;
        this.Values = Values;
        printPrices();
    }

    public ArrayList<Double> getValues(){
        return Values;
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getValueByCompany(String company){
        int index = Companies.indexOf(company);
        return Values.get(index);
    }

    public abstract void buyStock(int amount, String company);

    public abstract void sellStock(int amount, String company);

    public abstract void printAverage();

    public void printPrices(){
        System.out.println(name);
        System.out.println(Companies);
        System.out.println(Values);
        System.out.println();
    }
}
