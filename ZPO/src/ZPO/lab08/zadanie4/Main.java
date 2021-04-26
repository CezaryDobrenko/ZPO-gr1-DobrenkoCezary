package ZPO.lab08.zadanie4;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new MargheritaPizza();
        pizza.prepare();

        System.out.println("-----------------");

        pizza = new SicilianPizza();
        pizza.prepare();
    }
}