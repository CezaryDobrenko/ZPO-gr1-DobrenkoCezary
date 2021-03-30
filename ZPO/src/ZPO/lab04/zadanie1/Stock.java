package ZPO.lab04.zadanie1;

public class Stock {

    private String name = "VeryGoodStock";
    private int quantity = 10;

    public int buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
        return quantity;
    }
    public int sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
        return quantity;
    }
}